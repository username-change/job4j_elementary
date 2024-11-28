package ru.job4j.polymorphism;

public class Bus implements Transport {

	@Override
	public void move() {
		System.out.println("автобус тронулся");
	}

	@Override
	public void passengers(int count) {
		System.out.println("количество пассажиров: " + count);
	}

	@Override
	public int refuel(int fuel) {
		System.out.println("заправлено " + fuel + " литров.");
		return fuel;
	}

}
