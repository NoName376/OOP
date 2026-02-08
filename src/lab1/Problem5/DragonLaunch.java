package lab1.Problem5;

import java.util.Vector;

public class DragonLaunch 
{
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) 
    {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() 
    {
        int boysWaitingForGirls = 0;

        for (Person p : kidnapped) 
        {
            if (p.getGender() == Gender.BOY) 
            {
                boysWaitingForGirls++;
            } 
            else 
            {
                if (boysWaitingForGirls > 0) 
                {
                    boysWaitingForGirls--;
                } 
                else
                {
                    return true;
                }
            }
        }

        return boysWaitingForGirls > 0;
    }

    public static void main(String[] args) 
    {
        DragonLaunch cave = new DragonLaunch();

        cave.kidnap(new Person(Gender.BOY, "B1"));
        cave.kidnap(new Person(Gender.BOY, "B2"));
        cave.kidnap(new Person(Gender.GIRL, "G1"));
        cave.kidnap(new Person(Gender.GIRL, "G2"));
        System.out.println("Line BBGG. Will dragon eat? " + cave.willDragonEatOrNot());

        DragonLaunch cave2 = new DragonLaunch();
        cave2.kidnap(new Person(Gender.GIRL, "G1"));
        cave2.kidnap(new Person(Gender.BOY, "B1"));
        cave2.kidnap(new Person(Gender.GIRL, "G2"));
        cave2.kidnap(new Person(Gender.BOY, "B2"));
        System.out.println("Line GBGB. Will dragon eat? " + cave2.willDragonEatOrNot());
    }
}