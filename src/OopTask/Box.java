package OopTask;

public class Box {
    private int width;
    private int height;
    private int length;
    private Material material;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;


    }

    public Box(int width, int height, int length, Material material) {
        this(width, height, length);
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


    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int volume() {
        return width * height * length;
    }
}