
public class hero extends humans {
	boolean jumo=true;
	hero(String name,int age,boolean b,boolean jumo){
		super(name,age,b);
		this.jumo=jumo;
		
		
	}
	String toString(){
		return super.name+"\n"+super.age+"\n"+super.Alive+"\n"+jumo;
	}

}
