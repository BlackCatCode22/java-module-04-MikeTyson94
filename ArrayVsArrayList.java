import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        //[0][1][2][3]

        //Create
        String[] friendsArray = new String[4];

        String[] friendArray2 = {"john","Chris","Eric","Luke"};


        ArrayList<String> friendsArrayList = new ArrayList<>();

        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John","Chris","Eric","Luke"));
        //Get Element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));
        //Get Size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(4));

        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0,"Carl");
        System.out.println(friendsArrayList.get(0));

        friendsArrayList.remove("Chris");
        System.out.println(friendsArrayList.get(1));

        System.out.println();



    }
}
