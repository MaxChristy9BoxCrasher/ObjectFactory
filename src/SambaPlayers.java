public class SambaPlayers {


public String socktrait;
public boolean hasaura;
public int goalsPerNinety;
public int jerseyNumber;

public SambaPlayers(int pgoalsPerNinety, int pjerseyNumber, String psocktrait, boolean phasaura){
    socktrait = psocktrait;
    hasaura = phasaura;
    goalsPerNinety = pgoalsPerNinety;
    jerseyNumber = pjerseyNumber;

}

public void printinfo(){
    System.out.println("the players sock trait is " +socktrait);
    System.out.println("has aura is " + hasaura);
    System.out.println("the players goals per 90 is " + goalsPerNinety);
    System.out.println("the player wears the number " + jerseyNumber);
}
}
