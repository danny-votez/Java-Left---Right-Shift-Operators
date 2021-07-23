// In this example, we explain the Left () and Right Shift operator
package Java;

public class LeftAndRightShift {
    public static void main(String[] args){
        int a = 8;          // 1 0 0 0 binary format of 8 needs to be found
        // In Using the left shift operator, there is shifting 8 by two (2) bits
        // Hence, there is appending two more zeros (0) to the binary form above
        int b = a << 2;     //   1 0 0 0.     It will append two new zeros
                            // Hence, it thus becomes  1 0 0 0 0 0
                            // If we cross examine 1 0 0 0 0 0.,  we find that this number/value ------>32
                            // The same can be proven upon printing out the value of "b" as shown above
        System.out.println(b);

        int c = 25;          // First, we know that 1 1 0 0 1 is the binary form of 25 
        int d = c >> 2;     //   1 1 0 0 1.     It will shift the two zeros (0 0), i.e., there is losing the two bits to the right
        System.out.println(d);
        
        // Hence, 1 1 0 0 1 thus becomes  1 1 0          which is the value -----> 6



        // Below are other examples of the Left shift and right shift operator

        int e = 5;              //  the binary form of 5 is ------>      1 0 1
        int f = e >> 3;         // In this case, since it's the Right Shift operator, the binary items move right, i.e., are removed
                                // Thus, for 101.     -----------> 0
        System.out.println(f);        // The Result will give zero (0)


        // Left Shift Operator

        int g = 5;
        int h = g << 3;                  // from a binary of 101, the addition leads to 1 0 1 0 0 0  which is the number -------> 40
        System.out.println(h);          // The result will show 40

        int numb10 = 22;                // Binary is 10110
        int numb11 = numb10 << 3;       // This is a Left Shift operator, there is adding the binary items
                                        // Shifting leads this value of 10110           to    --------> 10110000
                                         // The binary item 10110000 is the decimal number 176        
        System.out.println(numb11);     // The result will give 176

        // Using the same items for Right shift operator gives the answers below
        
        int numb12 = 22;                // Binary is 10110
        int numb13 = numb12 >> 3;       // This is a Right Shift operator
                                        // Shifting leads this value of 10110     to    ------> 10
                                         // The binary item 10 is the decimal number 2
        System.out.println(numb13);     // The result will give 2


    }
    
}
