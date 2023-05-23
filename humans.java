
public class humans {
	String name;
	int age;
	boolean Alive;
	humans(String name,int age,boolean Alive){
		this.name=name;
		this.age=age;
		this.Alive=Alive;
		
	}
	String toString(){
		return this.name+"\n"+this.age+"\n"+this.Alive;
	}

}
