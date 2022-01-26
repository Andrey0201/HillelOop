package OopTask;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(2, 3, 4);
        Box box3 = new Box(3, 4, 5);
        Box box4 = new Box(4, 5, 6);
        Box box5 = new Box(6, 7, 8);

        System.out.println(box1.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(box4.volume());
        System.out.println(box5.volume());

    }


}
