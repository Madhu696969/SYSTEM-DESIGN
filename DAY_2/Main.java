package DAY_2;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer madhu =
                new Investor(
                        "Madhu",
                        100
                );

        Observer john =
                new Investor(
                        "John",
                        100
                );

        Observer alex =
                new Investor(
                        "Alex",
                        100
                );

        stock.addObserver(madhu);
        stock.addObserver(john);
        stock.addObserver(alex);

        stock.setPrice(150);
        stock.setPrice(200);
    }
}