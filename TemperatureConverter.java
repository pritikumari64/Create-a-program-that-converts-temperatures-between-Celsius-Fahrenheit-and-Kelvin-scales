import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Select the scale you want to convert from:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        double convertedTemperature;

        switch (choice) {
            case 1: // Celsius
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", temperature, convertedTemperature);
                convertedTemperature = celsiusToKelvin(temperature);
                System.out.printf("%.2f Celsius = %.2f Kelvin\n", temperature, convertedTemperature);
                break;

            case 2: // Fahrenheit
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", temperature, convertedTemperature);
                convertedTemperature = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f Fahrenheit = %.2f Kelvin\n", temperature, convertedTemperature);
                break;

            case 3: // Kelvin
                convertedTemperature = kelvinToCelsius(temperature);
                System.out.printf("%.2f Kelvin = %.2f Celsius\n", temperature, convertedTemperature);
                convertedTemperature = kelvinToFahrenheit(temperature);
                System.out.printf("%.2f Kelvin = %.2f Fahrenheit\n", temperature, convertedTemperature);
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
                break;
        }
        
        scanner.close();
    }
}
