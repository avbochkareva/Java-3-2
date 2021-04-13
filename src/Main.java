import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите начальную сумму на балансе: ");
        long num = in.nextInt();
        System.out.print("Сколько рублей положить на баланс? ");
        long num2 = in.nextInt();
                long sum = num + num2;
        if (sum >= 1000 )
        {
            long sum2 = sum / 100 - 1;
            System.out.printf("Вам начислено: " + sum2 + " бонусов. " +
                    "Итого на счету: " + (sum2 + sum) + " рублей");
        }
        else
            System.out.println("Вам начислено 0 бонусов. Итого на счету: " + sum + " рублей");
    }
}