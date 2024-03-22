public class Animal
{
    private String sound;
    private String name;
    private int age;

    public Animal(String sound, String name, int age)
    {
        this.sound = sound;
        this.name = name;
        this.age = age;
    }

    public void makeSound()
    {
        System.out.println(sound);
    }

    public void silence()
    {
        System.out.println("...");
    }

    public void sleep()
    {
        System.out.println("z-z-Z-Z-Z");
    }
}
