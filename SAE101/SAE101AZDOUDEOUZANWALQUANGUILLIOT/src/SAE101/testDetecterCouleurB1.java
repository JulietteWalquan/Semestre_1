package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class testDetecterCouleurB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * tester la d�tection de couleur Blanche en utilisant getMode
		 */		
		
		EV3ColorSensor sensor4 = new EV3ColorSensor(SensorPort.S3);	
		//SampleProvider light= sensor3.getMode("Ambient");	
		SampleProvider light4= sensor4.getMode("Red");	
		float sample4[] = new float[light4.sampleSize()];
		double x = 0.4;
		Robot20212022.AfficherUnmessage("Bonjour1");
		   Robot20212022.Attendre();
		while (x < 0.5) {
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
