import java.util.ArrayList;
public class classs12 {
	public static void main(String[] args){
		//elements can be removed or added after compilation
		
		ArrayList<String> sai= new ArrayList<String>();
		sai.add("sai");
		sai.add("ankam");
		sai.add("rajaiah");
		sai.set(1,"teja");
		sai.remove(0);
		sai.clear();
		
		
		for (int i=0;i<sai.size();i++){
			System.out.print(sai.get(i)+" ");
		}
		
	}

}
