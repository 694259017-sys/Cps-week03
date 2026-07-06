void main() {
IO.print("Enter Your First Number :");
int n1 = Integer.parseInt(IO.readln());
IO.print("Enter Your Second Number :");
int n2 = Integer.parseInt(IO.readln());
IO.print("Enter Your Third Number :");
int n3 = Integer.parseInt(IO.readln());
IO.print("Enter Your Fourth Number :");
int n4 = Integer.parseInt(IO.readln());
IO.print("Enter Your Fifth Number :");
int n5 = Integer.parseInt(IO.readln());
int sum = n1+n2+n3+n4+n5;
double avg = sum/5;
IO.println("Sum of all = "+ sum + " and "+ "average = " + avg);
}