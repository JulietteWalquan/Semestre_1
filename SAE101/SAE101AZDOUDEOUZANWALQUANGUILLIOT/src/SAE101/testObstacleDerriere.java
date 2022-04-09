package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorMode;


public class testObstacleDerriere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3TouchSensor touchSensor1 = new EV3TouchSensor(SensorPort.S1); 
		   SensorMode touch1 = touchSensor1.getTouchMode();
		   float[] sample = new float[touch1.sampleSize()];	
			Robot20212022.AfficherUnmessage("Bonjour1");
		
			//boolean marche = true;
			Robot20212022.ReculerAvecVitesse(30);
			
		do {
			touch1.fetchSample(sample, 0);				
					
		}while (sample[0] == 0);
		touchSensor1.close();
		Robot20212022.Arreter1();
		Robot20212022.AfficherUnmessage("Bonjour4");
		Robot20212022.FaireUnBip();
		
	}

}
