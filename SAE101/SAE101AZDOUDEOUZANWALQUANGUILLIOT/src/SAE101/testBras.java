package SAE101;

public class testBras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		
		Robot20212022.AvancerUneDistance1(10);
		Robot20212022.FaireUnePause(1000);
		
		for(i=0;i<30;i++) {
			Robot20212022.Reculer("A");
		}
		
		Robot20212022.FaireUnePause(1000);
		
		for(i=0;i<7000;i++) {
			Robot20212022.Avancer("A");
		}
		
		
		Robot20212022.FaireUnePause(1000);
		Robot20212022.AvancerUneDistance1(20);
		Robot20212022.FaireUneRotationADroite(45);
		Robot20212022.ReculerUneDistance1(50);
		Robot20212022.FaireUnePause(1000);
		
		for(i=0;i<5000;i++) {
			Robot20212022.Reculer("A");
		}
	}

}
