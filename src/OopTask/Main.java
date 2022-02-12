package OopTask;

public class Main {
    public static void main(String[] args) {
        try {

            Box box1 = new Box(1, 2, 3, Material.GLASS);
            Box box2 = new Box(2, 3, 4, Material.CARTON);
            Box box3 = new Box(3, 4, 5, Material.WOOD);
            Box box4 = new Box(4, 5, 6, Material.PLASTIC);
            Box box5 = new Box(6, 7, 8, Material.IRON);


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


            ColorBox colorBox1 = new ColorBox(1, 2, 3, Material.PLASTIC, Color.BLACK);
            ColorBox colorBox2 = new ColorBox(5, 5, 5, Material.WOOD, Color.GREEN);
            ColorBox colorBox3 = new ColorBox(3, 4, 5, Material.CARTON, Color.GREY);

            System.out.printf("ColorBox1 is %s and %s\n", colorBox1.getColor(), colorBox1.getMaterial());
            System.out.printf("ColorBox2 is %s and %s\n", colorBox2.getColor(), colorBox2.getMaterial());
            System.out.printf("ColorBox3 is %s and %s\n", colorBox3.getColor(), colorBox3.getMaterial());

            colorBox1.setColor(Color.RED);
            colorBox1.setMaterial(Material.GLASS);
            System.out.printf("ColorBox1 is %s and %s\n", colorBox1.getColor(), colorBox1.getMaterial());
            System.out.println(colorBox2);
            System.out.println();

            Warehouse warehouse = new Warehouse(15);
            warehouse.add(box1);
            warehouse.add(box2);
            warehouse.add(box3);
            warehouse.add(box4);
            warehouse.add(box5);
            warehouse.add(colorBox1);
            warehouse.add(colorBox2);
            warehouse.add(colorBox3);


            System.out.println(warehouse);


        } catch (IllegalArgumentException e) {
            System.out.println("Number can't be less or equal 0");

        }

    }


}
