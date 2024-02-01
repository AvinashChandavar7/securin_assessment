```java

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DoomDiceMainA2 {

  // Method to calculate the distribution of sums when rolling two dice
  public static HashSet<Integer> calculateSumDistribution(int[] dieA, int[] dieB) {
    Map<Integer, Integer> probabilityPossibleSumsMap = new HashMap<>();

    // Iterate through all combinations of dieA and dieB
    for (int valueA : dieA) {
      for (int valueB : dieB) {
        int sum = valueA + valueB;
        // Update the count of each sum in the map
        probabilityPossibleSumsMap.put(sum, probabilityPossibleSumsMap.getOrDefault(sum, 0) + 1);
      }
    }
    // Return a HashSet containing unique counts of possible sums
    return new HashSet<>(probabilityPossibleSumsMap.values());
  }

  // Method to display all possible combinations of rolling two dice
  public static void displayPossibleCombinations(int[] dieA, int[] dieB) {
    System.out.println("(Die A) + (Die B) = Sum");
    int count = 1;
    // Iterate through all combinations of dieA and dieB
    for (int valueA : dieA) {
      for (int valueB : dieB) {
        int sum = valueA + valueB;
        // Print the combination in the specified format
        System.out.println(count++ + ") " + valueA + " + " + valueB + " = " + sum);
      }
    }
  }

  // Method to display the probability distribution of sums
  public static void displayProbabilitySet(HashSet<Integer> probabilitySet) {
    System.out.println("\nProbability Distribution of Sums:");
    // Iterate through unique counts in the set
    for (int probability : probabilitySet) {
      // Print the count and the number of occurrences in the set
      System.out.println("Count " + probability + ": " + countOccurrences(probabilitySet, probability) + " sums");
    }
  }

  // Method to count occurrences of a value in a HashSet
  public static int countOccurrences(HashSet<Integer> set, int value) {
    int count = 0;
    // Iterate through each element in the set
    for (int elem : set) {
      // Increment the count when the element matches the specified value
      if (elem == value) {
        count++;
      }
    }
    // Return the count
    return count;
  }

  // Main method, the entry point of the program
  public static void main(String[] args) {
    int[] dieA = { 1, 2, 3, 4, 5, 6 };
    int[] dieB = { 1, 2, 3, 4, 5, 6 };

    // Part 1: Displaying all possible combinations
    displayPossibleCombinations(dieA, dieB);

    // Part 2: Calculating and displaying the distribution of sums
    HashSet<Integer> probabilitySet = calculateSumDistribution(dieA, dieB);
    displayProbabilitySet(probabilitySet);
  }
}

```

<div style="display: flex; flex-wrap: wrap; ">

<div style="border: 1px solid gray">

| #   | Die A + Die B | Sum |
| --- | ------------- | --- |
| 1   | 1 + 1 = 2     | 2   |
| 2   | 1 + 2 = 3     | 3   |
| 3   | 1 + 3 = 4     | 4   |
| 4   | 1 + 4 = 5     | 5   |
| 5   | 1 + 5 = 6     | 6   |
| 6   | 1 + 6 = 7     | 7   |

</div>

<div style="border: 1px solid gray">

| #   | Die A + Die B | Sum |
| --- | ------------- | --- |
| 7   | 2 + 1 = 3     | 3   |
| 8   | 2 + 2 = 4     | 4   |
| 9   | 2 + 3 = 5     | 5   |
| 10  | 2 + 4 = 6     | 6   |
| 11  | 2 + 5 = 7     | 7   |
| 12  | 2 + 6 = 8     | 8   |

</div>

<div style="border: 1px solid gray">

| #   | Die A + Die B | Sum |
| --- | ------------- | --- |
| 13  | 3 + 1 = 4     | 4   |
| 14  | 3 + 2 = 5     | 5   |
| 15  | 3 + 3 = 6     | 6   |
| 16  | 3 + 4 = 7     | 7   |
| 17  | 3 + 5 = 8     | 8   |
| 18  | 3 + 6 = 9     | 9   |

</div>

<div style="border: 1px solid gray">

| #   | Die A + Die B | Sum |
| --- | ------------- | --- |
| 19  | 4 + 1 = 5     | 5   |
| 20  | 4 + 2 = 6     | 6   |
| 21  | 4 + 3 = 7     | 7   |
| 22  | 4 + 4 = 8     | 8   |
| 23  | 4 + 5 = 9     | 9   |
| 24  | 4 + 6 = 10    | 10  |

</div>

<div style="border: 1px solid gray">

| #   | Die A + Die B | Sum |
| --- | ------------- | --- |
| 25  | 5 + 1 = 6     | 6   |
| 26  | 5 + 2 = 7     | 7   |
| 27  | 5 + 3 = 8     | 8   |
| 28  | 5 + 4 = 9     | 9   |
| 29  | 5 + 5 = 10    | 10  |
| 30  | 5 + 6 = 11    | 11  |

</div>

<div style="border: 1px solid gray">

| #   | Die A + Die B | Sum |
| --- | ------------- | --- |
| 31  | 6 + 1 = 7     | 7   |
| 32  | 6 + 2 = 8     | 8   |
| 33  | 6 + 3 = 9     | 9   |
| 34  | 6 + 4 = 10    | 10  |
| 35  | 6 + 5 = 11    | 11  |
| 36  | 6 + 6 = 12    | 12  |

</div>

</div>

# Probability Distribution of Sums:

- Count 1: 1 sums
- Count 2: 1 sums
- Count 3: 1 sums
- Count 4: 1 sums
- Count 5: 1 sums
- Count 6: 1 sums
