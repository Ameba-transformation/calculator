import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int num1, num2, result=0;
        char operator;

        System.out.print("enter expression : ");
        try (Scanner scanner = new Scanner(System.in)) {
            num1 = scanner.nextInt();
            operator = scanner.next().toCharArray()[0];
            num2 = scanner.nextInt();
        }

        switch(operator){
            case '+':result = add(num1,num2);
                break;
            case '-':result = sub(num1,num2);
            break;
            case '/':result = div(num1,num2);
            break;
            case '*':result = mul(num1,num2);
            break;
        }

        System.out.println(result);

    }

    private static int sub(int a, int b) {
        return 0;
    }

    private static int div(int a, int b) {
        return 0;
    }

    private static int mul(int num1, int num2) {
        return num1 * num2;
    }

    private static int add(int a, int b) {
        return 0;
    }
}