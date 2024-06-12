package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        try {
            System.out.println("Старт");
            System.out.println("Введите пользователей");
            Scanner sc = new Scanner(System.in);

            int id;
            String login;
            String password;
            User[] users = new User[3];

            for (int i = 0; i < users.length; i++) {
                System.out.println("Введите id");
                id = sc.nextInt();
                sc.nextLine();

                System.out.println("Введите login");
                login = sc.nextLine();

                System.out.println("Введите password");
                password = sc.nextLine();

                User newUser = new User(id, login, password);
                UserService.addUser(newUser, users);

            }

            System.out.println("Создано " + Arrays.toString(users));

            System.out.println("Кол-во пользователей" + UserService.countUsers(users));


            System.out.println("Введите id пользователя");
            int userId = sc.nextInt();
            System.out.println("login пользователя " + UserService.getUserLoginById(users, userId));


            System.out.println("Введите login пользователя");
            sc.nextLine();
            String userLogin = sc.nextLine();
            System.out.println("id пользователя " + UserService.getUserIdByLogin(users, userLogin));

            System.out.println("Введите id пользователя для проверки");
            int userId1 = sc.nextInt();

            UserService.checkUserById(users, userId1);

            UserService.deleteUsers(users);
            System.out.println("Все удалили. Осталось " + Arrays.toString(users));
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка");
        }
    }
}