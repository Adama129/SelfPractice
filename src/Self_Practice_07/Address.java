package Self_Practice_07;

public class Address {
    public static void main(String[] args) {

    }
    int buildingNumber;
    String street;
    String city;
    String state;
    String zipCode;

    public String toString() {
        return buildingNumber +
                " " + street + "\n" +
                city + " " + state + ", " +
                zipCode;
    }
}
