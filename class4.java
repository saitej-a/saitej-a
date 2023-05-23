import java.util.Scanner;
public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sai = new Scanner (System.in);
		System.out.println("enter the day : ");
		String day = sai.nextLine();
		switch (day){
		case "sunday" : System.out.println("it is sunday");
		break;
		case "monday" : System.out.println("it is monday");
		break;
		case "tuesday" : System.out.println("it is tuesday");
		break;
		case "wednesday" : System.out.println("it is wednesday");
		break;
		case "thursday" : System.out.println("it is thursday");
		break;
		case "friday" : System.out.println("it is friday");
		break;
		case "saturday" : System.out.println("it is saturday");
		break;
		default : System.out.println("that is not a day");
		
		}

	}

}
