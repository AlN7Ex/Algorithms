package classicalAlgorithm.selectSort;


public class SelectSortApp {

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort(100);

        selectSort.insert(33);
        selectSort.insert(2);
        selectSort.insert(22);
        selectSort.insert(32);
        selectSort.insert(44);
        selectSort.insert(4);
        selectSort.insert(10);
        selectSort.insert(50);

        selectSort.display();
        selectSort.sort();
        selectSort.display();
        selectSort.delete(10);
        selectSort.display();
    }
}
