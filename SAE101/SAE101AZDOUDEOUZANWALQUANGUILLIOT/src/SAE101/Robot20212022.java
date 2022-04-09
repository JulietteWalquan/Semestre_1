package SAE101;

import lejos.robotics.Color;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.SampleProvider;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.DifferentialPilot;


import lejos.robotics.navigation.MovePilot;
///
import lejos.hardware.BrickFinder;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor; 
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode; 
import lejos.hardware.port.MotorPort; 
import lejos.hardware.port.SensorPort; 
import lejos.utility.Delay;
import lejos.utility.PilotProps;

/*
 * 01/octobre 2021
 * @ Author : Lahcen Oubahssi
 * Enseignant chercheur en informatique
 * IUT de LAVAL 
 * Departement Informatique 
 * Lahcen.oubahssi@univ-lemans.fr 
 * Cette  classe utilise la librairie de l'outil LeJOS EV3 afin de mettre en place 
 * un ensemble de methodes permettant de programmer les fonctionnalites de base pour le deplacement  
 * du robot  : avancer, reculer, tourner, arreter, afficher un message, effacer le message,  
 * attendre un appui sur un bouton, detecter une couleur, detecter un obstacle,jouer une musique, 
 * lancer un bip sonore...
 *  
 * --------Ces ressources sont libres, il faut seulement citer l'auteur---------
 * 
 * pour utiliser les methodes de cette classe, il suffit de creer une nouvelle classe, 
 * et faire appel a ces methodes dans la fonction main()
 * bien sur il faut avoir un robot EV3 + un Eclipse configure avec le plugin LeJOS EV3
 * pour les fcts de detection d'obstacle et de couleur, n'hesitez pas a configurer les valeurs des fonctions de detection de couleur,
 * car ca change d'un detecteur a un autre,  aussi par rapport a la luminosite 
 * 
 */
public class Robot20212022 {

	// Distance maximale pour la detaction d'obstacles
	private static int MAX_DISTANCE = 60;
	// Constance servant a detecter du son
	private static final int MIN_DB = 90;
	// Tableau d'entier correspondant aux notes de la musique Wiggle
	private static final int NOTE[] = { 220, 262, 330, 262, 247, 262, 247, 220 };
	// Tableau d'entier correspondant a la duree de chaque note de la musique Wiggle
	private static final int DELAY_NOTE[] = { 300, 300, 400, 350, 200, 400, 200, 700 };
	
	
	private static Wheel wheel1 =  WheeledChassis.modelWheel(Motor.B, 43.2).offset(-72);
	private static Wheel wheel2 = WheeledChassis.modelWheel(Motor.C, 43.2).offset(72);
	private static  Chassis chassis = new WheeledChassis(new Wheel[] { wheel1, wheel2 }, WheeledChassis.TYPE_DIFFERENTIAL);
    private static MovePilot pilot = new MovePilot(chassis);
    
	//private  static DifferentialPilot pilot= new DifferentialPilot(5.6F,2.6F,Motor.B,Motor.C);
	 
	 private static int lumiere = 0;
	
	
	//-------------Liste des fonctions --------------------
	
	 
	 
	// Afficher pendant 2s un message (passer en parametre) sur l'ecran du robot 
	public static void AfficherUnmessage(String msg) {
		//GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();
	//	g.drawString(msg, 0, 0, GraphicsLCD.VCENTER | GraphicsLCD.LEFT);		
	//	Delay.msDelay(5000);
		LCD.drawString(msg, 0, 0);
		Delay.msDelay(2000);
	}
	// Afficher un message passer en parametre sur l'ecran du robot
	public static void AfficherUnmessageinst(String msg) {
		//GraphicsLCD g = BrickFinder.getDefault().getGraphicsLCD();
	//	g.drawString(msg, 0, 0, GraphicsLCD.VCENTER | GraphicsLCD.LEFT);		
	//	Delay.msDelay(5000);
		LCD.drawString(msg, 0, 0);
		//Delay.msDelay(2000);
	}

	// Effacer le message de l'ecran du robot (a utiliser absolument si on
	// souhaite afficher un nouveau message)
	public static void Effacer() {		
		LCD.clear();
	}

	// Permet au robot d'attendre l'appuie sur un des boutons afin d'ex?cuter
	// d'autres instructions
	public static int Attendre() {
		return Button.waitForAnyPress();
	}
	
