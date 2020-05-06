public class EinheitenUmrechnenLoesung {
    // Celsius = 5/9 * (Fahrenheit - 32).
    // 9/5 * Celsius + 32 = Fahrenheit
    // Celsius = Kelvin - 273.15.
    // Die tiefste mögliche Temperatur ist den absoluten Nullpunkt 0K.
    public static void main(String[] args) {
       double temperaturInCelsion = 40.2;
       // Aufgabe hier: Ausgabe in Kelvin und Fahrenheit
        System.out.println(celsius2kelvin(temperaturInCelsion));
        System.out.println(celsius2fahrenheit(temperaturInCelsion));

        // Celsius -> Fahrenheit
        double temperaturInFahrenheit = 105;
        System.out.println(fahrenheit2celsius(temperaturInFahrenheit));
        System.out.println(fahrenheit2kelvin(temperaturInFahrenheit));
        // Fahreneinheit -> Celsius ODER Fahrenheit -> Kelvin
    }
    // Verwende Funktionen zur Berechnung!
    static double fahrenheit2celsius(double fahrenheit) {
        return 5.0 / 9 * (fahrenheit - 32);
    }

    static double celsius2fahrenheit(double celsius) {
        return 9.0 / 5 * celsius + 32;
    }

    static double kelvin2celsius(double kelvin) {
        return kelvin - 273.15;
    }

    static double celsius2kelvin(double celsius) {
        return celsius + 273.15;
    }

    static double fahrenheit2kelvin(double fahrenheit) {
        double celsius = fahrenheit2celsius(fahrenheit);
        return celsius2kelvin(celsius);
    }
}
