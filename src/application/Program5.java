package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program5 {

	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Emplyoee #" + i + ":");
			System.out.println();
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("salary: ");
			double salary = sc.nextDouble();
			boolean validate = true;

			Employee teste = list.stream().filter(x -> x.getId() == id).findAny().orElse(null);
			if (teste != null) {
				validate = false;
			}

			if (validate == true) {
				Employee emp = new Employee(id, name, salary);
				list.add(emp);
			} else {
				sc.close();
				throw new Exception("error!!!");
			}

		}
		System.out.println();

		System.out.print("Enter the employee id that will have salary increase : ");
		int idSearch = sc.nextInt();

		Employee newNemp = list.stream().filter(x -> x.getId() == idSearch).findAny().orElse(null);
		if (newNemp == null) {
			System.out.println("Id does not exist");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			newNemp.salaryIncreased(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

}
