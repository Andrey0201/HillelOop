package OopTask;

public class ColorBox extends Box {
    private Color color;


    public ColorBox(int width, int height, int length, Color color, Material material) {
        super(width, height, length, material);
        this.color = color;


    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}