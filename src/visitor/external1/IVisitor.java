package visitor.external1;

public interface IVisitor {
	public void visit(Developer developer);
	public void visit(Manager manager);
	public int toTotalSalary();
}
