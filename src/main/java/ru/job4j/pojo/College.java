package ru.job4j.pojo;

public class College {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Ivan");
		student.setSurname("Petrov");
		student.setPatronymic("Nikolaevich");
		student.setGroup("CS101");

		System.out.println("Name: " + student.getName());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Patronymic: " + student.getPatronymic());
		System.out.println("Group: " + student.getGroup());
	}
}
