//METHOD OVERLOADING - FUNCTION OVERLOADING

public class Main{
    static void main(String[] args) {
        fun(67);
        fun("adreno plays");
    }
    static void fun (int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return true; // number is prime
    }
}

