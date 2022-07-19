# Check if two arrays are equal or not

# Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
# Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
# Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

# Expected Time Complexity : O(N)
# Expected Auxilliary Space : O(N)

# Constraints:
# 1<=N<=107
# 1<=A[],B[]<=1018
###########################################################################################################################################################


A = [1,3,5,4,0]                 # List A
B=  [2,4,5,0,1]                 # List B

# Check if A and B have the same length 
if(len(A)==len(B)):
    N = len(A)                  # Set N to the lentgh 


    # Sort both array so their macthing element are in the same position(index) if their size are equal.
    A.sort()                    
    B.sort()
    k=0                         # Initialize the counter
    # Loop from 0 to the size of the Array             
    for i in range(0,N):
        # Check if they having macthing value for i index
        if(A[i] ==B[i]):
            k+=1                # if so, incremment counter.
    if(k==N):                   # Counter must be equal to the size of the Array to determine if they are equal.      
        print("True, A and B are equal")
    else:
        print("False, Not equal")
else:
    print("False, Not equal")
