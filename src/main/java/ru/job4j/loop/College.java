package ru.job4j.loop;

public class College {
	public static void main(String[] args) {
		Freshmen freshmen = new Freshmen();
        Student freshManFromStudent = (Student) freshmen; 
        Object freshManFromObject = (Object) freshManFromStudent; 
        System.out.println("объект приведен к типу Object: " + freshManFromObject);
	}
}
