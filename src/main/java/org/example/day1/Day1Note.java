package org.example.day1;


import java.util.*;

public class Day1Note {
    public static void main(String[] args) {
/*
    1. maven
        folder structure
        types of repository:
            local (.m2), central, remote
        maven build lifecycle
            clean, validation, compile, test, ....
        Command Line
            mvn clean, mvn test, mvn install

    2. git
        distributed version control
        how to connect with GitHub by intellij or terminal
        basic git command

    3. eight basic data type
       primitive type: byte(8 bits), short(16), int(32), long(64), float(32), double(64), char(16), boolean(1)
       wrapper type:   Byte, Short, Integer, Long, Float, Double, Boolean, Character
       auto boxing: primitive -> wrapper
       unboxing: wrapper -> primitive

*/
//        List<Integer> l = new ArrayList<>();
//        l.add(123);

//        String s1 = "123";
//        String s2 = s1;
//        s1 = s1 + "abc";
//        System.out.println(s2);
//
////        StringBuilder is mutable
//        StringBuilder sb1 = new StringBuilder(s1);

//        String a = "abc";
//        String b = "abc";
//        String c = new String("abc");
//        String d = new String("abc");
//        System.out.println(a == b);

//        Set<Node> set = new TreeSet<>();
//        Set<Node> set = new TreeSet<>(new Mycomparator());
        Set<Node> set = new TreeSet<>((a,b) -> Integer.compare(a.x, b.x));
        set.add(new Node(1, 1));
        set.add(new Node(1, 2));
        set.add(new Node(3, 3));
        set.add(new Node(4, 4));

        System.out.println(set.stream().findFirst().get().x);
        System.out.println(set.stream().findFirst().get().y);

    }


    public static String appendstr(String s) {
        s = s + "abc";
        return s;
    }

    public static void addnum(Integer a) {
        a = a + 123;
    }
}

class Mycomparator implements Comparator<Node> {

    @Override
    public int compare(Node node1, Node node2) {
        if (node1.x != node2.x) {
            return Integer.compare(node1.x, node2.x);
        }

        // If x values are equal, then compare by y
        return Integer.compare(node2.y, node1.y);
    }
}

class Node implements Comparable<Node> {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return x == node.x && y == node.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.x, o.x);
    }
}
