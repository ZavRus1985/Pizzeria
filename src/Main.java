public class Main {

    public static void main(String[] args) {

       Pizza pizza1 = new Pizza("Грибная", 550);
       Pizza pizza2 = new Pizza("Сырная",400);
       Pizza pizza3 = new Pizza("Европейская", 629);
       Pizza pizza4 = new Pizza("Супер Пепперони", 729);
       Pizza pizza5 = new Pizza("Пепперони", 620);

       Calculator calculator = new Calculator();
       int i = calculator.sum(pizza1, pizza2, pizza3, pizza4, pizza5);
       Pizza pizzaX = new Pizza("Итого", i);
       pizzaX.dataOfPizza();
    }
}
