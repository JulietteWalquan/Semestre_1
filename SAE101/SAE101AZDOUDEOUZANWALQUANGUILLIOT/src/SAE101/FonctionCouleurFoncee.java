package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class FonctionCouleurFoncee {

	public static boolean detectionCouleurFoncee() {
		// TODO Auto-generated method stub

		boolean present;
		
		EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];
		sample[0] = 119;
		
		if(Robot20212022.Namecolor((int) sample[0]).equals("BLACK")==true){
			present = true;
		}
		else {
			present = false;
		}
		
		colorSensor.close();
		
		return(present);
	}

}