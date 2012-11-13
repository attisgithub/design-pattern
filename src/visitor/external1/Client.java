package visitor.external1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Visitor visitor = new Visitor();

		List<Employee> list = composeEmployee();

		for (Employee emp : list) {
			emp.accept(visitor);
		}

		System.out.println(visitor.toTotalSalary());

	}

	public static List<Employee> composeEmployee() {

		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			int num = rand.nextInt(2);
			if (num == 1) {
				Employee developer = new Developer();
				list.add(developer);
			} else {
				Employee manager = new Manager();
				list.add(manager);
			}
		}

		return list;
	}
}
