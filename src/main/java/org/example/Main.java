package org.example;

import org.example.tocompotision.Child;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

class CustomSet<E> extends HashSet<E> {
    private int addCount = 0; // 자료형에 몇번 추가되었는지 세는 카운트 변수

    @Override
    public boolean add(E e) {
        // 만일 add되면 카운트를 증가 시키고, 부모 클래스 HashSet의 add() 메소드를 실행한다.
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // 만일 리스트 자체로 들어와 통쨰로 add 한다면, 컬렉션의 사이즈를 구해 카운트에 더하고, 부모 클래스 HashSet의 addAll() 메소드를 실행한다.
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.A();
    }
}