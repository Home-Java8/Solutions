package com;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alexandr on 24.06.15.
 * ********************************
 * {@link http://prologistic.com.ua/polnoe-rukovodstvo-po-java-8-stream.html}
 * Как потоки работают?
 * ********************************
 * (java 8 stream)
 ** http://prologistic.com.ua/polnoe-rukovodstvo-po-java-8-stream.html
 * http://www.journaldev.com/2774/java-8-stream-api-example-tutorial
 * http://java.dzone.com/articles/understanding-java-8-streams-1
 * http://www.drdobbs.com/jvm/lambdas-and-streams-in-java-8-libraries/240166818
 * http://radar.oreilly.com/2015/02/java-8-streams-api-and-parallelism.html
 * http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * http://habrahabr.ru/post/188850/
 *
 */
public class Task9 {

    public static void main(String[] args) {
        List<String> mList = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");

        mList.stream()
             .filter(s -> s.startsWith("a"))
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);

        //Результат выполнения:
        // AA1
        // AA2


        Arrays.asList("сс1", "сс2", "сс3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
        //Результат выполнения: сс1
    }


}
