import java.util.Stack;

public class CreatureSorter {
    
    // Bubble Sort descending order(power levels)
    public void bubbleSortDescending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (creatures[j].getPowerLevel() < creatures[j + 1].getPowerLevel()) {
                    // Swap creatures[j] and creatures[j+1]
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    //// Selection Sort ascending order(power levels)
    public void selectionSortAscending(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].getPowerLevel() < creatures[minIndex].getPowerLevel()) {
                    minIndex = j;
                }
            }
            
            // Swap creatures
            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
            
        }
    }

    // Stack implementation 
    public void stackImplementation(Creature[] creatures) {
        Stack<Creature> creatureStack = new Stack<>();

        // Push creatures onto the stack in ascending order 
        for (int i = creatures.length - 1; i >= 0; i--) {
            creatureStack.push(creatures[i]);
        }
        

        // Pop creatures from the stack
        while (!creatureStack.isEmpty()) {
            System.out.println(creatureStack.pop());
        }
    }
    

    //display the list of creatures
    public void displayCreatures(Creature[] creatures) {
        for (Creature creature : creatures) {
            System.out.println(creature);
        }
        
        
    }
}
