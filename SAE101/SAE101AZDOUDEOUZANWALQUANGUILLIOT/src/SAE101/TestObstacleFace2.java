
package SAE101;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class TestObstacleFace2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		/*
		 * tester la detection d'obstacle face
		 */	
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		float[] value = new float[1];	
		float  x=(float) 0.9;
		
		while (x > 0.2) {
			
			sonar.getDistanceMode().fetchSample(value, 0);
			
			x= value[0];
			Robot20212022.AfficherUnmessageinst("" +x);
			Robot20212022.Avancer();			
					
		}	
		sonar.close();
		Robot20212022.Arreter();
		
		Robot20212022.AfficherUnmessage("Bonjour4");
		//Robot20192020.ReculerPendantAvecVitesse1(1000, 300);
		Robot20212022.FaireUnBip();

	}

}
