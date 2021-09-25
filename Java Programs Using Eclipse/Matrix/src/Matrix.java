
public class Matrix {

	public static void main(String[] args) {
		int x[][]= {
				   {10,20,30,40},
				   {50,60,70,80},
				   {90,100,110,120}
				   };
		System.out.println("In Matrix Form");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
