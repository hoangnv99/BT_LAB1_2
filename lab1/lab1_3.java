import java.util.Scanner;

public class lab1_3{
   public static void main (String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.print("Nhap Vao Canh HLP : ");
	int canh = input.nextInt();
	System.out.println("The Tich HLP = "+Math.pow(canh,3));
   }
}