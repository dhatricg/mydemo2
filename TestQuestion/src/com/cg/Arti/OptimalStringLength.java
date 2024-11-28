package com.cg.Arti;

class Result1 {
	 
    /*
     * Complete the 'getOptimalStringLength' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER countA
     *  2. INTEGER countB
     *  3. INTEGER maxA
     *  4. INTEGER maxB
     */
 
    public static long getOptimalStringLength(int countA, int countB, int maxA, int maxB) {
        long totalLength = 0;
        
        // While there are enough A's and B's left to form valid blocks
        while (countA > 0 || countB > 0) {
            // Add as many A's as we can but respect the maxA constraint
            if (countA > 0) {
                int aToAdd = Math.min(countA, maxA);
                totalLength += aToAdd;
                countA -= aToAdd;
            }
 
            // Add as many B's as we can but respect the maxB constraint
            if (countB > 0) {
                int bToAdd = Math.min(countB, maxB);
                totalLength += bToAdd;
                countB -= bToAdd;
            }
        }
 
        return totalLength;
    }
 
}
 
/*public class bb {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int countA = Integer.parseInt(bufferedReader.readLine().trim());
        int countB = Integer.parseInt(bufferedReader.readLine().trim());
        int maxA = Integer.parseInt(bufferedReader.readLine().trim());
        int maxB = Integer.parseInt(bufferedReader.readLine().trim());
 
        long result = Result1.getOptimalStringLength(countA, countB, maxA, maxB);
 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/
 
