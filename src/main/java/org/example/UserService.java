package org.example;

public class UserService {

    User [] users = new User[15];


    public static User[] addUser(User user, User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i]==null) {
                users[i]=user;
                break;
            }
        }
        return users;
    }

    public static User[]  deleteUsers (User[] inputUsers) {
        User[] users = inputUsers;
        for (int i = 0; i < users.length; i++) {
                users[i]=null;
        }
        return users;
    }

    public static int countUsers (User[] users) {
        int count = users.length;
        return count;
    }

    public static String getUserLoginById (User[] users, int id) {
        int key = id;
        String login= null;
        for (int i = 0; i < users.length; i++) {
            if(users[i].id == key) {
                System.out.println(users[i].login);
                login = users[i].login;
            }
        }
        return login;
    }

    public static int getUserIdByLogin (User[] users, String login) {

        String key1 = login;
        int userId = 0;

        for (int i = 0; i < users.length; i++) {
            if(users[i].login.equals(key1)) {
                System.out.println(users[i].id);
                userId = users[i].id;
            }
        }
        return userId;
    }

    public static void checkUserById (User[] users, int id) {
        int key2 = id;

        for (int i = 0; i < users.length; i++) {
            if(users[i].id == key2) {
                System.out.println(users[i].login + " такой пользователь есть");
            }
        }
    }



}
