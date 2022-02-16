
public class Shirt {
    public static void main(String[] args) {
        System.out.println("Clase Shirt");
    }

    public int shirtID = 4;
    public String description = "Polo-Shirt";
    public char colorCode = 'U';
    public double price = 60.8;
    public int quantityInStock = 0;

    public void displayShirtInformation(){
        System.out.println("Shirt ID:" + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color code:" + colorCode);
        System.out.println("Shirt Price:" + price);
        System.out.println("Quantity in stock:" + quantityInStock);
    }

}
