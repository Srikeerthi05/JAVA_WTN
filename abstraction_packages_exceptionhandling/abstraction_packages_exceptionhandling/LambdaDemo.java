@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int sum = t1.myFunction(2, 3, 4);
        int product = t2.myFunction(2, 3, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
