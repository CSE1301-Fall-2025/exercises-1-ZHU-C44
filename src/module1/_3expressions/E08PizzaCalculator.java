package module1._3expressions;

public class E08PizzaCalculator {
	//Exercise 8: Write code to match the flow chart given here:

	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#flowcharting
	public static void main(String[] args) {
		int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
		pizzaSlices = 9;
		numPeople = 3;
		slicesPerPerson = pizzaSlices / numPeople;
		leftoverSlices = pizzaSlices % numPeople;
		System.out.println("Each person gets to eat " + slicesPerPerson + " slices of pizza.");
		if (leftoverSlices > 1) {
			System.out.println("There are " + leftoverSlices + " leftover slices.");
		}
		else if (leftoverSlices == 1) {
			System.out.println("There is 1 leftover slice.");
		}
		else {
			System.out.println("There are no leftover slices.");
		}
	}

}
