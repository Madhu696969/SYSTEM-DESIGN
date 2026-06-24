package DAY_2;

public class Investor implements Observer {

    private String name;
    private int price;

    public Investor(
            String name,
            int price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public void setPrice(int price) {

        System.out.println(
                name +
                " -> Old Price: " +
                this.price +
                " New Price: " +
                price
        );

        this.price = price;
    }
}