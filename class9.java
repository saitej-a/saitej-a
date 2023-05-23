
public class class9 {
	public static void main(String[] args){
		// array = used to store multiple data in a single variable
		/*String[] cars= {"supra","mustang","gtr"};
		cars[0]="sai";
		for (int i=0;i<=2;i++){
			System.out.println(cars[i]);
		}*/
		
		//memory allocating = 
		String[] cars = new String[3];
		cars[0]="supra";
		cars[1]="mustang";
		cars[2]="GTR";
		for (int i=0;i<cars.length;i++){
			System.out.println(cars[i]);
		}
		
		
	}

}
