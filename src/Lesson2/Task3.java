package Lesson2;

import java.util.Arrays;

public class Task3 {

        public static void main(String[] args) {
            int [] array = {1,5,3,2,11,4,5,2,4,8,9,1};
            for (int i=0; i< array.length; i++) {
                int value = array [i];
                if (value < 6) {
                    array [i] = value * 2;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

