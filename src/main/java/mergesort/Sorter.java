package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService es;
    public Sorter(List<Integer> input, ExecutorService es) {
        arrayToSort = input;
        this.es= es;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("call thread name is: " + Thread.currentThread().getName()
        + " Array IS: " + arrayToSort.toString());
        // Base Condition
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        // left array
        List<Integer> leftArray = new ArrayList<>();
        for(int i=0; i<mid;++i){
            leftArray.add(arrayToSort.get(i));
        }

        // right array
        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid; i<arrayToSort.size();++i){
            rightArray.add(arrayToSort.get(i));
        }

        // s3 HOW DO WE CALL the MERGE SORT?
        Sorter leftSorter = new Sorter(leftArray, es);
        Sorter rightSorter = new Sorter(rightArray, es);


        Future<List<Integer>> leftSortedArrayFuture = es.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = es.submit(rightSorter);

        // WE have gotten the sorted arrays. We need to merge them Now

        List<Integer> sortedArray = new ArrayList<>();
        // s4 USING TWO POINTERS

        int i=0, j=0;

        while(i < leftSortedArrayFuture.get().size() && j < rightSortedArrayFuture.get().size()){
            if(leftSortedArrayFuture.get().get(i) < rightSortedArrayFuture.get().get(j)){
                sortedArray.add(leftSortedArrayFuture.get().get(i));
                ++i;
            }else{
                sortedArray.add(rightSortedArrayFuture.get().get(j));
                ++j;
            }
        }

        // s5 WHAT ELSE? --> check for remaining half
        while(i < leftSortedArrayFuture.get().size()){
            sortedArray.add(leftSortedArrayFuture.get().get(i)); i++;
        }

        while(j < rightSortedArrayFuture.get().size()){
            sortedArray.add(rightSortedArrayFuture.get().get(j)); j++;
        }

        // s6 now return --> LEts go to CLIENT
        return sortedArray;
    }

}
