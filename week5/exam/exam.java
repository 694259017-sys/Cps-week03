void main() {
    IO.print("Enter price of one dress : ");
    int price = Integer.parseInt(IO.readln());
    IO.print("Enter number of dresses to buy : ");
    int number = Integer.parseInt(IO.readln());
    IO.print("Enter discount rate : ");
    int discount = Integer.parseInt(IO.readln());
    IO.println("------------------------------------------");
    float totalcost = price * number;
    float discountamount = number * discount;
    float netpay = totalcost - discountamount;
    IO.println("Total cost = " + totalcost + " baht");
    IO.println("Discount Amount = " + discountamount + " baht");
    IO.println("Net pay = " + netpay + " baht");
}
