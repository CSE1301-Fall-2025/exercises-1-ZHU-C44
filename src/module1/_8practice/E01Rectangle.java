package module1._8practice;

public class E01Rectangle {
	//Exercise 1: Calculate and print the perimeter of a rectangle
	//having width 7 and height 9. Add another statement to calculate 
	//and print the area of the rectangle on a separate line.
    public static void main(String[] args) {

		int width = 7;
		int height = 9;
		int perimeter = width * 2 + height * 2;
		System.out.println("the perimeter of the rectangle is: " + perimeter);
		int area = width * height;
		System.out.println("the area of the rectangle is: " + area);

    }
}