	// Le robot joue de la musique Wiggle de Jaosn Derulo dont les notes sont
		// stockees dans le tableau NOTE et les durees des notes sont stockees
		// dans le tableau DELAY_NOT avec le volume sonore maximum
		// le parametre nbrMusique designe le nombre de fois pour jouer cette meme musique
		// (En changeant les notes et la duree, vous pouvez donc parametrer votre propre musique)
	public static void JouerMusique(int nbrMusique) {
		Sound.setVolume(Sound.VOL_MAX);
		for (int i = 0; i < nbrMusique; i++) {
			for (int j = 0; j < NOTE.length; j++) {
				Sound.playNote(Sound.PIANO, NOTE[j] * 2, DELAY_NOTE[j]);
				FaireUnePause(20);
			}
		}

	}		
	// Faire avancer le robot(moteurs B et C = les roues du robot)
		public static void Avancer() {
			Motor.B.forward();					
			Motor.C.forward();
		}
		// Faire avancer le robot(moteurs B et C pour les roues) en utilisant le pilot
		// !!!! ne fonnctionne pas pas dans une boucle 
		public static void Avancer1() {
			pilot.forward();
		}
		
		
		// Faire une marche en arriere (moteurs B et C pour les roues)
	public static void Reculer() {
		Motor.B.backward();
		Motor.C.backward();
	}
	// Faire avancer le robot(moteurs B et C pour les roues) en utilisant le pilot
			// !!!! ne fonnctionne pas pas dans une boucle 
	public static void Reculer1() {
		pilot.backward();
	
	}
	//permet de choisir la vitesse des deux moteurs
		public static void ChoisirVitesse(int vitesse) {
			Motor.B.setSpeed(vitesse);
			Motor.C.setSpeed(vitesse);
		}	
		
		// Faire avancer le robot(moteurs B et C pour les roues), en specifiant la vitesse des deux moteurs
		public static void AvancerAvecVitesse(int vitesse) {
			ChoisirVitesse(vitesse);
			Motor.B.forward();
			Motor.C.forward();
		}
		
		// Faire avancer le robot(moteurs B et C pour les roues), en specifiant la vitesse des deux moteurs
		public static void AvancerAvecVitesse1(int vitesse) {
			pilot.setLinearSpeed(vitesse);
			pilot.forward();
		}
		
		// Faire une marche en arriere en specifiant la vitesse (moteurs B et C pour les roues)
	public static void ReculerAvecVitesse(int vitesse) {
		ChoisirVitesse(vitesse);
		Motor.B.backward();
		Motor.C.backward();	
		
	}	
	
	// Faire une marche en arriere en specifiant la vitesse (moteurs B et C pour les roues)
	// !!!! ne fonnctionne pas pas dans une boucle 
		public static void ReculerAvecVitesse1(int vitesse) {			
			pilot.setLinearSpeed(vitesse);
			pilot.backward();
			
		}		
		
		// Avancer le robot tout droit pendant un certain temps en specifiant sa vitesse		
		public static void AvancerPendantAvecVitesse(long time, int vitesse) {
			AvancerAvecVitesse(vitesse);
			FaireUnePause(time);
			Arreter();					
		}	
		// Avancer le robot tout droit pendant un certain temps en specifiant sa vitesse		
		public static void AvancerPendantAvecVitesse1(long time, int vitesse) {
			AvancerAvecVitesse1(vitesse);
			FaireUnePause(time);
			Arreter1();					
		}	

		// Recule le robot tout droit pendant un certain temps en specifiant sa vitesse		
	public static void ReculerPendantAvecVitesse(long time, int vitesse) {
		ReculerAvecVitesse(vitesse);
		FaireUnePause(time);
		Arreter();
		}
	// Recule le robot tout droit pendant un certain temps en specifiant sa vitesse		
		public static void ReculerPendantAvecVitesse1(long time, int vitesse) {
			ReculerAvecVitesse1(vitesse);
			FaireUnePause(time);
			Arreter1();
			}
		
		//Avancer d'une distance
	// il faut mettre la distance comme valeur positive pour avancer le robot
	public static void AvancerUneDistance1 (long distance) {
		pilot.travel(distance);
				
	}
	//Reculer d'une distance
	// il faut mettre la distance comme valeur positive pour avancer le robot
	public static void ReculerUneDistance1 (long distance) {
		pilot.travel(-distance);
					
		}
		
		// Reculer le robot tout droit sur une distance en specifiant sa vitesse	
	// il faut mettre la distance comme valeur positive pour avancer le robot
	public static void ReculerDistanceAvecVitesse1(long distance, int vitesse) {
		pilot.setLinearSpeed(vitesse);
		pilot.travel(-distance);			
			
	}
	
		// Avancer le robot tout droit sur une distance en specifiant sa vitesse
				// il faut mettre la distance comme valeur positive pour avancer le robot
	public static void AvancerDistanceAvecVitesse1(long distance, int vitesse) {		
		pilot.setLinearSpeed(vitesse);
		pilot.travel(distance);
		
					
	}	
	//permet de vérifier si le robot est en mouvement 
	public static boolean RobotisMoving() {		
		return (pilot.isMoving());
		
		
					
	}	
	
