package algorithms;

public class findMin {
    public static void main(String[] args) {

        int [] arr = new int[] {22,17,3,10,33,43,90,7,};

        int valueMin = arr[0];
        int indexValueMin = 0;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < valueMin) {
                valueMin = arr[i];
                indexValueMin = i;
            }
        }

        System.out.println("Index: " + indexValueMin + ", value: " + valueMin);
    }


}
