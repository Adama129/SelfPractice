package Self_Practice_07;

public class Item {
    public static void main(String[] args) {

    }
    public String itemName;
    public double unitPrice;
    int quantity;
    double totalCost;


    public double calcCost(double unitPrice, int quantity) {
        totalCost = quantity * unitPrice;
        return totalCost;
    }


    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }
}
