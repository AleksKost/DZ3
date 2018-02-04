
11) /*Напишите программы, которые выводят на экран:
        * прямоугольник
        * прямоугольный треугольник
        * равносторонний треугольник
        * ромб*/

        а) public class Rectangle {

    public static void main(String[] args) {
        int i,j;
        for (i=1;i<5;i++) {

            for (j=1;j<10;j++) {

                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

б)
public class Right_triangle {

    public static void main(String[] args) {
        int i,j;
        for (i=1;i<10;i++) {         //кол-во строк

            for (j=1;j<i;j++) {    //кол-во символов в каждой строке

                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

в) public class Main {

    public static void main(String[] args) {
        int MID = 10;
        int a = 0;
        while(a < MID){
            int i = 0;
            while (i < MID - a) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < a*2 + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            a++;
        }
    }
}

2) //Написать программу вычисления функции y = ax^2 + b при a = 3, b = -5. Аргумент
//x принимает значения от 1 до 5 с шагом 0,5.

public class Main{          //(Выводит только цикл с шагом 0.5)
    public static void main (String args []){
        int a = 3;
        int b = -5;
        double x = 2;
        for ( double i=1; i<=5; i+=.5){
            double y = a*x*x+b;
            System.out.println( i );
        }

    }
}

3) //Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем цифра b?

        import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int ai, bi;
        System.out.println("Введите натуральное число, n = ");
        int n = scanner.nextInt();
        System.out.println("Введите две цифры: ");
        System.out.println("Введите число а = ");
        int a = scanner.nextInt();
        System.out.println("Введите число b = ");
        int b = scanner.nextInt();

        if (a == n % 10) {
            System.out.println();
        }
        if (b == n % 10) System.out.println();
        if (a < b) System.out.println("Меньшее число а");
        else
            System.out.println("Меньшее число b");


    }
}
6) //Составить программу для нахождения всех натуральных решений (х и у)
//уравнения х2 + у2 = k2, где х, у и k лежат в интервале от 1 до 30. Решения, которые
//получаются, перестановкой х и у, считать совпадающими.


public class Main {    				(???)
    public static void main(String[] args) {
        int x, y, k;
        for (x = 1; x <= 30; x++) {
            for (y = 1; y <= 30; y++) {
                for (k = 1; k <= 30; k++) {
                    System.out.print("");
                }
                int res = x * 2 + y * 2 - k * 2;
                if (res == 0) {
                    System.out.println("Решения x= " + x + " y= " + y + " k= " + k);
                }
            }
        }
    }
}

7) //Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.
public class Main{
    public static void main(String[] args) {
        int k = 100/19+1;
        for ( int i = k; i < k + 15; i++ ){
            System.out.println(19*i + " ");
        }
    }
8) //Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 и
    //больших 500.
    public class Main{
        public static void main(String[] args) {
            int k = (500/13)/17+1;
            for ( int i = k; i < k + 20; i++ ){
                System.out.println(13*i + "  " + 17*i);

            }
        }
    }

