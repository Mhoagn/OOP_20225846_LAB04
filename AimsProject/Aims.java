import java.util.ArrayList;

public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart cart = new Cart();

        // Tạo một số DVD mới
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Christopher Nolan", "Sci-Fi", "Teddy Bear", 19.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("001", "Superman", "Sci-Fi", 19.99f, "Christopher Nolan", 148);



        // Thêm DVD vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
//        cart.addDVD(dvd4);

        // Hiển thị nội dung giỏ hàng trước khi xóa
        System.out.println("Before removing a DVD:");
        cart.displayItems();

        ArrayList<DigitalVideoDisc> foundDVDs = cart.searchByTitle("Superman");
        if (!foundDVDs.isEmpty()) {
            System.out.println("Found DVDs by Title:");
            for (DigitalVideoDisc dvd : foundDVDs) {
                System.out.println(dvd.toString());
            }
        } else {
            System.out.println("No DVDs found with the given title.");
        }


        // Xóa một DVD khỏi giỏ hàng
        boolean isRemoved = cart.removeDVD(dvd2);
        if (isRemoved) {
            System.out.println("DVD \"" + dvd2.getTitle() + "\" has been removed from the cart.");
        } else {
            System.out.println("DVD \"" + dvd2.getTitle() + "\" could not be found in the cart.");
        }

        // Hiển thị nội dung giỏ hàng sau khi xóa
        System.out.println("After removing a DVD:");
        cart.displayItems();
    }
}
