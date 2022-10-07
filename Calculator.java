import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int a, b, c=0;
        char operator;

        System.out.print("enter expression : ");
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            operator = scanner.next().toCharArray()[0];
            b = scanner.nextInt();
        }

        switch(operator){
            case '+':c = add(a,b);
                break;
            case '-':c = sub(a,b);
            break;
            case '/':c = div(a,b);
            break;
            case '*':c = mul(a,b);
            break;
        }

        System.out.println(c);

    }

    private static int sub(int a, int b) {
        return 0;
    }

    private static int div(int a, int b) {
        return 0;
    }

    private static int mul(int a, int b) {
        return 0;
    }

    private static int add(int a, int b) {
        return 0;
    }
}