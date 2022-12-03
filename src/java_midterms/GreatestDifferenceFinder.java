package java_Midterms;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        } else {
            int max = intArray[0];
            int min = intArray[0];

            for (int i = 0; i <= intArray.length - 1; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
                for (int j = 0; j <= intArray.length - 1; j++) {
                    if (intArray[j] < min) {
                        min = intArray[i];
                    }
                }
            }
            return max - min;
        }
    }
}
