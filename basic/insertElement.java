import java.util.Arrays;

public class insertElement {
    public static void main(String[] args) {
        int[] arr = {3,5,5,8,7,9};
        int element = 4;
        int position = arr.length/2;

        int[] newArr = insertElement( arr, element, position);
        System.out.println("Arrrays after Insertion:" + Arrays.toString(newArr));
    }
    public static int[] insertElement(int[] arr, int element, int position){
        int[] newArr = new int[arr.length + 1];
        int j =0;

        for (int i =0;  i < newArr.length; i++){
            if (i == position){
                newArr[i] = element;
            } else{
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
}
