                                                             package TD4;

public class exo11 {

	public static void Permutation(float a,float b,float c) {
		// TODO Auto-generated method stub

		float d;
		
		if(a>b){
			d=b;
			b=a;
			a=d;
		}
		if(b>c){
			d=c;
			c=b;
			b=d;
		}
		if(a>b){
			d=b;
			b=a;
			a=d;
		}
	}

}
