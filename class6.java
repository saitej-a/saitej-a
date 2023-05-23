import java.util.Scanner;
public class class6 {
	public static void main(String[] args){
		Scanner sai = new Scanner(System.in);
		String name = "";
		while(name.isEmpty()){
			System.out.println("entr your name ? ");
			name = sai.nextLine();
			
		}
		System.out.println("hello mr."+name);
		
	
	
	}

}
