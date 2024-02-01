```java
import java.util.HashMap;

public class DoomDiceMainA3 {

  // Method to calculate and print the probability of each possible sum
  public static void ProbabilityOfSum(int[] dieA, int[] dieB) {
    // HashMap to store the occurrences of each sum
    HashMap<Integer, Integer> sumOccurrences = new HashMap<>();

    // Calculate the total number of combinations
    int totalCombinations = dieA.length * dieB.length;

    // Iterate through all possible combinations of faces on dice A and B
    for (int faceA : dieA) {
      for (int faceB : dieB) {
        int sum = faceA + faceB;
        // Update the count of occurrences for the current sum
        sumOccurrences.put(sum, sumOccurrences.getOrDefault(sum, 0) + 1);
      }
    }

    // Iterate through all possible sums (2 to 12) and print their probabilities
    System.out.println("Probability of each sum:");
    for (int sum = 2; sum <= 12; sum++) {
      // Get the count of occurrences for the current sum
      int count = sumOccurrences.getOrDefault(sum, 0);
      // Calculate the probability for the current sum
      double probability = (double) count / totalCombinations;

      // Print the probability with formatting
      System.out.printf("P(Sum = %d) = %.3f%n", sum, probability);
    }
  }

  // Main method where the program starts execution
  public static void main(String[] args) {
    // Define the faces of two six-sided dice
    int[] dieA = { 1, 2, 3, 4, 5, 6 };
    int[] dieB = { 1, 2, 3, 4, 5, 6 };

    System.out.println("Solution of Part-A (3)");
    System.out.println("The Probability of all Possible Sums occurring among the number of combinations is as follows: ");

    // Call the ProbabilityOfSum method to calculate and print probabilities
    DoomDiceMainA3.ProbabilityOfSum(dieA, dieB);

    System.out.println(); // Print an empty line for better readability
  }
}

```

# Probability of each sum:

- P(Sum = 2) = 0.028
- P(Sum = 3) = 0.056
- P(Sum = 4) = 0.083
- P(Sum = 5) = 0.111
- P(Sum = 6) = 0.139
- P(Sum = 7) = 0.167
- P(Sum = 8) = 0.139
- P(Sum = 9) = 0.111
- P(Sum = 10) = 0.083
- P(Sum = 11) = 0.056
- P(Sum = 12) = 0.028
