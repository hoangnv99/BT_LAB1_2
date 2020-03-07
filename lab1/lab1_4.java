import java.util.Scanner;

public class lab1_4{
   public static void main (String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.print("Nhap Vao He So Phuong Trinh Bac 2 ax^2+bx+c=0: ");
	System.out.print("a = ");
	int a = input.nextInt();
	System.out.print("b = ");
	int b = input.nextInt();
	System.out.print("c = ");
	int c = input.nextInt();
	int delta = b*b - 4*a*c;
	System.out.println("Can cua delta = "+Math.sqrt(delta));
   }
}