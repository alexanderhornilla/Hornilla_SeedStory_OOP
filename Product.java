public abstract class Product {
    private String name;
    private int growthWeeks;
    private String breeder;
    private double weight;
    private int weeklySales;
    private double price;
    private int stock;

    public Product(String name, int growthWeeks, String breeder, double weight, int weeklySales, double price, int stock) {
        this.name = name;
        this.growthWeeks = growthWeeks;
        this.breeder = breeder;
        this.weight = weight;
        this.weeklySales = weeklySales;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { 
        return name; 
    }
    
    public int getGrowthWeeks() { 
        return growthWeeks; 
    }

    public String getBreeder() { 
        return breeder; 
    }

    public double getWeight() { 
        return weight; 
    }

    public int getWeeklySales() { 
        return weeklySales; 
    }

    public double getPrice() { 
        return price; 
    }

    public int getStock() { 
        return stock; 
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    public abstract void display();
}