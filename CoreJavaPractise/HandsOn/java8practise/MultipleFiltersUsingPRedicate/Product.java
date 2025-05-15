package CoreJavaPractise.HandsOn.java8practise.MultipleFiltersUsingPRedicate;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " - " + price + " - " + category;
    }
}
