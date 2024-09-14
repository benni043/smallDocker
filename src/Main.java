public class Main {
    public static void main(String[] args) {
        if (args.length != 1) return;

        try {
            double celsius = Double.parseDouble(args[0]);

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.printf("%.2f Celsius = %.2f Fahrenheit.\n", celsius, fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
    }
}