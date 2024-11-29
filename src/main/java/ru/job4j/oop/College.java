package ru.job4j.oop;

public class College {
	public static void main(String[] args) {
		Freshmen freshmen = new Freshmen();
		Student freshManFromStudent = freshmen;
		Object freshManFromObject = freshManFromStudent;
		System.out.println("объект приведен к типу Object: " + freshManFromObject);
	}
}
