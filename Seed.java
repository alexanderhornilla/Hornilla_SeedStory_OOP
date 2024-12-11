public class Seed extends Product {
    public Seed(String name, int growthWeeks, String breeder, double weight, int weeklySales, double price, int stock) {
        super(name, growthWeeks, breeder, weight, weeklySales, price, stock);
    }

    @Override
    public void display() {
        System.out.printf("%-15s %-15d %-20s %-10.2f %-10d %-10.2f %-10d\n",
                getName(), getGrowthWeeks(), getBreeder(), getWeight(), getWeeklySales(), getPrice(), getStock());
    }
}