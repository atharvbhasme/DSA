package java_basic;

public class methods {
    public static void main(String[] args) {
        // Calling the static method
        Test.staticMethod();

        // Creating an object to call instance methods
        Test obj = new Test();
        int ans = obj.numberReturn(20);
        System.out.println("Print the number: " + ans);

        // Calling the new instance method
        obj.instanceMethod();
    }
}

class Test {
    int a = 10;
    int num = 23;

    // Instance method
    void printNumber() {
        System.out.println("Print a: " + a);
    }

    int numberReturn(int b) {
        printNumber();
        int sum = a + b;
        return sum;
    }

    // New instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
