import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {

        // 1.create an array
        int [] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //2.Loop through the array
        for (int i = 0; i < 10; i++){
            sum = sum + numbers[i];
        }
        System.out.println("The total sum of the elements in the array is: " + sum);
        System.out.println(); //just a space

        //3. array that holds 10 number inputs
        Scanner key = new Scanner(System.in);
        //System.out.println("Please enter 10 numbers: ");
        int sum2 = 0;
        int [] numInput = new int [10];
        for(int i = 0; i < 10; i++){
            System.out.println("Please enter number " + (i + 1) + ":");
            int input = key.nextInt();
            numInput[i] = input;
            sum2 = sum2 + numInput[i];
        }

        System.out.println("The sum of the input numbers are: " + sum2);

        //4.get 10 inputs and compute the average
        int sum3 = 0;
        int [] numInput2 = new int[10];
        for (int i = 0 ; i < 10; i++){
            System.out.println("Please enter number " + (i + 1) + ":");
            numInput2[i] = key.nextInt();
            sum3 = sum3 + numInput2[i];


        }
        System.out.println("The average of the 10 numbers is: " + (sum3/10));


        //5. Array that stores 3 names
        String names [] = new String[]{"Daphne", "Ivan", "Elise"};
        for (int i = 0; i < 3; i++){
            System.out.println(names[i]);
        }



        //6.print out the index when value equals to 5
        int values [] = new int[] {2,5,9,0,2,1,8,5,4};
        for (int i = 0; i < 9; i++){
            if(values[i] == 5) {
                System.out.println("The index position of the number 5 is: " + i);
            }
        }



        //7.print the numbers backwards
        int backNum [] = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 9; i >= 0; i--){
            System.out.println(backNum[i]);
        }


        //.8 Replace the letter in the array
        String letters [] = new String[] {"w","t","y","h","k"};
        for (int i = 0; i < 5; i++) {
            if (letters[i].equalsIgnoreCase("t")) {
                letters[i] = "hello";
            }
        }
        for(String letter : letters){
            System.out.println(letter);
        }



        //.9 Given two arrays --- find the match
        int array1 [] = new int[] {1,7,6,5,9};
        int array2 [] = new int[] {2,7,6,3,4};

        for (int i = 0; i < 5; i++) {
            if (array1[i] == array2[i]){
                System.out.println((array1[i] + "," + array2[i]));
            }
        }



    }
}
