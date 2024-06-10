//import scanner
import java.util.Scanner;

class Exercise8_29
{
    //establish the size of the array used in testing
    public static final int TEST_ARRAY_LENGTH = 3;
    public static final int TEST_ARRAY_WIDTH = 3;
    //find how many total items such an array would contain, as this will be useful for validating input
    public static final int TEST_ARRAY_NUM_TEMS = TEST_ARRAY_LENGTH*TEST_ARRAY_WIDTH;

    public static boolean equals(int[][] m1, int[][] m2)
    {
        return(true);
    }

    public static void main(String []args)
    {
        //create scanner object
        Scanner myObj = new Scanner(System.in);

        //get first array
        System.out.println("Enter array one:");
        String input_for_m1 = myObj.nextLine();

        //get second array
        System.out.println("Enter array two:");
        String input_for_m2 = myObj.nextLine();

        //parse strings
        int[][] m1 = new int[TEST_ARRAY_LENGTH][TEST_ARRAY_WIDTH];
        int[][] m2 = new int[TEST_ARRAY_LENGTH][TEST_ARRAY_WIDTH];

        //compare the arrays, give output as appropriate
        if(equals(m1,m2))   {System.out.println("The two arrays are identical");}
        else                {System.out.println("The two arrays are not identical");}
    }
};