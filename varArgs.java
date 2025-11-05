public class Main{
    static int x=99;

    static void main(String[] args) {
        System.out.println(x); //99

        int x= 40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}

variable arguments

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        fun(2, 34, 5, 6646, 75, 886, 85, 8, 59);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
