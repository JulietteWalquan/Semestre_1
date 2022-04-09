package SAE101;


import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.Color;
import lejos.robotics.SampleProvider;

public class TestDetectColorAvecNamColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ce petit programme permet de deteter la couleur noir en utilisant la fct Namecolor
		
		EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];
	//	color.fetchSample(sample, 0);
		sample[0]=119;
		
		while ((Robot20212022.Namecolor((int) sample[0]).equals("BLACK")==false)) {					
			Robot20212022.AfficherUnmessageinst(Robot20212022.Namecolor((int) sample[0]));
			Robot20212022.Avancer();
			color.fetchSample(sample, 0);	
		}
		
		Robot20212022.Arreter();
		colorSensor.close();
		Robot20212022.AfficherUnmessage("Bonjour5");
		Robot20212022.FaireUnBip();
	}
	

}
