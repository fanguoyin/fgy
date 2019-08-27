package com.atguigu.java8;

public class ceshi1 {

    public Yolk y;

    public class Yolk {

        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public ceshi1() {
        System.out.println("New Egg");
        y = new Yolk();
    }

    public void ceshi2() {

        String json="{\"name\":\"qwe\",\"age\":13,\"asd\":\"2019-08-11\"}";
        System.out.println("ceshi2");
    }

}
