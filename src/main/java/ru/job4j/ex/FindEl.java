package ru.job4j.ex;

public class FindEl {
	public static int indexOf(String[] value, String key) throws ElementNotFoundException {
		for (int i = 0; i < value.length; i++) {
			if (value[i].equals(key)) {
				return i;
			}
		}
		throw new ElementNotFoundException("элемент не найден: " + key);
	}

	public static void main(String[] args) {
		FindEl el = new FindEl();
		String[] color = {"white", "dark"};

		try {
			int index = el.indexOf(color, "f");
			System.out.println("индекс 'white': " + color);
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}

	}
}
