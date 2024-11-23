import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> items;
    private int maxItems;

    public Cart() {
        this.items = new ArrayList<>();
        this.maxItems = 20;
    }

    public ArrayList<DigitalVideoDisc> getItems() {
        return items;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (items.size() < maxItems) {
            items.add(dvd);
            System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the cart.");
        } else {
            System.out.println("Cannot add DVD. The cart is full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDVD(dvd); // Call the existing method to add each DVD
        }
    }

    public boolean removeDVD(DigitalVideoDisc dvd) {
        return items.remove(dvd);
    }

    public float calculateTotalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc dvd : items) {
            totalCost += dvd.getCost();
        }
        return totalCost;
    }

    public void displayItems() {
        System.out.println("Cart contains " + items.size() + " DVD(s):");
        for (DigitalVideoDisc dvd : items) {
            dvd.displayInfo();
            System.out.println();
        }
        System.out.println("Total cost: $" + calculateTotalCost());
    }

}
