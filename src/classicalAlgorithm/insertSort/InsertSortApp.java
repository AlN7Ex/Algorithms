package classicalAlgorithm.insertSort;

import classicalAlgorithm.selectSort.SelectSort;

public class InsertSortApp {
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort(10);

        insertSort.insert(33);
        insertSort.insert(2);
        insertSort.insert(22);
        insertSort.insert(32);
        insertSort.insert(44);
        insertSort.insert(4);
        insertSort.insert(10);
        insertSort.insert(50);

        insertSort.display();
        insertSort.sort();
        insertSort.display();
        insertSort.delete(10);
        insertSort.display();
    }
}
