// # Check if two arrays are equal or not

// # Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
// # Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
// # Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

// # Expected Time Complexity : O(N)
// # Expected Auxilliary Space : O(N)

// # Test Cases Passed: 
// #  10126 /10126 

// # Constraints:
// # 1<=N<=107
// # 1<=A[],B[]<=1018
// ###########################################################################################################################################################


class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N){
       
      // Initialize bool variable
       boolean result;
      // Initialize counter variable
       int k=0;
      // Check if the lenght of both array are equal.
       if(A.length == B.length){
           // if,so sort them so that the matching element are in the same postions or index
           int m =B.length;
            Arrays.sort(A); 
            Arrays.sort(B); 
            // Loop and check if the elements are equal.
            for(int i=0; i<m; i++){
                if(A[i]==B[i]){
                    // increment the counter
                    k++;
                }
            }
         // If counter and array size are equal set the result to true
            if(k==m){
                result = true;
            }
            else{
                result =false;
            }
        }
        else{ result = false;}
        return result;
    }
  
  
  // [Add your main here ]
 
}
