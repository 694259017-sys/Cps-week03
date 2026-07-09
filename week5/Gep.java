void main() {
    IO.print("Enter Initial Saving : ");
    int initialsaving = Integer.parseInt(IO.readln());
    IO.print("Enter Monthly Saving : ");
    int monthlysaving = Integer.parseInt(IO.readln());
    IO.print("Enter Number of months : ");
    int months = Integer.parseInt(IO.readln());
    IO.print("Enter Interest Percent : ");
    int interestpercent = Integer.parseInt(IO.readln());
    double totalsaving =initialsaving+monthlysaving*months;
    double interest = totalsaving*interestpercent/100.00;
    double finalsaving = totalsaving + interest;
    IO.println("Total saving before interest = " + totalsaving + " baht");
    IO.println("Interest = " + interest + " baht");
    IO.println("Final saving = " + finalsaving + " baht");
}