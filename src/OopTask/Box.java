package OopTask;

public class Box {
    private int width;
    private int height;
    private int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public int volume() {
        return width * height * length;
    }
}