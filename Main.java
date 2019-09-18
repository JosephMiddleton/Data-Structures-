import java.util.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String args[])
    {
        Main m = new Main();
        m.go();
    }

    private void go()
    {
      Person p1 = new Person("Bill", 19);
      Person p2 = new Person("Bob", 25);
      Person p3 = new Person("Jim", 32);
      Person p4 = new Person("Tim", 44);

      List<Person> people = new ArrayList<Person>();
      people.add(p1);
      people.add(p2);
      people.add(p3);
      people.add(p4);

      collection.sort(people);
      System.out.println(people);
    }

        Collections.sort(people,


        new Comparator<Person>()
        {
            @Override
            
        }







}