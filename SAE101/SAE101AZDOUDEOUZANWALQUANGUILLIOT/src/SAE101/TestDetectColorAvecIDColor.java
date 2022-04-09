package SAE101;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.Color;

public class TestDetectColorAvecIDColor {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
				EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
				SensorMode color = colorSensor.getColorIDMode();
				float[] sample = new float[color.sampleSize()];
		//	color.fetchSample(sample, 0);
				sample[0]=1;
				
				while ((Robot20212022.IDcolor(((int) sample[0])) <7)) {					
					Robot20212022.AfficherUnmessageinst(" "+Robot20212022.IDcolor((int) sample[0]));
					Robot20212022.Avancer1();
					color.fetchSample(sample, 0);	
				}
				
				Robot20212022.Arreter();
				colorSensor.close();
				Robot20212022.AfficherUnmessageinst(" final ID= "+Robot20212022.IDcolor(((int) sample[0])));
				//Robot20192020.AfficherUnmessage("Bonjour5");
				Robot20212022.FaireUnBip();
				
				
				
	}
}


