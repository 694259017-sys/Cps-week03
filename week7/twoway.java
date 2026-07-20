void main() {
    int choice = Integer.parseInt(IO.readln());
    if (choice == 1) {
        IO.println("Enter Base of Triangle :");
        int triangleBase = Integer.parseInt(IO.readln());
        IO.println("Enter Height of Triangle :");
        int triangleHeight = Integer.parseInt(IO.readln());
        double trianglearea = (1.0 / 2.0) * triangleBase * triangleHeight;
        IO.println("Area of triangle = %.2f square units".formatted(trianglearea));
    }
    if (choice == 2) {
        IO.println("Enter Your Weight(kg) :");
        double weightkg = Double.parseDouble(IO.readln());
        IO.println("Enter Your Height(cm) :");
        double heightcm = Double.parseDouble(IO.readln());
        Double bmi = weightkg / (heightcm * heightcm);
        IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weightkg, heightcm, bmi));
    }
}