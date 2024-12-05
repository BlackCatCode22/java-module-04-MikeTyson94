
public class ArrayList {
    public static void main(String[] args) {

        //Create an ArrayList of Strings
        ArrayList<String> myListOfStrings = new ArrayList();

        //Add a few elements to my ArrayList

        myListOfStrings.add("first");
        myListOfStrings.add("Second");
        myListOfStrings.add("Third");

        //Output our ArrayList
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        //Remove an Element
        myListOfStrings.remove("Third");

        //Output ArrayList
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        // use a for loop to add somethings to the list
        String toAdd = "";
        for (int i=0; i<10; i++) {
            toAdd = toAdd +"adding.. " + Integer.toString(i);
            myListOfStrings.add(toAdd);
        }

        //Output ArrayList
        System.out.println("\n After adding a bunch of stuff...");
        System.out.println("\n myListOfStrings is: " + myListOfStrings);

        //Use a for loop to output each element of our ArrayList
        for (int i=0; i<myListOfStrings.size(); i++) {
            System.out.println("An element in my list is: " + myListOfStrings.get(i));
        }

    }

}
