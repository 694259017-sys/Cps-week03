void main() {

    IO.print("Enter Salary : ");
    double salary = Double.parseDouble(IO.readln());
    double tax = (10.0 / 100.0) * salary;
    IO.println("Salary = %.2f , Tax = %.2f ".formatted(salary, tax));
}