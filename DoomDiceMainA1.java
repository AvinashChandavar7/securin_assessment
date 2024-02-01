public class DoomDiceMainA1 {

  private static int calculateTotalCombinations(int[] dieA, int[] dieB) {
    int totalCombinations = 0;

    for (int faceA : dieA) {
      for (int faceB : dieB) {
        int sum = faceA + faceB;
        if (sum >= 2 && sum <= 12) {
          System.out.println("Die A: " + faceA + ", Die B: " + faceB + ", Sum: " +
              sum);
          totalCombinations++;
        }
      }
    }

    return totalCombinations;
  }

  public static void main(String[] args) {
    int[] dieA = { 1, 2, 3, 4, 5, 6 };
    int[] dieB = { 1, 2, 3, 4, 5, 6 };

    System.out.println("Solution of Part-A (1)");
    int totalCombinations = calculateTotalCombinations(dieA, dieB);
    System.out.println("Total combinations: " + totalCombinations);

  }
}
