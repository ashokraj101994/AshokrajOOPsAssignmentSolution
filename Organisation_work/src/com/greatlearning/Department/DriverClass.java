package com.greatlearning.Department;

public class DriverClass {

	public static void main(String[] args) {
		SuperDepartment obj1 = new SuperDepartment();
		AdminDepartment obj2 = new AdminDepartment();
		HrDepartment obj3 = new HrDepartment();
		TechDepartment obj4 = new TechDepartment();

		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAholiday());
		System.out.println(" ");

		System.out.println(obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAholiday());
		System.out.println(" ");

		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.doActivity());
		System.out.println(obj3.isTodayAholiday());
		System.out.println(" ");

		System.out.println(obj4.departmentName());
		System.out.println(obj4.getTodaysWork());
		System.out.println(obj4.getWorkDeadline());
		System.out.println(obj4.getTechStackInformation());
		System.out.println(obj4.isTodayAholiday());

	}

}
