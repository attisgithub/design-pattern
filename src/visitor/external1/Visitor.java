package visitor.external1;

public class Visitor implements IVisitor {

	private int developerSalary;
	
	private int managerSalary;
	
	@Override
	public void visit(Developer developer) {
		developerSalary += developer.getSalary();
	}

	@Override
	public void visit(Manager manager) {
		managerSalary += manager.getSalary() + manager.getBonus();
	}
	
	public int toTotalSalary(){
		return this.developerSalary + this.managerSalary;
	}

}
