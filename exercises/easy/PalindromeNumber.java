/*
 Given an integer x, return true if x is a palindrome, and false otherwise

 Input: x = 121
 Output: true
 Explanation: 121 reads as 121 from left to right and from right to left.

 Follow up: Could you solve it without converting the integer to a string?
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        if (x == 0) return true;
        
        if (x % 10 == 0) return false;

        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        return reversed == x;
    }
}