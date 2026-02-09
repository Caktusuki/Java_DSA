public class Q2 {
    public static void main(String[] args) {
        double radius = 5;
        double height = 10;
        double pi = Math.PI;

        // Volume of Cone
        double volumeCone = (1.0 / 3.0) * pi * radius * radius * height;
        System.out.println("Volume of Cone: " + volumeCone);

        // Volume of Cylinder
        double volumeCylinder = pi * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volumeCylinder);

        // Volume of Hemisphere
        double volumeHemisphere = (2.0 / 3.0) * pi * radius * radius * radius;
        System.out.println("Volume of Hemisphere: " + volumeHemisphere);
    }
}
