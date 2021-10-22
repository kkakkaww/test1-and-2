import java.util.Scanner;
public class f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double average = (n1 + n2 + n3)/3;
		System.out.println("The average of "+n1+" "+n2+" "+n3+" is "+average);
	}

}
