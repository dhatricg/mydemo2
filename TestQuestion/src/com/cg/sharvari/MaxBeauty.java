package com.cg.sharvari;
/*
 * QUESTION:
 
For an array of integers, arr[n], its prefix sum array, psum[n], is constructed as psum[i] = sum(arr[0]...arr[i]) where 0<=i<=n.
The beauty of psum[n] is psum[0] - psum[1] + psum[2] - psum[3] .... ((-1)^(n-1) )*psum[n-1].
 
Note: ((-1)^(n-1))psum[n-1] indicates the last element may be added or subtracted depending on the parity of n-1.
if arr can be rearranged arbitrarily, and if the maximum possible value of the beauty of psum[n].
 
Example:
n=5
arr = [3,4,5,1,1];
the optimal arrangement of arr is [3,1,5,1,4].
psum = [3,4,9,10,14]
the beauty of psum is 3-4+9-10+14 = 12.
the answer is 12.
 
note that there can be multiple optimal arrangements like [5,1,3,1,4]
 
function description:
complete the function getMaxbeauty in the editor.
it has the parameter: int arr[n] an array of integers
returns long int: array of integers
 
constraints:
1. 1<= n <=10^5
2. 1 <= arr[i] <= 10^9
 
input format:
first line contains integer n, no. of elements in arr
each line i of the n subsequent lines contains an integer arr[i]
 
sample input:
 
n = 4;
arr = [4,1,2,4]
 
 
sample output = -3
 
one optimal arrangement  is [4,1,4,2]
psum = [4,5,9,11]\
beauty of psum is 4-5+9-11 =-3
 */
/*public static long getMaxBeauty(List<Integer> arr) {
    // Edge case: if the array is empty or contains only one element
    if (arr == null || arr.size() <= 1) {
        return 0; // No beauty in such cases
    }
    
    // Find the maximum and minimum values in the list
    int minElement = Integer.MAX_VALUE;
    int maxElement = Integer.MIN_VALUE;
    
    for (int num : arr) {
        if (num < minElement) {
            minElement = num;
        }
        if (num > maxElement) {
            maxElement = num;
        }
    }
    
    // The beauty is the difference between the max and min elements
    return (long) (maxElement - minElement);
}*/
