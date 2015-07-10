package com.protect.p2;

import com.protect.p1.ClassA;

/**
 * Created by alexandr on 10.07.15.
 */
public class ClassC extends ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassA();
//        a.func();          /* За пределами пакета доступ к дефолтному методу объекта (не класса) будет закрыт */
//        a.protectedFunc(); /* За пределами пакета доступ к защищенному методу объекта (не класса) будет закрыт */
////        a.privateFunc();
    }

    public void test(){
//        func();            /* За пределами пакета доступ к дефолтному методу в класса-наследника будет закрыт */
        protectedFunc();   /* За пределами пакета доступ к защищенному методу класса-наследника будет открыт */
////        privateFunc();
    }

}
