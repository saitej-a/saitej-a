import java.util.Random;


public class Diceroller {
	Random random;
	int n;
	Diceroller(){
		Random random = new Random();
		roll(n,random);
		
		
	}
	void roll(int n,Random random){
		n=random.nextInt(6)+1;
		System.out.println(n);
	}

}
