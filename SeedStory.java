import java.util.*;

public class SeedStory {
    private static List<Seed> inventory = new ArrayList<>();
    private static Map<Seed, Integer> cart = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inventory.add(new Seed("Carrot", 8, "XYZ Seeds", 200, 15, 30.00, 120));
        inventory.add(new Seed("Lettuce", 6, "Green Leaf", 100, 18, 25.00, 80));
        inventory.add(new Seed("Tomato", 10, "ABC Breeders", 150, 20, 50.00, 100));
        inventory.add(new Seed("Spinach", 5, "Green Growers", 120, 25, 20.00, 90));
        inventory.add(new Seed("Cucumber", 7, "Fresh Farms", 180, 30, 35.00, 110));
        inventory.add(new Seed("Pumpkin", 12, "Harvest Co.", 1000, 10, 60.00, 50));
        inventory.add(new Seed("Radish", 4, "Rooted Seeds", 100, 40, 15.00, 150));
        inventory.add(new Seed("Peas", 8, "GrowEasy", 250, 22, 28.00, 70));
        inventory.add(new Seed("Corn", 14, "Golden Fields", 500, 18, 45.00, 60));
        inventory.add(new Seed("Onion", 6, "Sharp Roots", 300, 35, 25.00, 95));
        inventory.add(new Seed("Bell Pepper", 9, "Colorful Crops", 150, 28, 40.00, 80));
        inventory.add(new Seed("Zucchini", 7, "Garden Fresh", 200, 20, 30.00, 100));
        inventory.add(new Seed("Eggplant", 10, "Purple Harvest", 250, 15, 32.00, 75));
        inventory.add(new Seed("Broccoli", 11, "Green Leaf", 300, 12, 50.00, 65));
        inventory.add(new Seed("Cauliflower", 13, "White Buds", 350, 10, 55.00, 55));
        inventory.add(new Seed("Chili", 8, "Spicy Breeds", 100, 50, 22.00, 200));
        inventory.add(new Seed("Basil", 3, "Herbal Gardens", 50, 45, 10.00, 300));
        inventory.add(new Seed("Parsley", 4, "Herbal Gardens", 40, 48, 12.00, 250));
        inventory.add(new Seed("Alfalfa", 4, "Sprout Co.", 50, 20, 12.00, 200));
        inventory.add(new Seed("Arugula", 5, "Green Shoots", 60, 15, 18.00, 150));
        inventory.add(new Seed("Barley", 10, "Grain Masters", 300, 25, 40.00, 90));
        inventory.add(new Seed("Beetroot", 7, "Rooted Seeds", 250, 22, 30.00, 80));
        inventory.add(new Seed("Celery", 9, "Healthy Harvest", 120, 18, 22.00, 70));
        inventory.add(new Seed("Chard", 8, "Swiss Greens", 150, 20, 28.00, 85));
        inventory.add(new Seed("Dill", 5, "Herbal Gardens", 30, 40, 15.00, 300));
        inventory.add(new Seed("Fennel", 7, "Herbal Essence", 200, 12, 20.00, 90));
        inventory.add(new Seed("Garlic", 11, "Sharp Roots", 400, 10, 50.00, 100));
        inventory.add(new Seed("Kale", 6, "Leafy Dreams", 200, 30, 25.00, 120));
        inventory.add(new Seed("Leek", 10, "Rooted Seeds", 300, 15, 35.00, 100));
        inventory.add(new Seed("Okra", 9, "Sticky Crops", 150, 25, 28.00, 110));
        inventory.add(new Seed("Parsnip", 8, "White Roots", 200, 18, 22.00, 80));
        inventory.add(new Seed("Rye", 12, "Grain Masters", 500, 12, 45.00, 60));
        inventory.add(new Seed("Squash", 14, "Harvest Co.", 1000, 8, 60.00, 50));
        inventory.add(new Seed("Turnip", 6, "Purple Tops", 300, 25, 20.00, 100));
        inventory.add(new Seed("Watermelon", 16, "Juicy Farms", 2000, 5, 75.00, 30));
        inventory.add(new Seed("Wheat", 10, "Grain Masters", 800, 20, 40.00, 70));
        inventory.add(new Seed("Peppermint", 3, "Herbal Gardens", 20, 50, 10.00, 400));
        inventory.add(new Seed("Thyme", 4, "Herbal Essence", 25, 45, 12.00, 350));
        inventory.add(new Seed("Rose", 8, "Floral Bliss", 10, 30, 20.00, 150));
        inventory.add(new Seed("Tulip", 6, "Bright Petals", 15, 25, 18.00, 200));
        inventory.add(new Seed("Daisy", 5, "Sunny Blooms", 10, 40, 15.00, 250));
        inventory.add(new Seed("Sunflower", 10, "Golden Fields", 50, 20, 25.00, 100));
        inventory.add(new Seed("Lily", 9, "Elegant Blooms", 20, 18, 22.00, 90));
        inventory.add(new Seed("Marigold", 7, "Golden Gardens", 15, 30, 18.00, 150));
        inventory.add(new Seed("Orchid", 12, "Exotic Plants", 5, 10, 50.00, 60));
        inventory.add(new Seed("Jasmine", 6, "Fragrant Blooms", 8, 35, 25.00, 120));
        inventory.add(new Seed("Lavender", 8, "Herbal Scents", 10, 25, 20.00, 200));
        inventory.add(new Seed("Chrysanthemum", 10, "Bright Petals", 12, 22, 18.00, 150));
        inventory.add(new Seed("Hibiscus", 9, "Tropical Blooms", 20, 20, 22.00, 80));
        inventory.add(new Seed("Zinnia", 5, "Colorful Crops", 15, 30, 15.00, 180));
        inventory.add(new Seed("Peony", 11, "Elegant Blooms", 18, 12, 35.00, 70));
        inventory.add(new Seed("Carnation", 8, "Floral Bliss", 15, 20, 20.00, 90));
        inventory.add(new Seed("Dahlia", 9, "Bright Petals", 20, 18, 22.00, 100));
        inventory.add(new Seed("Aster", 7, "Wild Bloomers", 12, 25, 18.00, 110));
        inventory.add(new Seed("Cactus", 12, "Succulent Growers", 50, 15, 30.00, 90));
        inventory.add(new Seed("Aloe Vera", 10, "Healing Plants", 80, 20, 35.00, 100));
        inventory.add(new Seed("Ficus", 15, "Indoor Greens", 100, 12, 50.00, 60));
        inventory.add(new Seed("Bamboo", 18, "Zen Gardens", 500, 8, 60.00, 50));
        inventory.add(new Seed("Fern", 8, "Wild Bloomers", 150, 20, 25.00, 100));
        inventory.add(new Seed("Spider Plant", 7, "Indoor Greens", 120, 25, 22.00, 150));
        inventory.add(new Seed("Succulent Mix", 6, "Succulent Growers", 50, 35, 18.00, 200));
        inventory.add(new Seed("Palm Tree", 20, "Tropical Blooms", 1000, 5, 80.00, 30));
        inventory.add(new Seed("Rubber Tree", 12, "Indoor Greens", 800, 8, 60.00, 50));
        inventory.add(new Seed("Philodendron", 10, "Exotic Plants", 150, 18, 45.00, 80));
        inventory.add(new Seed("Baobab", 30, "Exotic Plants", 5000, 2, 150.00, 10));
        inventory.add(new Seed("Bonsai Tree", 24, "Zen Gardens", 300, 5, 100.00, 20));
        inventory.add(new Seed("Mimosa", 9, "Wild Bloomers", 30, 18, 22.00, 150));
        inventory.add(new Seed("Pitcher Plant", 10, "Carnivorous Co.", 20, 10, 35.00, 50));
        inventory.add(new Seed("Venus Flytrap", 8, "Carnivorous Co.", 15, 12, 30.00, 60));
        inventory.add(new Seed("Eucalyptus", 12, "Herbal Scents", 100, 8, 40.00, 70));
        inventory.add(new Seed("Sequoia", 36, "Forest Kings", 10000, 1, 500.00, 5));
        inventory.add(new Seed("Bamboo Orchid", 16, "Exotic Plants", 200, 4, 60.00, 25));
        inventory.add(new Seed("Dragon Tree", 18, "Indoor Greens", 250, 5, 75.00, 30));
        inventory.add(new Seed("Sundew", 7, "Carnivorous Co.", 10, 15, 25.00, 80));

