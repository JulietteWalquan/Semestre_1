package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class testDetecterCouleurN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * tester la  d�tection de couleur Noir en utilisant getMode
		 */		
		
		EV3ColorSensor sensor4 = new EV3ColorSensor(SensorPort.S3);	
		SampleProvider light4= sensor4.getMode("Red");	
		float sample4[] = new float[light4.sampleSize()];
			
		float  x=(float) 0.2;
		while (x > 0.06) {
			light4.fetchSample(sample4, 0);
			x= sample4[0];			
			Robot20212022.AfficherUnmessageinst("" +x);
			Robot20212022.Avancer();
			
		}
		Robot20212022.Arreter();	
		sensor4.close();
			
		Robot20212022.AfficherUnmessage("Bonjour5");
		Robot20212022.FaireUnBip();

	}

}
