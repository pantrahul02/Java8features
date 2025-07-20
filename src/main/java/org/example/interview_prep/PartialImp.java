package org.example.interview_prep;

abstract class PartialImp implements A,B{

    @Override
    public void methodA1() {
        System.out.println("Implemented methodA1");
    }

    @Override
    public void methodA2() {
        System.out.println("Implemented methodA2");
    }

    @Override
    public void methodB1() {
        System.out.println("Implemented methodB1");
    }
}
