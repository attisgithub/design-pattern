package factorymethod.external3;

public class ParamSingleton {

	private String id;
	
	private ParamSingleton(String id){
		this.id = id;
	}
	
	public void doSomething(){
		System.out.println("id is: " + id);
	}
	
}
