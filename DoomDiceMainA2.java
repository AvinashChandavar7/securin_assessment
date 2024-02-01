
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DoomDiceMainA2 {

  public static HashSet<Integer> calculateSumDistribution(int[] dieA, int[] dieB) {
    Map<Integer, Integer> probabilityPossibleSumsMap = new HashMap<>();

    for (int valueA : dieA) {
      for (int valueB : dieB) {
        int sum = valueA + valueB;
        probabilityPossibleSumsMap.put(sum, probabilityPossibleSumsMap.getOrDefault(sum, 0) + 1);
      }
    }
    return new HashSet<>(probabilityPossibleSumsMap.values());
  }

  public static void displayPossibleCombinations(int[] dieA, int[] dieB) {
    System.out.println("(Die A) + (Die B) = Sum");
    int count = 1;
    for (int valueA : dieA) {
      for (int valueB : dieB) {
        int sum = valueA + valueB;
        System.out.println(count++ + ") " + valueA + " + " + valueB + " = " + sum);
      }
    }
  }

  public static void displayProbabilitySet(HashSet<Integer> probabilitySet) {
    System.out.println("\nProbability Distribution of Sums:");
    for (int probability : probabilitySet) {
      System.out.println("Count " + probability + ": " + countOccurrences(probabilitySet, probability) + " sums");
    }
  }

  public static int countOccurrences(HashSet<Integer> set, int value) {
    int count = 0;
    for (int elem : set) {
      if (elem == value) {
        count++;
      }
    }
    return count;
  }

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
