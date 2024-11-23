public class DigitalVideoDisc {
    private String id;
    private String title;
    private String category;
    private float cost;
    private String director;
    private int length;

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String id, String title, String category, float cost, String director, int length) {
        super();
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void displayInfo() {
        System.out.println("The title of DVD is: " + (this.title != null ? this.title : "N/A"));
        System.out.println("Category: " + (this.category != null ? this.category : "N/A"));
        System.out.println("Cost: $" + this.cost);
        System.out.println("Director: " + (this.director != null ? this.director : "N/A"));
        System.out.println("Length: " + (this.length > 0 ? this.length + " minutes" : "N/A"));
    }

    public boolean checkLength() {
        return (this.length > 0);
    }

    public boolean matchesTitle(String searchTitle) {
        return title.toLowerCase().contains(searchTitle.toLowerCase());
    }

    public boolean matchesCategory(String searchCategory) {
        return category.equalsIgnoreCase(searchCategory);
    }

    public boolean matchesPrice(Float minPrice, Float maxPrice) {
        if (minPrice != null && cost < minPrice) {
            return false;
        }
        if (maxPrice != null && cost > maxPrice) {
            return false;
        }
        return true;
    }
}
