package room;

public class DeluxeRoom extends Room {
    public DeluxeRoom(){
        super("Deluxe Room", 200);
    }

    @Override
    public String toString() {
        return "DeluxeRoom: category='%s', price=%d".formatted(category, price);
    }
}
