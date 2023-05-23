
public class class10 {
	public static void main(String[] args){
		//2d array = array of arrays
		String[][] cars = new String[2][2];
		cars[0][0]="supra";
		cars[0][1]="mustang";
		cars[1][0]="GTR";
		cars[1][1]="RR";
		
		for(int i=0;i<cars.length;i++){
			System.out.println();
			for(int j=0;j<cars[i].length ;j++){
				System.out.print(cars[i][j]+" ");
				
			}
		}
	}

}
