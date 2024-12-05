package ru.job4j.ex;

public class UserStore {
	public static User findUser(User[] users, String login) throws UserNotFoundException {
		for (User user : users) {
			if (user.getUsername().equals(login)) {
				return user;
			}
		}
		throw new UserNotFoundException("пользователь не найден");
	}

	public static boolean validate(User user) throws UserInvalidException {
		if (!user.isValid() || user.getUsername().length() < 3) {
			throw new UserInvalidException("пользователь не валидный");
		}
		return true;
	}

	public static void main(String[] args) {
		User[] users = {
				new User("Petr Arsentev", true),
				new User("Pe", true) 
				};
		
		try {
			User user = findUser(users, "Petr Arsentev");
			if (validate(user)) {
				System.out.println("этот пользователь имеет доступ");

				User user2 = findUser(users, "Pe");
				if (validate(user2)) {
					System.out.println("этот пользователь имеет доступ");
				}
			}
		} catch (UserInvalidException e) {
			System.out.println(e.getMessage());
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
