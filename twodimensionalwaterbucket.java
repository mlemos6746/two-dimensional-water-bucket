public class TwoDimBucketStarterCode {

    /**
     * The main method to execute the program
     *
     * @param args Command-line arguments (not used)
     */

    public static void main(String[] args) {

    /**
     * Run a series of test cases to validate the findMaxArea method
     */ 

        int[] heights={1,3,4};
        System.out.println("max height should be 3, and it is " + findMaxArea(heights));

        int[] testOne = {3, 5, 4, 8, 7};
        System.out.println("Test One: " + findMaxArea(testOne));

        int[]testTwo={5, 1, 9};
        System.out.println("Test Two: " + findMaxArea(testTwo));
        
        int[]testThree={-1, 3, 2};
        System.out.println("Test Three: " + findMaxArea(testThree));
        
        //assumption a negative height holds zero water

        int[]testFour={-1, -3, -2};             
        System.out.println("Test Four: " + findMaxArea(testFour));

        int[]testFive={1, 2};  
        System.out.println("Test Five: " + findMaxArea(testFive));
           

        int[] testEmpty = {};
        System.out.println("Test Empty: " + findMaxArea(testEmpty));

        int[] testSingle = {1};
        System.out.println("Test Single: " + findMaxArea(testSingle));

        int[] testEqualHeights = {3, 3, 3, 3, 3};
        System.out.println("Test Equal: " + findMaxArea(testEqualHeights));

        int[] testIncreasing = {1, 2, 3, 4, 5};
        System.out.println("Test Increasing: " + findMaxArea(testIncreasing));

        int[] testDecreasing = {5, 4, 3, 2, 1};
        System.out.println("Test Decreasing: " + findMaxArea(testDecreasing));

        int[] testNegative = {1, -1, 3, 4, -2};
        System.out.println("Test Negative: " + findMaxArea(testNegative));

        int[] testAllZero = {0, 0, 0, 0};
        System.out.println("Test Zero: " + findMaxArea(testAllZero));


    }


    /**
     * Find the maximum area formed by lines in the array.
     * Brute-force method used due to author's obsession with coordinates
     *
     * @param height An array of integers representing the heights of lines
     * @return The maximum area that can be formed
     */


    public static int findMaxArea(int[] height) {
        int max = 0; // Initialize max area
        int currMax; // Initialize current max area
                     // Asumption a negative height holds zero water

        int minY; // Initialize minimum y-value between two lines

        for (int i = 0; i < height.length; i++) {
            
            for (int j = i + 1; j < height.length; j++) {
            
                // Find the minimum y-value 
                if (height[i] < height[j]) {
                    minY = height[i];
                } else {
                    minY = height[j];
                }
                
                // Calculate the current area
                currMax = minY * (Math.abs(j - i));

                // Update max area 
                if (currMax > max) {
                    max = currMax;
                }
            }
        }
        return max; 
    }
}