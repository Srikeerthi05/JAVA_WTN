import java.util.*;

class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Box) {
            Box b = (Box) o;
            return Objects.equals(this.getVolume(), b.getVolume());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume());
    }

    @Override
    public String toString() {
        return "Length =" + length +
               " Width =" + width +
               " Height =" + height +
               " Volume =" + String.format("%.2f", getVolume());
    }
}

public class SetOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxSet = new HashSet<>();

        System.out.print("Enter the number of Box: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.print("Enter Length: ");
            double l = sc.nextDouble();
            System.out.print("Enter Width: ");
            double w = sc.nextDouble();
            System.out.print("Enter Height: ");
            double h = sc.nextDouble();

            Box b = new Box(l, w, h);
            boxSet.add(b);  // Adds only if volume is unique
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box b : boxSet) {
            System.out.println(b);
        }

        sc.close();
    }
}
