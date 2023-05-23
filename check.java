import java.util.Scanner;


public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		double z;
		Scanner sai = new Scanner(System.in);
		System.out.println("enter x : ");
		
		x = sai.nextFloat();
		System.out.println("enter y : ");
		y = sai.nextFloat();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("z = "+z);
		sai.close();

	}

}
