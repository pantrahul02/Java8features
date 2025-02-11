package org.example.scenarios;

class A {
    void add() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    @Override
    void add() {
        System.out.println("Method of class B");
    }

    void callSuperAdd() {
        super.add();
    }
}

class C extends B {
    @Override
    void add() {
        System.out.println("Method of class C");
    }

    void callAAdd() {
        callSuperAdd();
    }
}

public class ScenarioTest {
    public static void main(String[] args) {

        C c = new C();
        c.add();
        c.callAAdd();

    }
}

