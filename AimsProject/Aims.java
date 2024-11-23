public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart cart = new Cart();

        // Tạo một số DVD mới
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Christopher Nolan", "Sci-Fi", "Inception", 19.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("001", "Inception", "Sci-Fi", 19.99f, "Christopher Nolan", 148);



        // Thêm DVD vào giỏ hàng
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);
//        cart.addDVD(dvd4);

        // Hiển thị nội dung giỏ hàng trước khi xóa
        System.out.println("Before removing a DVD:");
        cart.displayItems();

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
