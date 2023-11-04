package com.infosys.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	Employee e1 = new Employee("ola",25000.00);
	Employee e2 = new Employee("ola1",25090.00);
	Employee e3 = new Employee("ola2",35000.00);
	Employee e4 = new Employee("ola3",22000.00);
	
	List<Employee> list = new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	System.out.println(list.stream().sorted(Comparator.comparingDouble(emp->emp.getSalary())).toList());
}
}
