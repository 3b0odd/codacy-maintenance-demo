public class Calculator {

    public int calculate(int a, int b, String operation) {
        if (operation.equals("add")) {
            return a + b;
        } else if (operation.equals("sub")) {
            return a - b;
        } else if (operation.equals("mul")) {
            return a * b;
        } else if (operation.equals("div")) {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
