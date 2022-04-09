package SAE101;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;



public class ExempleScenario2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
				//@ Lahcen Oubahssi ( lahcen.oubahssi@univ-lemans.fr)
				 * Etape 0 du scenario :  ne pas casser le robot
				 */

				// Afficher un message et attendre l'appuie sur un bouton avant de commencer le parcours
				Robot20212022.AfficherUnmessage("Projet 20212022");
				Robot20212022.Attendre();

				/*
				 * etape 1 du scenario : tester les fonctionnalités Afficher, Attendre,
				 */
				// Avancer
				Robot20212022.Avancer("B");
				Robot20212022.Avancer("C");
				Robot20212022.Attendre();
				// Reculer
				Robot20212022.Reculer("B");
				Robot20212022.Reculer("C");
				Robot20212022.Attendre();
				Robot20212022.Arreter();

				/*
				 * Etape 2 du scenario : tester la fonctionnalite de la detection
				 * d'obstacle 
				 */

				Robot20212022.Avancer("B");
				Robot20212022.Avancer("C");
				
				
				
				
				EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
				float[] value = new float[1];	
				sonar.getDistanceMode().fetchSample(value, 0);
				double  x=0.9;
						
				do {
					x= value[0];
					Robot20212022.AfficherUnmessageinst("" +x);
					Robot20212022.Avancer1();			
							
				}while (value[0] > 0.8);
				sonar.close();
				Robot20212022.Arreter();	
				/*
				 *  changement d'etape  			 
				 *  
				*/
									
				Robot20212022.JouerMusique(1);
				Robot20212022.Attendre();	
				Robot20212022.Avancer1();
				

				/*
				 * Etape 3 du scenario : tester la fonctionnalite de detection de
				 * couleur
				 */

				
				
				EV3ColorSensor sensor4 = new EV3ColorSensor(SensorPort.S3);	
				SampleProvider light4= sensor4.getMode("Red");	
				float sample4[] = new float[light4.sampleSize()];
					
				float  y=(float) 0.2;
				while (y > 0.06) {
					light4.fetchSample(sample4, 0);	
					y= sample4[0];			
					Robot20212022.AfficherUnmessageinst("" +y);
					Robot20212022.Avancer1();
					
				}
				sensor4.close();
				// arrete le robot
				Robot20212022.Arreter();
				// le robot fait une rotation
				Robot20212022.Tourner("B", 120, 90);
				// le robot joue la musique
					Robot20212022.JouerMusique(1);
					//le robot affiche le message fin parcours
				Robot20212022.AfficherUnmessage("Fin parcours");
	}

}