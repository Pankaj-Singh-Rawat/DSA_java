package bitManipulation;
/*
Computers store value in Binary i.e in 0, 1.

Bit-wise Operators: &, |, ^, ~, <<, >>


 */
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(4&5); // 4
        System.out.println(5|6); // 7
        System.out.println(5^6); // 3
        System.out.println(~5); // 00101 -> 11010 (-ve num) -> 00101 + 1 -> 00110 (-ve num) -> returns -6
        System.out.println(~9); // 1001 -> 9 -> 0110 -> 1001 + 1 -> 1010 -> returns -10
        System.out.println(5<<2); // 00101 << 2 -> 10100 -> 16+4 -> 20 -> formula: a*2^b
        System.out.println(5>>1); // 00101 >> 1 -> 00010 -> 2 -> formula: a/2^b
         */

        // 1001 -> and with 1 -> 1 001 -> or with 1 -> 1111

        System.out.println(isEven(12));
        System.out.println(getIthBit(10, 2)); // 10 -> 1010
        System.out.println(setIthBit(10,2)); // 10,2 -> 1010 -> 1110 (changed 2nd bit)
        System.out.println(clearIthBit(10, 1)); // 10,1 -> 1010 -> 1000 (changed 1st bit to 0)
        System.out.println(updateIthBit(10,3)); // 10,3 -> 1010 -> 0010 (changed the 3rd bit)
        System.out.println(clearLastIBits(15,2)); // 15,2 -> 1111 -> 1100 (cleared last 2 bits)
        swap2Nums(10,5);
        System.out.println(increaseByOne(10));
    }

    public static void swap2Nums(int a, int b) {
        a = a^b; // a -> 1010^101 -> 1111 -> 15
        b = a^b; // b -> 1111^101 -> 1010 -> 10
        a = a^b; // a -> 1111^1010 -> 101 -> 5
        System.out.println("a = " + a + " and b = " + b);
        System.out.println();
    }

    public static int increaseByOne(int a) {
        return -~a;
    }

    // clear last i bits
    public static int clearLastIBits(int a, int i) {
        return a & ((~0)<<i);
    }

    // update i-th bit
    public static int updateIthBit(int a, int i) {
        return a ^ (1<<i);
    }

    // clear ith bit
    public static int clearIthBit(int a, int i) {
        return a & ~(1<<i);
    }

    // set i-th bit
    public static int setIthBit(int a, int i) {
        return a | (1<<i);
    }

    // get i-th bit
    public static int getIthBit(int num, int i) {
        if((num & (1 << i)) == 0) {
            return 0;
        }
        return 1;
    }

    // check if a number is even or odd:
    public static boolean isEven(int a) {
        return (a & 1) == 0;
    }
}
