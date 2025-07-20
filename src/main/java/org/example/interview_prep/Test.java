package org.example.interview_prep;

public class Test {
    public static void main(String[] args) {
      A a = new ConcreteImpl();
      B b = new ConcreteImpl();
      a.methodA1();
      a.methodA2();
      a.methodA3();
      a.methodA4();

      b.methodB1();
      b.methodB2();
    }
}
