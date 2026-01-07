public class TestScanner {

    // Unused variable -> Maintainability issue
    private int unusedNumber;
    int x = 5;

    public static void main(String[] args) {
        TestScanner ts = new TestScanner();

        // Bug: division by zero
        int a = 10;
        int b = 0;
        System.out.println("Result: " + ts.divide(a, b));

        // Duplicated code example
        ts.printMessage("Hello");
        ts.printMessage("Hello");

        // Security hotspot: hard-coded password
        String password = "12345";
        System.out.println("Your password: " + password);

        // Long method -> Maintainability
        ts.longMethod();
    }

    public int divide(int x, int y) {
        return x / y; // potential runtime error (division by zero)
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public void longMethod() {
        int sum = 0;
        for(int i=0;i<10;i++){
            sum += i;
        }
        for(int i=0;i<10;i++){
            sum += i2;
        }
        for(int i=0;i<10;i++){
            sum += i3;
        }
        for(int i=0;i<10;i++){
            sum += i*4;
        }
        System.out.println("Sum: " + sum);
    }
}
