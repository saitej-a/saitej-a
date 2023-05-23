import java.util.Scanner;
public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your age : ");
		Scanner sai = new Scanner(System.in);
		int age = sai.nextInt();
		if (age>=18 && age<50){
			System.out.println("you are an adult ");
		}
else if (age==0){
			
			System.out.println("u are not born yet :-)");
		}
		else if (age<18){
			System.out.println("you are minor");
		}
		
		
		else{
			System.out.println("you are old");
		}
		sai.close();

	}

}
