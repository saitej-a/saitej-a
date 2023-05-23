import java.util.Scanner;
public class class14 {
	public static void main(String[] args){
		Scanner sai = new Scanner(System.in);
		System.out.print("enter your name...?");
		String name= sai.nextLine();
		name(name);
		
	}
	public static void name(String n){
		System.out.println("hello "+n);
	}

}
