package org.example;

public class HopfieldNetwork {
  private int numOfNeurons;
  private int[][] weightMatrix;

  public HopfieldNetwork(int numOfNeurons) {
    this.numOfNeurons = numOfNeurons;
    this.weightMatrix = new int[numOfNeurons][numOfNeurons];
  }

  public void train(int[] pattern) {
    for (int i = 0; i < numOfNeurons; i++) {
      for (int j = 0; j < numOfNeurons; j++) {
        if (i == j) {
          weightMatrix[i][j] = 0;
        } else {
          weightMatrix[i][j] += pattern[i] * pattern[j];
        }
      }
    }
  }

  public int[] recall(int[] pattern) {
    int[] result = new int[numOfNeurons];
    for (int i = 0; i < numOfNeurons; i++) {
      int sum = 0;
      for (int j = 0; j < numOfNeurons; j++) {
        sum += weightMatrix[i][j] * pattern[j];
      }
      result[i] = (sum >= 0) ? 1 : -1;
    }
    return result;
  }

  public static void main(String[] args) {
    // Create Hopfield network with 9 neurons
    HopfieldNetwork hopfieldNetwork = new HopfieldNetwork(9);

    // Train with a simple pattern for 'T'
    int[] patternT = {1, 1, 1, -1, 1, -1, -1, 1, -1};
    hopfieldNetwork.train(patternT);

    // Try to recall the pattern from a noisy input
    int[] noisyPatternT = {1, 1, 1, -1, -1, -1, -1, 1, -1};
    int[] result = hopfieldNetwork.recall(noisyPatternT);

    // Print the result
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}