import java.util.Arrays;

public class Anargams {
    public static void anargams ( String str1 , String str2 ) {
        // changing into character array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        // sorting the array 
        Arrays.sort(arr1) ;
        Arrays.sort(arr2) ;

        if ( Arrays.equals(arr1 , arr2)) {   // checks the elements in the array 
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main ( String args []) {

        String str1 = "care" ;
        String str2 = "race" ;
        // lowercasing
        str1.toLowerCase();
        str2.toLowerCase();
        anargams(str1, str2);
    }
    
}
