package org.example.tocompotision;

public class ChildChild extends Child{
    @Override
    public void A(){
        System.out.println("자식자식의 a메서드1");
        super.A();
        System.out.println("자식자식의 a메서드2");
    }
    @Override
    public void B(){
        System.out.println("자식자식의 B메서드");
        super.B();

    }
}
