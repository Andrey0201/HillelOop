package OopTask;

import java.util.Arrays;

public class Warehouse {
    private Box[] boxes;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes;


    }

    public Box[] getBoxes() {
        return boxes;
    }

    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return  Arrays.toString(boxes);

    }
}
