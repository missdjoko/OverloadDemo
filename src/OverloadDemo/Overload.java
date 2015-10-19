package OverloadDemo;

/**
 * Created by Miss_ on 17.10.2015.
 */
public class Overload {
    void test(){
        System.out.println("net parametrov");
    }

 //   void test(int a){
 //       System.out.println("a: " + a);
 //   }

    void test(int a, int b){
        System.out.println("a: " + a + "  " + "b: " + b);
    }

    double test(double a){
        System.out.println("a: " + a);
        return a*a;
    }
}
