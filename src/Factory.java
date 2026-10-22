public class Factory {
    //instance variables
    //only use public for instance variables
    public String owner = "Max";
    public int yearFounded = 2026;
    public boolean isOpen = true;
    public Donuts DonutOrder1;
    public Donuts DonutOrder2;


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

        //make an object of type Donuts
        DonutOrder1 = new Donuts();
        System.out.println(DonutOrder1.numberOfDonuts);
        //todo: print all of the instance variables as donuts

        System.out.println(DonutOrder1.frostingType);
        System.out.println(DonutOrder1.hasFilling);
        DonutOrder1.numberOfDonuts = DonutOrder1.numberOfDonuts + 1;

        //extra challenge: have words print that explain what the variables are

        DonutOrder2 = new Donuts();
        System.out.println(DonutOrder2.numberOfDonuts);
        System.out.println(DonutOrder2.frostingType);
        System.out.println(DonutOrder2.hasFilling);
        DonutOrder2.numberOfDonuts = DonutOrder2.numberOfDonuts + 1;

    }

    //end of factory method


}//end of file
