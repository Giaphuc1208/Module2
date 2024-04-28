package room;

public class DoubleRoom extends Room {
    public DoubleRoom(){
        super("Double Room", 500);
    }

    @Override
    public String toString() {
        return "DoubleRoom: category='%s', price=%d".formatted(category, price);
    }
}
