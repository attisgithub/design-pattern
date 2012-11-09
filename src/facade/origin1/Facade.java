package facade.origin1;

public class Facade {
	private ClassA classA = new ClassA();
	private ClassB classB = new ClassB();
	private ClassC classC = new ClassC();
	
	public void methodA(){
		classA.doSomethingA();
	}
	
	public void methodB(){
		classB.doSomethingB();
	}
	
	public void methodC(){
		classC.doSomethingC();
	}
}
