public class VolumeCalculator {

    // Method to calculate the volume of a cylinder
    public double calculateVolume(double radius, double height) {
        final double PI = 3.14;
        return PI * radius * radius * height;
    }

    // Method to calculate the volume of a cuboid
    public double calculateVolume(int length, int breadth, int height) {
        return length * breadth * height;
    }
}
