public class Temperature {

    /**
     * Converts temperature from Fahrenheit to Celsius degree.
     *
     * @param fahrenheit temperature degree in Fahrenheit
     * @return temperature degree in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {

        // TODO fill in code here and replace the return statement
        double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;
        return celsius;
    }

    /**
     * Converts temperature from Celsius to Fahrenheit degree.
     *
     * @param celsius temperature degree in Celsius
     * @return temperature degree in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        // TODO fill in code here and replace the return statement
        double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
        return fahrenheit;
    }

}
