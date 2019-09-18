public class Person implements Comparable<Person> 
{
    private int m_count;
    private String m_name;
    private int m_age;

    public Person(String name, int age) 
    {
        m_name = name;
        m_age = age;
    }
    public String getName() 
    {
        return m_name;
    }
    public int getAge()
    {
        return m_age;
    }
    public int getCount() 
    {
        return m_count;
    }
    @Override 
    public int compareTo(Person other)
    {
        return m_age.compareTo(other.m_age);
    }

            new Comparator<Person>()
            {
                @Override
                public int compare(Person other.m_age) 
                {
                    if (m_age > other.m_age)
                        return 1;
                    else if(m_age > other.m_age)
                        return -1;
                    else 
                        return 0;
                }

            public String toString()
            {
                return String.format("(%s, %s)", m_name, m_age);
            }
             



    

     
    

    
    
    
    
}