import java.util.Scanner;

public class Calculator {

        int sum(Pizza pizza1, Pizza pizza2, Pizza pizza3, Pizza pizza4, Pizza pizza5) {

        Menu menu = new Menu();
        int x;                 //вводим число - выбираем пиццу
        int y = 0;
        for (; ; ) {

            menu.printCheck();
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    y += pizza1.price;
                    break;
                case 2:
                    y += pizza2.price;
                    break;
                case 3:
                    y += pizza3.price;
                    break;
                case 4:
                    y += pizza4.price;
                    break;
                case 5:
                    y += pizza5.price;
                    break;
            } if (x == 6) break;
        }
        Pizza pizza88 = new Pizza("Итого", 0) ;
        pizza88.price = y;
        return pizza88.price;

    }
}
