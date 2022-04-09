package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.Color;
import lejos.robotics.SampleProvider;

public class testCouleur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean present;
		String message;
		
		EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];
		sample[0] = 119;
		
		if(Robot20212022.Namecolor((int) sample[0]).equals("BLACK")==true){
			present = true;
			message = "sombre";
		}
		else {
			present = false;
			message = "clair";
		}
		
		colorSensor.close();
		
		Robot20212022.AfficherUnmessage(message);
	}

}
