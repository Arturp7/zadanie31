public class Main {
    public static void main(String[] args) {
        MousePad pad1 = new MousePad();
        pad1.dimensionX = 200;
        pad1.dimensionY = 500;
        pad1.thickness = 4;
        pad1.color = "blue";

        MousePad pad2 = new MousePad();
        pad2.dimensionX = 100;
        pad2.dimensionY = 300;
        pad2.thickness = 3;
        pad2.color = "red";

        System.out.println("Mousepad nr 1 features" +" " + pad1.dimensionY +" "+ pad1.dimensionX + " " + pad1.color + " "
        + pad1.thickness);
        System.out.println("Mousepad nr 2 features" +" " + pad2.dimensionY +" "+ pad2.dimensionX + " " + pad2.color + " "
                + pad2.thickness);

    }
}
