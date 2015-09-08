import java.util.Scanner;
/*
Дано число 1 <= n <= 10^7, необходимо найти последнюю цифру n-го числа Фибоначчи.
Как мы помним, числа Фибоначчи растут очень быстро, 
поэтому при их вычислении нужно быть аккуратным с переполнением. 
В данной задаче, впрочем, этой проблемы можно избежать, 
поскольку нас интересует только последняя цифра числа Фибоначчи: 
если 0≤a,b≤9 — последние цифры чисел Fi и Fi+1 соответственно, 
то (a+b)mod10 — последняя цифра числа Fi+2.
*/
class Main {
public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            int a = 1; //a_n-1
            int b = 1; //a_n
            int c;
            for (int i = 2; i <n; i++) {
                c = (a + b) % 10;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
     }
}