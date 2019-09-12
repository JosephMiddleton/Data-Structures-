public class Pig implements IAniamls 
{
   private string m_name;

    public Pig(String name) 
    {
        m_name = name;
    }

    public String makeSound() 
    {
        return m_name + "oink oink oink";

    }

}