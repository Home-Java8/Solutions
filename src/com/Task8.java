package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task8 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("elements", false));
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
        users.add(new User("Comparator", false));


        StringBuffer sb = new StringBuffer();
        for (User user: users)
            if (user.isValid())
                sb.append(user.getLogin() + '\n');
        System.out.print(sb);

        System.out.println("---------------------");

        int kernels = 8;
//        for (int kernel = 1; kernel <= kernels; kernel++)
//            System.out.print( kernelSort(8, kernel, users) );
        System.out.print( multySort(kernels, users, new StringBuffer()) );
    }



    // идея такая что я создаю-вызываю количество функций согласно N-ядрам
    static StringBuffer multySort(int kernels, List<User> users, StringBuffer sb){
//        StringBuffer sb = new StringBuffer();
        for (int kernel = 1; kernel <= kernels; kernel++)
            sb.append(kernelSort(kernels, kernel, users, new StringBuffer()));
        return sb;
    }

    // идея в том что я начинаю с какого-то N-элемента (по номеру ядра) и с шагом количества всех ядер прохожу этот цыкл
    static StringBuffer kernelSort(int kernels, int kernel, List<User> users, StringBuffer sb){
//        StringBuffer sb = new StringBuffer();
        for (int i = kernel; i <= (users.size()-kernels+kernel); i+=kernels)
            if (users.get(i).isValid())
                sb.append(users.get(i).getLogin() + '\n');
        return sb;
    }

}
