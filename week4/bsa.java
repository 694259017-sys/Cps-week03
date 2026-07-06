void main() {

    IO.print("Enter Your Wide: ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter Your lenght(m): ");
    double lenght = Double.parseDouble(IO.readln());
    double BSA = (wide * lenght) / 360;
    IO.println("Wide = %.2f kg, Lenght = %.2f m, BSA = %.2f".formatted(wide, lenght, BSA));
}