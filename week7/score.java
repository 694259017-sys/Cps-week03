void main() {
    IO.print("Enter Midterm score : ");
    int midpoint = Integer.parseInt(IO.readln());
    IO.print("Enter Final score : ");
    int lastpoint = Integer.parseInt(IO.readln());
    int totalScore = midpoint + lastpoint;
    IO.print("Your Total Score = " + totalScore);
    if (totalScore > 50) {
        IO.println(" You Pass");
    } else {
        IO.println(" You fail");
    }
}