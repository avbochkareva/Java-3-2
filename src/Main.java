import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long startСoins = 100; //начальный баланс 100 рублей
        System.out.print("Баланс: 100 рублей. Сколько рублей положить на баланс? ");
        long addСoins = in.nextInt();
        if (addСoins > 1000)
        {
            long bonus = addСoins / 100;
            System.out.println("Вам начислено: " + bonus + " бонусов. " +
                    "Баланс: " + (bonus + addСoins + startСoins) + " рублей");
        }
        else
            System.out.println("Вам начислено 0 бонусов. Итого на счету: " + (addСoins + startСoins) + " рублей");
    }
}
