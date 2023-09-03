public class Cake {
    private String name;
    private double price;
    private int quantitySold;

    public Cake(String name, double price, int quantitySold) {
        this.name = name;
        this.price = price;
        this.quantitySold = quantitySold;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public static Cake findBestSellingCake(Cake[] cakes) {
        Cake bestSellingCake = null;
        int maxQuantitySold = 0;

        for (Cake cake : cakes) {
            if (cake.getQuantitySold() > maxQuantitySold) {
                maxQuantitySold = cake.getQuantitySold();
                bestSellingCake = cake;
            }
        }

        return bestSellingCake;
    }

    public static void main(String[] args) {
        Cake cake1 = new Cake("Chocolate Cake", 20.0, 50);
        Cake cake2 = new Cake("Vanilla Cake", 18.0, 65);
        Cake cake3 = new Cake("Strawberry Cake", 22.0, 40);

        Cake[] cakes = {cake1, cake2, cake3};

        Cake bestSellingCake = Cake.findBestSellingCake(cakes);

        if (bestSellingCake != null) {
            System.out.println("Best Selling Cake Details:");
            System.out.println("Name: " + bestSellingCake.getName());
            System.out.println("Price: " + bestSellingCake.getPrice() + "Rs.");
            System.out.println("Quantity Sold: " + bestSellingCake.getQuantitySold());
        } else {
            System.out.println("No cakes found!");
        }
    }
}
