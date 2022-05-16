package homework;

public class FirstClass {
    public static void main(String[] args) {
        String countryName = "Lithuania";
        System.out.println(countryName);

        int countryPopulation = 2800000;
        System.out.println(countryPopulation);

        int countryArea = 65300;
        System.out.println(countryArea);

        String countryCapital = "Vilnius";
        System.out.println(countryCapital);

        String countryLanguage = "Lithuanian";

        boolean isCountryInEu = true;
        System.out.println(isCountryInEu);

        char countryCurrency = 'E';
        System.out.println(countryCurrency);

        System.out.println("My favorite Country is " + countryName + "\nThe capital is " + countryCapital);
        System.out.printf("My favorite Country is %s \nThe capital is %s\n", countryName, countryCapital);
        System.out.println("The population of " + countryName + " is " + countryPopulation + " people.");
        System.out.printf("The population of %s is %d people.\n", countryName, countryPopulation);

        double exchangeRateEurJpy = 120.77;

        float price = 100.00f;
        System.out.println("What is the Euro to Yen exchange rate if change 100 Euros? " + exchangeRateEurJpy * price + "JPY");

        int a = 150;
        int b = 63;
        int c = a * b;
        System.out.println(c);

        int d = 577;
        int e = 17;
        System.out.printf("Number 577 multiplied by 17 is equal %d\n", d * e) ;

        float f = 777.07f;
        int g = 88;
        float h = f / g;
        System.out.println(h);

        int n = 1757;
        int m = 81;
        System.out.printf("Number 1757 divided by 81 is equal %d\n", n / m);

    }
}
