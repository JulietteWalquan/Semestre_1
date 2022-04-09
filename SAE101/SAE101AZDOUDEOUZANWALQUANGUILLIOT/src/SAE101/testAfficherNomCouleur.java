
package SAE101;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.Color;

public class testAfficherNomCouleur {
	public static void main(String[] args){
		// objectif : idetifier les noms des couleurs et leur Id
		EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
		SensorMode color = colorSensor.getColorIDMode();
		float[] sample = new float[color.sampleSize()];
		color.fetchSample(sample, 0);
		int colorId = (int)sample[0];
		String colorName;
		colorName=Robot20212022.Namecolor(colorId);
		Robot20212022.AfficherUnmessage(colorId + " - " + colorName);
		colorSensor.close();
		Robot20212022.Attendre();
	}
}
