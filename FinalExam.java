
public class FinalExam {

	public static void main(String[] args) {
		
		
		
		Creature[] creatures = {
	            new Creature("Dragon", 95),
	            new Creature("Griffin", 88),
	            new Creature("Unicorn", 78),
	            new Creature("Phoenix", 92),
	            new Creature("Centaur", 85)
	        };

	        CreatureSorter sorter = new CreatureSorter();
	        

	        //Bubble Sort in descending order
	        System.out.println("*** Bubble Sort (Descending Order): ***");
	        Creature[] bubbleSorted = creatures.clone();
	        sorter.bubbleSortDescending(bubbleSorted);
	        sorter.displayCreatures(bubbleSorted);
	        

	        //Selection Sort in ascending order
	        System.out.println("\n*** Selection Sort (Ascending Order): ***");
	        Creature[] selectionSorted = creatures.clone();
	        sorter.selectionSortAscending(selectionSorted);
	        sorter.displayCreatures(selectionSorted);
	        

	        // Stack Implementatio
	        System.out.println("\n*** Stack Implementation (Descending Order): ***");
	        sorter.stackImplementation(bubbleSorted);
	}

}
