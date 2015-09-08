import java.util.Scanner;
/*
Даны целые числа 1≤n≤1018 и 2≤m≤105, необходимо найти остаток 
от деления n-го числа Фибоначчи на m.

---> Период Пизано
*/
public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int m = in.nextInt();

        //System.out.println("read numbers: n = " + n + ", m = " + m);
        int a = 1;
        int b = 1;
        int c;
        int k = 1;
        //int border = m * m + 1;
        while ((a % m) != 0 || (b % m) != 1){
            c = (a + b) % m;
            a = b;
            b = c;
            k++;
        }
        //System.out.println("k = " + k);

        long p = n % k - 1;
        //System.out.println("p = " + p);
        a = 1;
        b = 1;
        for (int i = 1; i < p; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
        }
        //System.out.println("step = " + 3);
        System.out.println(b % m);
    }
}