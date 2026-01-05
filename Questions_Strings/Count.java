import java.util.* ;

public class Count {

    public static int getcount( String str ) {
       
        int count = 0 ;  
        //traverse j ---> n-1                                     
        for ( int j = 0 ; j < str.length() ; j++) {
            
            char ch = str.charAt(j) ;                           // define a cgaracter to check that position
            if ( ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' ) {        // check vowels
                count ++ ;                                      // increment if yes
            }
        }
        return count ;
    }

    public static void main ( String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the elements in strings :");
        String str = sc.nextLine() ;
        System.out.println("The no. of vowels are :" + getcount(str));
    }
}
