
public class TwistInTaleLogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 40;
		System.out.println(a++ > 10 || ++b < 30);
		System.out.println(a > 90 && ++b < 30);
		System.out.println(!(c>20) && a==10 );
		System.out.println(a >= 99 || a <= 33 && b == 10);
		System.out.println(a >= 99 && a <= 33 || b == 10);
		int int1 = 10, int2 = 20, int3 = 30;
		System.out.println(int1 % int2 * int3 + int1 / int2);
		int a1 = 10;
		int b1= 20;
		int c1 = (a1 * (b1 + 2)) - 10-4 * ((2*2) - 6);
		System.out.println(c);
	}

}
