package org.example;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class CustomSet<E> {
    private int addCount = 0; // 자료형에 몇번 추가되었는지 세는 카운트 변수
    private Set<E> set = new HashSet<>(); // 합성

    public boolean add(E e) {
        addCount++;
        //set의 인스턴스를 원래껄 줌으로써 진짜 자신의 add를 가리키게 됨
        return set.add(e); // 합성된 객체의 메서드를 실행
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return set.addAll(c); // 합성된 객체의 메서드를 실행
    }

    public int getAddCount() {
        return addCount;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomSet<String> mySet = new CustomSet<>();

        mySet.addAll(Arrays.asList("가", "나", "다", "라", "마"));
        mySet.add("바");

        System.out.println(mySet.getAddCount()); // 6
    }
}