		// i = l'agle de rotation	 
	public static void FaireUneRotationAGauche (int i){
		pilot.rotate(-i);					
	}
	
	// i = l'agle de rotation
	public static void FaireUneRotationADroite (int i){
		pilot.rotate(i);	
		
	}
	


	// avancer le robot en choisissant le moteur ? faire fonctionner (A : moteur
	// du bras; B : moteur de la roue droite; C : moteur de la roue gauche)
	public static void Avancer(String moteur) {
		if (moteur.equals("A")) {
			Motor.A.forward();
		}
		if (moteur.equals("B")) {
			Motor.B.forward();
		}
		if (moteur.equals("C")) {
			Motor.C.forward();
		}
	}	

	
	

	// Reculer le robot en spacifiant le moteur (A : moteur du bras; B : moteur
	// de la roue droite; C : moteur de la roue gauche)
	public static void Reculer(String moteur) {
		if (moteur.equals("A")) {
			Motor.A.backward();
		}
		if (moteur.equals("B")) {
			Motor.B.backward();
		}
		if (moteur.equals("C")) {
			Motor.C.backward();
		}
	}	

	// Faire un demi tour sur place en choisissant la vitesse (param?tre speed)
	// et l'angle de rotation (param?tre degres)
	// degres = 720 : 180 => Tourner ? gauche
	// degres = -720 : -180 => Tourner ? droite
	public static void Tourner(String moteur, int speed, int degres) {
		if (moteur.equals("A")) {
			Motor.A.setSpeed(speed);
			Motor.A.rotate(degres);
			Motor.A.stop();
		}
		if (moteur.equals("B")) {
			Motor.B.setSpeed(speed);
			Motor.B.rotate(degres);
			Motor.B.stop();
		}
		if (moteur.equals("C")) {
			Motor.C.setSpeed(speed);
			Motor.C.rotate(degres);
			Motor.C.stop();
		}
	}
	
	
		// Faire une pause pendant un temps donne en millisecondes
	public static void FaireUnePause(long time) {
		try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	// Arreter le robot
	public static void Arreter() {
		Motor.A.stop();
		Motor.B.stop();
		Motor.C.stop();
	}	
	
	public static void Arreter1() {
		pilot.stop();
	}	
	// Lancer un bip sonore
		public static void FaireUnBip() {
			Sound.beepSequence();
		}		
		
	//Fonction  de type chaine qui permet de retourner le nom de la couleur
		public static String Namecolor(int colorId){
			String colorName;
			switch(colorId){
			case Color.NONE: colorName = "NONE"; break;
			case Color.BLACK: colorName = "BLACK"; break;
			case Color.BLUE: colorName = "BLUE"; break;
			case Color.GREEN: colorName = "GREEN"; break;
			case Color.YELLOW: colorName = "YELLOW"; break;
			case Color.RED: colorName = "RED"; break;
			case Color.WHITE: colorName = "WHITE"; break;
			case Color.BROWN: colorName = "BROWN"; break;
			//je ne suis pas sur que le gris fonctionne  bien ==> à tester
			case Color.LIGHT_GRAY: colorName = "Grey"; break;
			default:
				colorName="no color";
					break;
			}
		return colorName;
		}
		//Fonction de type entier qui permet de retourner le numero de la couleur
		public static int IDcolor(int Id){
			int Ncolor;
			switch(Id){
			case Color.NONE: Ncolor = Color.NONE; break; //colorName = "NONE;
			case Color.BLACK: Ncolor = Color.BLACK; break; //colorName = "BLACK";
			case Color.BLUE: Ncolor = Color.BLUE; break; //colorName = "BLUE";
			case Color.GREEN: Ncolor = Color.GREEN; break; //colorName = "GREEN";;
			case Color.YELLOW: Ncolor = Color.YELLOW; break; //colorName = "YELLOW";
			case Color.RED: Ncolor = Color.RED; break; //colorName = "RED"
			case Color.WHITE: Ncolor = Color.WHITE; break; //colorName = "WHITE";
			case Color.BROWN: Ncolor =Color.BROWN; break; //:colorName = "BROWN";
			//je suis pas sur que le gris marche dans le doute soit faire un test soi ne pas s'en servire
			case Color.LIGHT_GRAY: Ncolor = Color.LIGHT_GRAY; break; //Color.LIGHT_GRAY: colorName = "Grey"
			default:
				Ncolor=120;
					break;
			}
		return Ncolor;
		}



	
	
	
	
	
	

}