package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task1 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Alex", true));
        users.add(new User("Vlad", true));
        users.add(new User("Vitalik", false));
        users.add(new User("Jenifer", false));
        users.add(new User("Jana", true));
        users.add(new User("Lusy", true));
        users.add(new User("Alisa", false));
        users.add(new User("Nikita", true));


        StringBuffer sb = new StringBuffer();
        for (User user: users)
            sb.append(user.getLogin() + '\n');
        System.out.print(sb);
    }

}

class User {

    public User(){}
    public User(String login, boolean valid){
        this.login = login;
        this.valid = valid;
    }

    private String login;
    private boolean valid;

    public void setLogin(String login){
        this.login = login;
    }
    public void setValid(boolean valid){
        this.valid = valid;
    }

    public String getLogin(){
        return login;
    }
    public boolean isValid(){
        return valid;
    }

}