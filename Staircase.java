/*[2] You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.*/


public class Staircase {
    public static int countCompleteRows(int n) {
        int count = 0;
        int row = 1;

        while (n >= row) {
            n -= row;
            count++;
            row++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int completeRows = countCompleteRows(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
