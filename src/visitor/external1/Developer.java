package visitor.external1;

public class Developer extends Employee {

	private int salary;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
