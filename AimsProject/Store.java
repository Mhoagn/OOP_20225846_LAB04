import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("Cannot add a null DVD to the store.");
        }
    }

    // Method to remove a DVD from the store
    public boolean removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
            return true;
        } else {
            System.out.println("DVD \"" + dvd.getTitle() + "\" not found in the store.");
            return false;
        }
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            System.out.println("Items available in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                DigitalVideoDisc dvd = itemsInStore.get(i);
                System.out.println((i + 1) + ". " + dvd.toString());
            }
        }
        System.out.println("**************************************************");
    }
}
