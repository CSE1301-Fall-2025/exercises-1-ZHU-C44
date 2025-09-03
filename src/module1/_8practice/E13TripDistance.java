package module1._8practice;

public class E13TripDistance {
	//Exercise 13: Write a program to calculate the number of miles 
	//you can drive if you have a 10 gallon gas tank and are 
	//down to a quarter of a tank of gas and your car gets 32 
	//miles per gallon.
    public static void main(String[] args) {

        double numGallons, milesPerGallon, miles;
        numGallons = (double) 10 / 4;
        milesPerGallon = 32;
        miles = numGallons * milesPerGallon;
        System.out.println(miles);

       // Your code should use the variables
       // numGallons, milesPerGallon, and miles
       // and print out miles
    }
}
