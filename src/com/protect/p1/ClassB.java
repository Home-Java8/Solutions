package com.protect.p1;

/**
 * Created by alexandr on 10.07.15.
 */
public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.func();
        a.protectedFunc(); /* Внутри пакета доступ к методу объекта (не классу) будет открыт */
////        a.privateFunc();
    }

    public void test(){
        func(); /* Внутри пакета доступ к методу класса-наследника будет открыт */
        protectedFunc();
////        privateFunc();
    }

}
