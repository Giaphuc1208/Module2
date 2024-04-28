package room;

public class FamilyRoom extends Room {
    public FamilyRoom(){
        super("Family Room", 750);
    }

    @Override
    public String toString() {
        return "FamilyRoom: category='%s', price=%d".formatted(category, price);
    }
}
