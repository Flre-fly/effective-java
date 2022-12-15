package org.example.tocompotision;

public class Parent {
    public void A(){
        System.out.println("부모의 a메서드");
        this.B();
        this.C();
    }
    public void B(){
        System.out.println("부모의 B메서드");
    }
    public void C(){
        System.out.println("오버라이드 안한 부모의 c");
    }

}
