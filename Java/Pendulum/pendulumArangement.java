/**Pendulum Problem 1 : Pendulum Arrangement
 * The arary elemnets are arranged in pendulum order.
 * Sample Input: 7 49 15 91 30
 * Sample Output: 30 91 15 49 7
 * 
 * Dry Run : 15 is fixed 
 *                                  15                                     15
 *                              <-------91                              91 15
 *                            49---------->                             91 15 49                    
 *                      <---------------------30                     30 91 15 49
 *                      7----------------------->                    30 91 15 49 7
 */


import java.util.*;

class pendulumArangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt(); 
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            A[i] = sc.nextInt();
        }
        int m = n / 2; 
        int c = 0, pointer = 1;
        for (int i = 0; i < m; i++) {
            c = A[i];
            A[i] = A[n - pointer];
            A[n - pointer] = c;
            pointer++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
    }
}