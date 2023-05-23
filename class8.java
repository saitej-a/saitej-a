import java.util.Scanner;
public class class8 {
	public static void main(String[] args){
		//nested loops = lopps inside a loop;
		Scanner sai = new Scanner(System.in);
		System.out.println("enter rows");
		
		
		int rows = sai.nextInt();
		System.out.println("enter columns : ");
		int columns = sai.nextInt();
		Scanner sai1 = new Scanner(System.in);
		System.out.println("enter symbol : ");
		String sym = sai1.nextLine();
		
		for(int i=1;i<=rows;i++){
			System.out.println();
			for (int j=1;j<=columns;j++){
				System.out.print(sym);
			}
		}
		
		
		
	}

}
