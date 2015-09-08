import java.util.Scanner;
/*
Дано целое число 1 <= n <= 40, необходимо вычислить n-е число Фибоначчи.
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
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
     }
}