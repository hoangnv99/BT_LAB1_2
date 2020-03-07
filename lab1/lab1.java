import java.util.Scanner;
public class lab1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("nhap ho ten  : ");
		String fullname1 = input.nextLine();
		System.out.println("nhap diem  : ");
		double diem = input.nextDouble();
		System.out.println();
		System.out.print("Ho ten : "+fullname1);
		System.out.println(" Diem : "+diem);
	}
}