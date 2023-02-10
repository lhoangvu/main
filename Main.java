package g08;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float a,b,c;
		System.out.println("Nhap a: ");
		a = in.nextFloat();
		System.out.println("Nhap b: ");
		b = in.nextFloat();
		System.out.println("Nhap c: ");
		c = in.nextFloat();
		v06.ptbac2(a, b, c);
	
		System.out.println("\nNhap gt: ");
		int gt = in.nextInt();
		System.out.printf("\nGiai thua cua %d: %d", gt, v06.giaithua(gt));
		System.out.println("\n nhap so fibo:	");
		int n=in.nextInt();
		System.out.printf("\n so fibo %d:	%d",n,v06.fibo(n));
		
		System.out.println("\nnhap a1: ");
		int a1=in.nextInt();
		System.out.println("\nnhap b1: ");
		int b1=in.nextInt();
		System.out.printf("\nUCLN %d %d:%d",a1,b1,v06.ucln(a1, b1));
		System.out.printf("\nUCLN %d %d:%d",a1,b1,v06.bcnn( a1, b1));
		
		System.out.println("\nnhap n: ");
		 n =in.nextInt();
		System.out.printf("\nso nguyen to nho hon %d :	",n);
		v06.lksnt(n);
	}
}
