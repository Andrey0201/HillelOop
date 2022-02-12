package OopTask;

import java.util.Arrays;

public class Warehouse {
    private Box[] boxes;
    private int qualityBox;
    private int indexBox;

    public Warehouse(int qualityBox) {
        this.qualityBox = qualityBox;
        boxes = new Box[this.qualityBox];
    }

    public void add(Box box) {
        if (indexBox >= qualityBox) {
            System.out.println("Can't add boxes more for size warehouse!");
        } else {
            boxes[indexBox++] = box;
        }
    }

    @Override
    public String toString() {
        Box[] temp = new Box[indexBox];
        for (int i = 0; i < indexBox; i++) {
            temp[i] = boxes[i];

        }
        boxes = temp;
        return Arrays.toString(boxes);

    }
}
