public class Shoes {
    private final String type;
    private final String color;
    private final int size;
    public Shoes(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }
    public String getType() {
            return type;
        }
    public String getColor() {
            return color;
        }
    public int getSize() {
            return size;
        }
    public String toString() {
        return "Shoe " + type + " " + color + " " + size;
    }
}
