package dat.backend.model.entities;

public class Bottom {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Bottom(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
