import java.util.Scanner;

public class Calculator {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getNumber();
        int num2 = getNumber();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции:" + result);
    }

    public static int getNumber() {
        System.out.println("ВВедите число");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте еще раз");
            scanner.next();
            num = getNumber();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

            public static int calc(int num1, int num2, char operation){
            int result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, getOperation());
            }
            return result;
            }
        }