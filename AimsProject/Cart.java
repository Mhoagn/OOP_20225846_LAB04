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

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (items.size() < maxItems) {
            items.add(dvd);
            System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the cart.");
        } else {
            System.out.println("Cannot add DVD. The cart is full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if(items.size() < maxItems){
                items.add(dvd); 
                System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the cart.");
            }
            else{
                System.out.println("Cannot add DVD. The cart is full.");
                break;
            }
        }
    }

    // public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    //     for (DigitalVideoDisc dvd : dvds) {
    //         if (items.size() < maxItems) {
    //             items.add(dvd);
    //             System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the cart.");
    //         } else {
    //             System.out.println("Cannot add DVD. The cart is full.");
    //             break; // Stop adding if the cart is full
    //         }
    //     }
    // }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (items.size() < maxItems - 2) {
            items.add(dvd1);
            items.add(dvd2);
            System.out.println("DVDs \"" + dvd1.getTitle() + "\" and \"" + dvd2.getTitle() + "\" have been added to the cart.");
        } else {
            System.out.println("Cannot add DVDs. The cart is full.");
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

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).toString());
        }
        System.out.println("Total cost: $" + calculateTotalCost());
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc searchById(String id) {
        for (DigitalVideoDisc dvd : items) {
            if (dvd.getId().equals(id)) {
                return dvd;
            }
        }
        return null; // Không tìm thấy
    }

    public ArrayList<DigitalVideoDisc> searchByTitle(String title) {
        ArrayList<DigitalVideoDisc> results = new ArrayList<>();
        for (DigitalVideoDisc dvd : items) {
            if (dvd.matchesTitle(title)) {
                results.add(dvd);
            }
        }
        return results;
    }
    
}
