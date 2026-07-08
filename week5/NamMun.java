void main() {

    IO.print("Enter Distance(km) : ");
    float kilo = Float.parseFloat(IO.readln());
    IO.print("Enter Fuel effiency(km/liter) : ");
    float f_use = Float.parseFloat(IO.readln());
    IO.print("Enter Fuel price per liter : ");
    float ngern = Float.parseFloat(IO.readln());
    float fueluse = kilo/f_use;
    float totalcost = fueluse * ngern;
    IO.println("Fuel use = " + fueluse +" liter");
    IO.println("Total cost = " + totalcost + " baht" );
}