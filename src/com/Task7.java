package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task7 {

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
        users.add(new User("println", true));
        users.add(new User("dumbCheck", true));
        users.add(new User("Pattern", true));
        users.add(new User("String", true));
        users.add(new User("validationString", true));
        users.add(new User("symbols", true));
        users.add(new User("length", false));
        users.add(new User("userNameString", true));
        users.add(new User("toCharArray", true));
        users.add(new User("userNameString", true));
        users.add(new User("dumbCheck", false));
        users.add(new User("checkWithRegExp", true));
        users.add(new User("validationString", false));
        users.add(new User("indexOf", true));
        users.add(new User("out", false));


//        Comparator comparator = new UserByName();
//        Comparator comparator = new UserByValid();
//        Collections.sort(users, new UserByValid()); //Collections.sort(users, comparator); //Collections.sort(users, new UserByName());
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2){
                return u1.getLogin().compareTo(u2.getLogin());
            }
        });


        StringBuffer sb = new StringBuffer();
        for (User user: users)
            sb.append(user.getLogin() + '\n');
        System.out.print(sb);
    }

}


class UserByName implements Comparator<User> {
    @Override
    public int compare(User u1, User u2){
        return u1.getLogin().compareTo(u2.getLogin());
    }
}
class UserByValid implements Comparator<User> {
    @Override
    public int compare(User u1, User u2){
        return String.valueOf(u1.isValid()).compareTo( String.valueOf(u2.isValid()) );
    }
}