package com.driver;

public class Main {
    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        //Task 4 of overriding meth function
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        //Task 3
        A b = new B();
        //Task 5
        String ans = b.meth();

        System.out.println(ans);
    }
  
}