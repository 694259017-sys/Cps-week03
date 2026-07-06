void main() {

    IO.print("Enter Fahrenheit: ");
    double fahrenheit = Double.parseDouble(IO.readln());
    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
    IO.println("Fahrenheit = %.2f , Celsius = %.2f ".formatted(fahrenheit, celsius));
}