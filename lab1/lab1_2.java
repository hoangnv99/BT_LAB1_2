import java.util.Scanner;

public class lab1_2{
   public static void main (String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.print("Nhap Vao Chieu Dai HCN: ");
	int dai = input.nextInt();
	System.out.print("Nhap Vao Chieu Rong HCN: ");
	int rong = input.nextInt();
	int chuvi = dai + rong;
	int s = dai*rong;
	System.out.println("Chu vi = "+chuvi);
	System.out.println("Dien Tich = "+s);
	System.out.println("Canh be nhat = "+Math.min(dai,rong));
   }
}