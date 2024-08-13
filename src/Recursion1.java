import java.util.*;
//program to print integers from 1 to 5 using recursion
class Recursion1{
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n <= 5) {
            System.out.println(n);
            print(n + 1);
        }
    }
 }