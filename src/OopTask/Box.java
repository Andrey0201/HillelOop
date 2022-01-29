package OopTask;

public class Box {
    private int width;
    private int height;
    private int length;
    private String color;
    private String material;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;


    }

    public Box(int width, int height, int length, String color, String material) {
        this(width, height, length);
        this.color = color;
        this.material = material;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("Width can't  be less or equals 0");
            return;
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Height can't  be less or equals 0");
            return;
        }
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.out.println("Length can't  be less or equals 0");
            return;
        }
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int volume() {
        return width * height * length;
    }
}