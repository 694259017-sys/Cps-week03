void main() {

    IO.print("Enter Your Weight(kg): ");
    double weight = Double.parseDouble(IO.readln());
    IO.print("Enter Your Height(m): ");
    double height = Double.parseDouble(IO.readln());
    double bam = weight/(height*height);
    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bam));
}