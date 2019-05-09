public class Main {
    public static void main(String[] args) {
        MousePad pad1 = new MousePad(100, 500, 4, "blue" );
        MousePad pad2 = new MousePad(200, 400, 3, "red" );


        System.out.println("Mousepad nr 1 features:" +" " + pad1.dimensionY +" "+ pad1.dimensionX + " " + pad1.color + " "
        + pad1.thickness);
        System.out.println("Mousepad nr 2 features: " +" " + pad2.dimensionY +" "+ pad2.dimensionX + " " + pad2.color + " "
                + pad2.thickness);

    }
}
