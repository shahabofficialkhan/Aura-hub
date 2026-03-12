public class Passintomethod {

    // static void displayMessage(int number) {
    //     System.out.println("Hello from Passintomethod class!");
    //     System.out.println("Number is: " + number);
    //     number += 10;
    //     System.out.println("Number inside method after modification: " + number);
    // }
   static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }
    public static void main(String[] args) {

        //Basic Varible Pass By Value
        // int number = 5;
    //    displayMessage(number);
    //    System.out.println("Number after method call: " + number);

    // Pass By Reference using Array
    int [] numbers = {1, 2, 3};
    System.out.println("Array before method call:");
    for (int n : numbers) {
        System.out.println(n);
    }
    modifyArray(numbers);
    System.out.println("Array after method call:");
    for (int n : numbers) {
        System.out.println(n);  
    }





    }




}