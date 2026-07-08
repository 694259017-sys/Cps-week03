void main() {
    IO.print("Enter score 1 : ");
    int score1 = Integer.parseInt(IO.readln());
    IO.print("Enter score 2 : ");
    int score2 = Integer.parseInt(IO.readln());
    IO.print("Enter score 3 : ");
    int score3 = Integer.parseInt(IO.readln());
    IO.print("Enter bonus score : ");
    int bonusscore = Integer.parseInt(IO.readln());
    int totalscore = score1+ score2+ score3;
    int totalwithbonus = totalscore + bonusscore;
    double avgoftotalwithbonus = totalwithbonus / 3.0;
    IO.println("Total score = " + totalscore + " point");
    IO.println("Total score with bonus = " + totalwithbonus + " point");
    IO.println("Aeverage of Total score with bonus = %.2f points".formatted(avgoftotalwithbonus));
}