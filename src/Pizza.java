public class Pizza {
    String name;
    int price;

    public Pizza(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    void dataOfPizza(){
        System.out.println(name + " " + price);

    }
}
