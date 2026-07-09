void main() {
    IO.print("Enter Salary : ");
    int salary = Integer.parseInt(IO.readln());
    IO.print("Enter Detuctionpercent : ");
    int detuctionpercent = Integer.parseInt(IO.readln());
    float detuction = salary * detuctionpercent/100;
    float netsalary = salary - detuction;
    IO.println("Detuction = " + detuction + " baht");
    IO.println("Net Salary = " + netsalary + " baht");
}