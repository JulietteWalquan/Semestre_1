package exercices;

public class td2exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrice1 = {{1,2,1},{0,1,3},{2,-1,1}};
		int[][] matrice2 = {{1,1,2},{1,-1,2},{2,0,1}};
		int n = 3;
		int[][] matrice3 = new int[n][n];
		int i, j, k;
		
		for (i=0;i<n;i++){
			for (j=0;j<n;j++){
				matrice3[i][j] = 0;
				for (k=0;k<n;k++){
					matrice3[i][j] = matrice3[i][j] + (matrice1[i][k]*matrice2[k][j]);
				}
			}
		}
		
		for (int l=0;l<n;l++){
			for (int h=0;h<n;h++){
				System.out.println(matrice3[l][h]);
			}
		}
	}

}
