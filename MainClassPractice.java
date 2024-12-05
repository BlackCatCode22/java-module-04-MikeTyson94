//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainClassPractice {
    public static void main(String[] args) {
       //Create a couple Dog objects
        //with an empty arguments ("no args")
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        //Create a dog with a String name
        Dog aDog = new Dog( "Spot");

        //Output the new Dog objects name
        System.out.println("\n The new dogs name is " + aDog.getName);

        //Create a fourth dog with an int age.
        Dog fourthDog = new Dog(theAge 33);

        //Output the dog's age
        System.out.println("\n my new dog's age is: " + fourthDog.getAge);

        //And finally, Create a fifth and last dog.
        Dog fifthDog = new Dog(someName "my new dog's name: " , someAge 7);

        System.out.println(" my last dog's name is" + fifthDog.getName "and age is: " + fifthDog.age);

        //Give our dog a birthday (add a year to its age)

        fifthDog.setAge(fifthDog.getAge() + 1);

        //validate
        System.out.println("\n my dog who is named: " + fifthDog.getName() + ", had a birthday and age is now: " =fifthDog.getAge);
        }
    }
