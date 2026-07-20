void main() {
    IO.println("Enter Your Gender :");
    String gender = IO.readln();
    if (gender.equals("male")) {
        IO.println("Enter Your Weight(kg) :");
        float mWeight = Float.parseFloat(IO.readln());
        IO.println("Enter Your Height(cm) :");
        float mHeight = Float.parseFloat(IO.readln());
        IO.println("Enter Your Ages :");
        float mAge = Float.parseFloat(IO.readln());
        double mBmr = 66.0 + (13.7*mWeight) + (5*mHeight) - (6.8*mAge);
        IO.println("Weight = %.2f kg, Height = %.2f m, Age = %.2f, BMR = %.2f".formatted(mWeight, mHeight,mAge, mBmr));
    }
    if (gender.equals("female")) {
        IO.println("Enter Your Weight(kg) :");
        float fWeight = Float.parseFloat(IO.readln());
        IO.println("Enter Your Height(cm) :");
        float fHeight = Float.parseFloat(IO.readln());
        IO.println("Enter Your Ages :");
        float fAge = Float.parseFloat(IO.readln());
        double fBmr = 655.0 + (9.6 * fWeight) + (1.8 * fHeight) - (4.7 * fAge);
        IO.println("Weight = %.2f kg, Height = %.2f m, Age = %.2f, BMR = %.2f".formatted(fWeight, fHeight, fAge, fBmr));
    }
}