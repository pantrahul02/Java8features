package org.example.scenarios;

class Parent {

    public void methodParent(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
    public void methodChild(){
        System.out.println("Child Class method");
    }
}
public class ISARelationshipTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.methodParent();
        //p.methodChild();
        Child c = new Child();
        c.methodParent();
        c.methodChild();

        Parent p1 = new Child();
        p1.methodParent();
        //p1.methodChild();

        //Child c1 = new Parent();


    }
}



