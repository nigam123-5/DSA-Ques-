import  java.util.*;

public class smallestNum {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,6,4,8};
        System.out.println("Smallet vaue is:" + getSmallest(numbers));
    }
}