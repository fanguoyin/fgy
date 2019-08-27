package com.atguigu.java8;

public class Test2 extends ceshi1 {

    public class Yolk {

        public Yolk() {
            System.out.println("BigEgg.Yolk");
        }
    }

    public void ceshi2() {
        System.out.println("cc");
    }

    private int num;

//    public Test2() {
//    }
//
//    public Test2(int num) {
//        this.num = num;
//    }
//
//    private class Inner {
//
//        public Test2 getTest2() {
//            return Test2.this;
//        }
//
//        public Test2 newTest2() {
//            return new Test2();
//        }
//    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        Yolk aa = test.new Yolk();
//        Test2 test2 = inner.getTest2();
//        Test2 test3 = inner.newTest2();
//        System.out.println(test2.num);
        System.out.println(aa);
//        new Test2();
    }
}