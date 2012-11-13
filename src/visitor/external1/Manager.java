package visitor.external1;

public class Manager extends Employee{

	private int salary;
	
	private int bonus;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
