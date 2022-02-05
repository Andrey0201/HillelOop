package OopTask;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(2, 3, 4);
        Box box3 = new Box(3, 4, 5);
        Box box4 = new Box(4, 5, 6);
        Box box5 = new Box(6, 7, 8);

        System.out.printf("box1 volume =%4d cm³\n", box1.volume());
        System.out.printf("box2 volume =%4d cm³\n", box2.volume());
        System.out.printf("box3 volume =%4d cm³\n", box3.volume());
        System.out.printf("box4 volume =%4d cm³\n", box4.volume());
        System.out.printf("box5 volume =%4d cm³\n", box5.volume());
        System.out.println();

        box1.setWidth(2);
        box1.setHeight(2);
        box1.setLength(2);

        System.out.printf("box1 volume =%4d cm³\n", box1.volume());

        System.out.println();
        System.out.printf("""
                width box2 =%2d cm
                height box2 =%2d cm
                length box2 =%2d cm
                \s""", box2.getWidth(), box2.getHeight(), box2.getLength());

        System.out.println();


        ColorBox colorBox1 = new ColorBox(1, 2, 3, Color.BLACK, Material.PLASTIC);
        ColorBox colorBox2 = new ColorBox(2, 3, 4, Color.GREEN, Material.WOOD);
        ColorBox colorBox3 = new ColorBox(3, 4, 5, Color.GREY, Material.CARTON);

        System.out.printf("ColorBox1 is %s and %s\n", colorBox1.getColor(), colorBox1.getMaterial());
        System.out.printf("ColorBox2 is %s and %s\n", colorBox2.getColor(), colorBox1.getMaterial());
        System.out.printf("ColorBox3 is %s and %s\n", colorBox3.getColor(), colorBox1.getMaterial());

        colorBox1.setColor(Color.RED);
        colorBox1.setMaterial(Material.GLASS);
        System.out.printf("ColorBox1 is %s and %s\n", colorBox1.getColor(), colorBox1.getMaterial());


    }


}
