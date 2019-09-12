public class Duck implements IAniamls 
{
   

    public Duck(String name) 
    {
        m_name = name; 
    }

    public String makeSound()
    {
        return m_name + "quack quack quack";    
    }
}