<div style="display: flex; flex-wrap: wrap;">

<div style="border: 1px solid gray">

| Die A | Die B | Sum |
| ----- | ----- | --- |
| 1     | 1     | 2   |
| 1     | 2     | 3   |
| 1     | 3     | 4   |
| 1     | 4     | 5   |
| 1     | 5     | 6   |
| 1     | 6     | 7   |

</div>

<div style="border: 1px solid gray">

| Die A | Die B | Sum |
| ----- | ----- | --- |
| 2     | 1     | 3   |
| 2     | 2     | 4   |
| 2     | 3     | 5   |
| 2     | 4     | 6   |
| 2     | 5     | 7   |
| 2     | 6     | 8   |

</div>
<div style="border: 1px solid gray">

| Die A | Die B | Sum |
| ----- | ----- | --- |
| 3     | 1     | 4   |
| 3     | 2     | 5   |
| 3     | 3     | 6   |
| 3     | 4     | 7   |
| 3     | 5     | 8   |
| 3     | 6     | 9   |

</div>
<div style="border: 1px solid gray">

| Die A | Die B | Sum |
| ----- | ----- | --- |
| 4     | 1     | 5   |
| 4     | 2     | 6   |
| 4     | 3     | 7   |
| 4     | 4     | 8   |
| 4     | 5     | 9   |
| 4     | 6     | 10  |

</div>
<div style="border: 1px solid gray">

| Die A | Die B | Sum |
| ----- | ----- | --- |
| 5     | 1     | 6   |
| 5     | 2     | 7   |
| 5     | 3     | 8   |
| 5     | 4     | 9   |
| 5     | 5     | 10  |
| 5     | 6     | 11  |

</div>
<div style="border: 1px solid gray">

| Die A | Die B | Sum |
| ----- | ----- | --- |
| 6     | 1     | 7   |
| 6     | 2     | 8   |
| 6     | 3     | 9   |
| 6     | 4     | 10  |
| 6     | 5     | 11  |
| 6     | 6     | 12  |

</div>
</div>

# Total combinations: 36

```java

public class DoomDiceMain {


  private static int calculateTotalCombinations(int[] dieA, int[] dieB) {

    int totalCombinations = 0;


    for (int faceA : dieA) {
      for (int faceB : dieB) {
        int sum = faceA + faceB;  // Calculate the sum of the two dice faces


        if (sum >= 2 && sum <= 12) { // Check if the sum is within the valid range (2 to 12)
          // Print each combination for better understanding
          System.out.println("Die A: " + faceA + ", Die B: " + faceB + ", Sum: " + sum);


          totalCombinations++;// Increment the total combinations counter
        }
      }
    }

    // Return the total number of valid combinations
    return totalCombinations;
  }


  public static void main(String[] args) {

    int[] dieA = { 1, 2, 3, 4, 5, 6 };
    int[] dieB = { 1, 2, 3, 4, 5, 6 };


    int totalCombinations = calculateTotalCombinations(dieA, dieB);

    System.out.println("Total combinations: " + totalCombinations);
  }
}

```
