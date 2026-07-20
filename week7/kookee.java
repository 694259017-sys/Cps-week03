void main() {
    int number = Integer.parseInt(IO.readln());
    if (number % 2 == 0) {
        IO.println("This number " + number + " is even.");
    } else {
        IO.println("This number " + number + " is odd.");
    }
}
