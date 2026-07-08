void main(){
    IO.print("Enter Hours : ");
    int hours = Integer.parseInt(IO.readln());
    IO.print("Enter Minutes : ");
    int minutes = Integer.parseInt(IO.readln());
    int total = (hours*60) + minutes;
IO.println("Total minutes = " + total);
}