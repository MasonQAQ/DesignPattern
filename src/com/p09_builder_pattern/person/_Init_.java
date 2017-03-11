package com.p09_builder_pattern.person;

/**
 * 指挥者用来控制建造过程,让用户和建造隔离。
 * Created by yangyue on 2017/3/6.
 */
public class _Init_ {
    public static void main(String[] args) {
        PersonDirector director;

        PersonBuilder fatPersonBuilder = new FatPersonBuilder();
        director = new PersonDirector(fatPersonBuilder);
        director.createPerson();
        System.out.println(fatPersonBuilder.getPerson());

        System.out.println("——————————————————————————————————————————————————————");

        PersonBuilder thinPersonBuilder = new ThinPersonBuilder();
        director = new PersonDirector(thinPersonBuilder);
        director.createPerson();
        System.out.println(thinPersonBuilder.getPerson());
    }
}
