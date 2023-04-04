class Solution {
    public int[] plusOne(int[] digits) {
    int carry = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        if (sum >= 10) {
            carry = 1;
        } else {
            carry = 0;
        }
        digits[i] = sum % 10;
    }
    if (carry == 1) {
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            result[i+1] = digits[i];
        }
        return result;
    } else {
        return digits;
    }
}
}