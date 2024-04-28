package exercise1;

public class Country {
    private int id;
    private String code;
    private String name;
    public Country(){
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country is " +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'';
    }
}
