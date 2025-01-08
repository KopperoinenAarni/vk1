package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Niilo", "Norsu", 5);
        System.out.println(animal.name);
        System.out.println(animal.species);
        System.out.println(animal.age);
    }
}
