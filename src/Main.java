public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Bitte geben Sie eine Celsius-Temperatur als Argument ein.");
            return;
        }

        try {
            double celsius = Double.parseDouble(args[0]);

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.printf("%.2f Celsius entspricht %.2f Fahrenheit.\n", celsius, fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie eine gültige Zahl für die Celsius-Temperatur ein.");
        }
    }
}