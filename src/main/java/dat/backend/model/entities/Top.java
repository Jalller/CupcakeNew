package dat.backend.model.entities;

public class Top {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public Top() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Top(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
