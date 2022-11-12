package dat.backend.model.entities;

public class Cupcake {
    private int topId; //delete
    private int bottomId;
    private int quantity;

    private Top top;
    private Bottom bottom;

    @Override
    public String toString() {
        return "Cupcake{" +
                "topId=" + topId +
                ", bottomId=" + bottomId +
                ", quantity=" + quantity +
                '}';
    }

    public int getTopId() {
        return topId;
    }

    public int getBottomId() {
        return bottomId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Cupcake(int topId, int bottomId, int quantity) {
        this.topId = topId;
        this.bottomId = bottomId;
        this.quantity = quantity; //her hent fra db, hop ned i db
    }
}

//package dat.backend.model.entities;
//
//public class Cupcake {
//
//    private Top top;
//    private Bottom bottom;
//    private int quantity;
//
//
//    @Override
//    public String toString() {
//        return "Cupcake{" +
//                "top=" + top +
//                ", bottom=" + bottom +
//                ", quantity=" + quantity +
//                '}';
//    }
//
//    public Top getTop() {
//        return top;
//    }
//
//    public Bottom getBottom() {
//        return bottom;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public Cupcake(Top top, Bottom bottom, int quantity) {
//        this.top = top;
//        this.bottom = bottom;
//        this.quantity = quantity;
//    }
//}
