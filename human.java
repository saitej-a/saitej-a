public class human{
	String name;
	int age;
	double weight;
	human(String name,int age,double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
		
		
	}
	
	void alive(){
		System.out.println(this.name+" is alive");
	}
	
	void dead(){
		System.out.println(this.name+" is dead");
	}
}
