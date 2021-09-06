package net.gowri;

public class BinaryGap {
    public int solution(int n) {
        /*
        1) set final-ans=0 and loop through string characters
        2) if current = 1
           yes --> then set counter to zero,
           no ---> then,
              yes ---> then increment counter by 1
              no ----> then, and counter > 0,
                  if check counter > final-ans
                     yes ---> then final-ans = counter
                     no ---> then reset counter to zero
        3) increment current and repeat #2
        4) at the end of loop return final-ans
         */

        char[] chars = Integer.toBinaryString(n).toCharArray();
        int final_ans=0;
        int temp_counter=0;
        for (int i=0; i < chars.length; i++){
            if (chars[i] == '1'){
                if (temp_counter > final_ans){
                    final_ans = temp_counter;
                }
                temp_counter =0;
            }else {
                temp_counter++;
            }
        }
        return final_ans;
    }
}
