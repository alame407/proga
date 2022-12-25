package org.itmo.lab3;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        int a =5;
        int b=5;
        f1 res = (y)->y;
        f2 res2 = (f1, y)-> f1.calc(y)+y;
        System.out.println(res2.calc(res, b));
    }
    public interface f1{
        public int calc(int b);
    }
    public interface f2{
        public int calc(f1 a, int b);
    }
}
