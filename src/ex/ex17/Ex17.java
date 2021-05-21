package ex.ex17;


import objectSample.exceptionSample.original.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex17 {


    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("相澤", Gender.MEN,"1988-12-04"),
                new Person("井上", Gender.WOMEN,"1995-03-31"),
                new Person("上野", Gender.MEN,"2004-08-24"),
                new Person("遠藤",Gender.WOMEN,"2016-06-10"),
                new Person("太田",Gender.WOMEN,"2020-05-21")
        ));

        for (Person p:list) {
            System.out.println(p);
        }
    }
}