        while (true) {
            System.out.println("\n-----------MAIN MENU-------------");
            System.out.println("(1) Browse Products");
            System.out.println("(2) View Cart and Checkout");
            System.out.println("\n(3) Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> browseProducts();
                case 2 -> viewCart();
                case 3 -> {
                    System.out.println("Exited SeedStory.");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void browseProducts() {
        while (true) {
            System.out.println("\n--------Sort Products By:--------");
            System.out.println("(1) Name (A-Z)");
            System.out.println("(2) Growth Duration (Weeks)");
            System.out.println("(3) Weekly Sales");
            System.out.println("\n(4) BACK");
            System.out.println("---------------------------------");
            System.out.print("Your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 4) break;

            switch (choice) {
                case 1 -> inventory.sort(Comparator.comparing(Seed::getName));
                case 2 -> inventory.sort(Comparator.comparingInt(Seed::getGrowthWeeks));
                case 3 -> inventory.sort(Comparator.comparingInt(Seed::getWeeklySales).reversed());
                default -> {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }
            }

            System.out.printf("\n%-15s %-15s %-20s %-10s %-10s %-10s %-10s\n","SEED NAME", "WEEKS(Growth)", "SEED BREEDER", "NET WT(g)", "SALES(pw)", "PRICE(PHP)", "STOCK");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            for (Seed seed : inventory) seed.display();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");

            System.out.print("\nAdd an item to cart? (yes/no): ");
            String addToCart = scanner.nextLine();

            if (addToCart.equalsIgnoreCase("yes")) {
                System.out.print("Enter seed name to add to cart: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter quantity to add: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                Seed selectedSeed = inventory.stream().filter(seed -> seed.getName().equalsIgnoreCase(name)).findFirst().orElse(null);

                if (selectedSeed != null && selectedSeed.getStock() >= quantity) {
                    cart.put(selectedSeed, cart.getOrDefault(selectedSeed, 0) + quantity);
                    selectedSeed.reduceStock(quantity);
                    System.out.printf("%d %s(s) added.\n", quantity, name);
                } else {
                    System.out.println("Invalid seed name or insufficient stock.");
                }
            }
        }
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nCart is empty.");
            return;
        }

        System.out.println("\nCART SUMMARY - SEEDSTORY");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-10s %-10s %-10s\n", "SEED NAME", "SEED BREEDER", "PRICE(PHP)", "QUANTITY", "TOTAL(PHP)");
        System.out.println("-------------------------------------------------------------------------------------");

        double subtotal = 0;

        for (Map.Entry<Seed, Integer> entry : cart.entrySet()) {
            Seed seed = entry.getKey();
            int quantity = entry.getValue();
            double total = seed.getPrice() * quantity;
            subtotal += total;
            System.out.printf("%-15s %-20s %-10.2f %-10d %-10.2f\n",
                    seed.getName(), seed.getBreeder(), seed.getPrice(), quantity, total);
        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("Subtotal: PHP %.2f\n", subtotal);

        double discount = (cart.values().stream().mapToInt(Integer::intValue).sum() >= 5) ? subtotal * 0.05 : 0;

        System.out.printf("Discount: -PHP %.2f (5%% off for 5 or more items)\n", discount);
        double total = subtotal - discount;
        System.out.printf("Total: PHP %.2f\n", total);
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.print("Proceed to payment? (yes/no): ");
        String proceed = scanner.nextLine();

        if (proceed.equalsIgnoreCase("yes")) {
            System.out.printf("Enter payment (Total: PHP %.2f): ", total);
            double payment = scanner.nextDouble();
            scanner.nextLine();

            if (payment >= total) {
                System.out.println("\nPayment successful.");
                System.out.println("\nRECEIPT - SEEDSTORY");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-20s %-10s %-10s %-10s\n", "SEED NAME", "SEED BREEDER", "PRICE(PHP)", "QUANTITY", "TOTAL(PHP)");
                System.out.println("-------------------------------------------------------------------------------------");

                for (Map.Entry<Seed, Integer> entry : cart.entrySet()) {
                    Seed seed = entry.getKey();
                    int quantity = entry.getValue();
                    double totalItem = seed.getPrice() * quantity;
                    System.out.printf("%-15s %-20s %-10.2f %-10d %-10.2f\n", seed.getName(), seed.getBreeder(), seed.getPrice(), quantity, totalItem);
                }

                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("Subtotal: PHP %.2f\n", subtotal);
                System.out.printf("Discount: -PHP %.2f (5%% off for 5 or more items)\n", discount);
                System.out.printf("Total: PHP %.2f\n", total);
                System.out.printf("Cash: PHP %.2f\n", payment);
                System.out.printf("Change: PHP %.2f\n", payment - total);
                System.out.println("-------------------------------------------------------------------------------------");

                cart.clear();
            } else {
                System.out.println("Insufficient payment. Transaction cancelled.");
            }
        }
    }
}