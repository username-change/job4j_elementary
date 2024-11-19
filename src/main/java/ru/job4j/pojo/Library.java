package ru.job4j.pojo;

public class Library {
	public static void main(String[] args) {
		Book theHobbit = new Book("The Hobbit", 12);
		Book theHungerGames = new Book("The Hunger Games", 2);
		Book dune = new Book("Dune", 5);
		Book cleanCode = new Book("Clean Code", 2);
		Book[] books = new Book[4];
		books[0] = theHobbit;
		books[1] = theHungerGames;
		books[2] = dune;
		books[3] = cleanCode;

		for (int index = 0; index < books.length; index++) {
			Book book = books[index];
			System.out.println(book.getName() + " - " + book.getCount());
		}

		Book temp = books[0];
		books[0] = books[3];
		books[3] = temp;
		for (int index = 0; index < books.length; index++) {
			Book book = books[index];
			System.out.println(book.getName() + " - " + book.getCount());
		}

		for (int index = 0; index < books.length; index++) {
			Book book = books[index];
			if (book.getName().equals("Clean Code")) {
				System.out.println(book.getName());
			}
		}
	}
}