import java.util.Arrays;
import java.util.HashSet;

public class DoomDiceMainB {
  public static void main(String[] args) {
    int[] dieA = { 1, 2, 3, 4, 5, 6 };
    int[] dieB = { 1, 2, 3, 4, 5, 6 };

    HashSet<Integer> result = undoomDice(dieA, dieB);
    System.out.println("Result: " + result);
  }

  public static HashSet<Integer> undoomDice(int[] dieA, int[] dieB) {
    HashSet<Integer> idle = ProbabilitySet(dieA, dieB);

    int[] newDieA = { 4, 4, 4, 4, 4, 4 };

    HashSet<Integer> result = ProbabilitySet(newDieA, dieB);

    boolean status = idle.equals(result);

    int i = 0;

    while (!status) {
      newDieA[i] = i + 1;
      result = ProbabilitySet(newDieA, dieB);
      status = idle.equals(result);
      i++;
    }

    System.out.println("New Die A = " + Arrays.toString(newDieA));
    System.out.println("New Die B = " + Arrays.toString(dieB));

    return result;
  }

  public static HashSet<Integer> ProbabilitySet(int[] dieA, int[] dieB) {
    HashSet<Integer> probabilityPossibleSumsSet = new HashSet<>();

    for (int i = 0; i < dieA.length; i++) {
      for (int j = 0; j < dieB.length; j++) {
        int sum1 = dieA[i] + dieB[j];
        probabilityPossibleSumsSet.add(sum1);
      }
    }
    return probabilityPossibleSumsSet;
  }
}
