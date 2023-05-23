import java.util.ArrayList;


public class class22 {
	public static void main(String[] args){
		Food food1=new Food("pizza");
		Food food2=new Food("burger");
		Food food3=new Food("sauce");
		/*Food[] re=new Food[3];
		re[0]=food1;
		re[1]=food2;
		re[2]=food3;
		*/
		//Food[] re={food1,food2,food3};
		ArrayList<Food> re=new ArrayList<Food>();
		re.add(food1);
		re.add(food2);
		re.add(food3);
		
		
		for(Food i : re){
			System.out.println(i.name);
		}
		
	}

}
