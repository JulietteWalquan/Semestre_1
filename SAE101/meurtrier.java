package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;

public class meurtrier {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// attente du policier
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		float[] value = new float[1];	
		float  x=(float) 0.9;
		
		while(x > 0.50){     // reste statique tant qu'il ne détecte pas l'autre à moins de 50cm de lui
			sonar.getDistanceMode().fetchSample(value, 0);
			x=value[0];
			
			Robot20212022.AfficherUnmessageinst("" +x);
			Robot20212022.Arreter1();	
		}
		
		// menace du policier avec un couteau
		do{                 // avance d'une certaine vitesse tant que l'autre robot est à plus de 30cm de lui
			sonar.getDistanceMode().fetchSample(value, 0);
			x=value[0];
			
			Robot20212022.AfficherUnmessageinst("" +x);
			Robot20212022.AvancerAvecVitesse(100); //distance à déterminer
		}while(x>0.30);
		sonar.close();		
		
		// fuite du meurtrier
		EV3UltrasonicSensor sonar2 = new EV3UltrasonicSensor(SensorPort.S4);
		float[] value2 = new float[1];	
		float  x2=(float) 0.9;
		
		EV3TouchSensor touchSensor1 = new EV3TouchSensor(SensorPort.S1); 
		SensorMode touch1 = touchSensor1.getTouchMode();
		float[] sample = new float[touch1.sampleSize()];
		
		while(x2 > 0.2){      // recule d'une certaine vitesse jusqu'à ce qu'il détecte un obstacle derrière lui
			
			sonar2.getDistanceMode().fetchSample(value2, 0);
			
			x2= value2[0];
			Robot20212022.AfficherUnmessageinst("" +x2);
			Robot20212022.ReculerAvecVitesse(100);
			
			do{
				touch1.fetchSample(sample, 0);
			}while (sample[0] == 0);
			
			sonar2.close(); 
			touchSensor1.close();
			Robot20212022.Arreter1();
		}
	}

}
