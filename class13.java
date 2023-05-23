
import java.util.*;

public class class13 {
	public static void main(String[] args){
		
		
		
		ArrayList<String> veg = new ArrayList<String>();
		veg.add("tomato");
		veg.add("munchuria");
		veg.add("roots");
		
		
		ArrayList<String> nonveg = new ArrayList<String>();
		nonveg.add("chicken");
		nonveg.add("mutton");
		nonveg.add("fish");
		
		ArrayList<String> raw = new ArrayList<String>();
		raw.add("potato");
		raw.add("bitroot");
		raw.add("onions");
		
		ArrayList<String> dishes = new ArrayList<String>();
		dishes.add("noodles");
		dishes.add("biryani");
		dishes.add("france");
		
		/*ArrayList<ArrayList<String>> food = new ArrayList<String>();
		food.add(veg);
		food.add(nonveg);
		food.add(raw);
		food.add(dishes);
		*/
		
		
		
		//for -each loop
		
		for (String i : veg){
			System.out.print(i+" ");
		}
		
	}

}
