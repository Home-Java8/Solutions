package com.protect.p1;

/**
 * Created by alexandr on 10.07.15.
 */
public class ClassA {

    public void test(){
        func();
        protectedFunc();
        privateFunc();
    }

    /* default */ void func(){
        System.out.println("Func");
    }      /* модификатор по умолчанию доступен внутри пакета и в классе-наследнике и для объекта (не класса) */
    protected void protectedFunc(){
        System.out.println("Protected-Func");
    } /* модификатор 'protected' ничего общего с наследованием не имеет */
    private void privateFunc(){
        System.out.println("Private-Func");
    }     /* модификатор 'private' доступен только внутри класса */

}
