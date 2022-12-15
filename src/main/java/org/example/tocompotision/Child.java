package org.example.tocompotision;

public class Child extends Parent{
    @Override
    public void A(){
        System.out.println("자식의 a메서드1");
        super.A();
        System.out.println("자식의 a메서드2");
    }
    @Override
    public void B(){
        System.out.println("자식의 B메서드");
        super.B();

    }

}
