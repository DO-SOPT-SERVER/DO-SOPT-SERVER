public class Poketmon {
    private String name;
    private PoketmonType type;

    public Poketmon(String name) {
        this.name = name;
        System.out.println("내이름은"+name+"이야");
    }

    public Poketmon(PoketmonType type) {
        this.type = type;
    }

    public Poketmon(String name, PoketmonType type) {
        this.name = name;
        this.type = type;
    }
}
