public class Factory {
    //instance variables
    //only use public for instance variables
    public String owner = "Max";
    public int yearFounded = 2026;
    public boolean isOpen = true;
    public SambaPlayers SambaPlayer1;
    public SambaPlayers SambaPlayer2;
    public SambaPlayers SambaPlayer3;
    //public Donuts DonutOrder1;
    //public Donuts DonutOrder2;
   public int randomnumber;
    public int randomnumber2;

    //todo: make 2 more variables called isOpen and yearFounded
    //What data type do we need? Give the variable values
    public static void main(String[] args) {
        Factory a = new Factory();

    }

    //end of psvm

    //special method: constructor
    //name has to be the same name as class
    //you do not say void
    public Factory() {
        System.out.println("Welcome to Max's factory!");
        System.out.println("The factory was founded in "+yearFounded);
        System.out.println("It is "+ isOpen+ " that the factory is open ");
        randomnumber = (int)(Math.random() * 3)+1;
        randomnumber2 = (int)(Math.random() * 34)+1;
        //make an object of type Donuts

        SambaPlayer1 = new SambaPlayers(randomnumber, randomnumber2, "low", true);
//        System.out.println(SambaPlayer1.hasaura);
//        System.out.println(SambaPlayer1.goalsPerNinety);
//        System.out.println(SambaPlayer1.socktrait);
//        System.out.println(SambaPlayer1.jerseyNumber);
        SambaPlayer1.printinfo();

        SambaPlayer2 = new SambaPlayers(randomnumber, randomnumber2, "high", false);
        SambaPlayer2.printinfo();

        SambaPlayer3 = new SambaPlayers(randomnumber, randomnumber2, "mid", true);
        SambaPlayer3.printinfo();
        System.out.println();
//        //DonutOrder1 = new Donuts(randomnumber, "glazed", true);
//
//        //System.out.println(DonutOrder1.numberOfDonuts);
//        //todo: print all of the instance variables as donuts
//
//        System.out.println(DonutOrder1.frostingType);
//        System.out.println(DonutOrder1.hasFilling);
//        DonutOrder1.numberOfDonuts = DonutOrder1.numberOfDonuts + 1;

        //extra challenge: have words print that explain what the variables are

//        DonutOrder2 = new Donuts(randomnumber2, "Chocolate",true);
//        System.out.println(DonutOrder2.numberOfDonuts);
//        System.out.println(DonutOrder2.frostingType);
//        System.out.println(DonutOrder2.hasFilling);
//        DonutOrder2.numberOfDonuts = DonutOrder2.numberOfDonuts + 1;
//
//        DonutOrder2.printinfo();
    }

    //end of factory method


}//end of file
