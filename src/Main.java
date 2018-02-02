import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("Введите число 1, 2, или 3 ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if(x==1){
            System.out.println("Вы ввели число 1");

        }else if (x==2) {

            System.out.println("Вы ввели число 2 ");

        }else if (x==3){
            System.out.println("Вы ввели число 3" );

        }else{
            System.out.println("Вы ввели неправильное число");
        }
    }
}
