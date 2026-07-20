void main()  {
    IO.println("Enter First Number : ");
    int num1 = Integer.parseInt(IO.readln());
    IO.println("Enter Second Number : ");
    int num2 = Integer.parseInt(IO.readln());
    if (num1 > num2) {
        int totalone = num1 - num2;
        IO.println("Total = " +totalone);
    } else {
        int totaltwo = num1 + num2;
        IO.println("Total = " + totaltwo);
    }
}

