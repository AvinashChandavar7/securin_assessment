import java.util.HashMap;

public class DoomDiceMainA3 {

  public static void ProbabilityOfSum(int[] dieA, int[] dieB) {
    HashMap<Integer, Integer> sumOccurrences = new HashMap<>();
    int totalCombinations = dieA.length * dieB.length;

    System.out.println("Probability of each sum:");
    for (int faceA : dieA) {
      for (int faceB : dieB) {
        int sum = faceA + faceB;
        sumOccurrences.put(sum, sumOccurrences.getOrDefault(sum, 0) + 1);
      }
    }

    for (int sum = 2; sum <= 12; sum++) {
      int count = sumOccurrences.getOrDefault(sum, 0);
      double probability = (double) count / totalCombinations;

      System.out.printf("P(Sum = %d) = %.3f%n", sum, probability);
    }
  }

  public static void main(String[] args) {
    int[] dieA = { 1, 2, 3, 4, 5, 6 };
    int[] dieB = { 1, 2, 3, 4, 5, 6 };

    System.out.println("Solution of Part-A (3)");
    System.out
        .println("The Probability of all Possible Sums occurring among the number of combinations is as follows: ");
    DoomDiceMainA3.ProbabilityOfSum(dieA, dieB);
    System.out.println();
  }
}
