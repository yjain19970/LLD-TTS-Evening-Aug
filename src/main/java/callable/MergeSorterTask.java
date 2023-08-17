package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MergeSorterTask implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;

    public MergeSorterTask(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        // S1: Base Condition for Recursion
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        // S2:  NOW create left and right arrays
        List<Integer> leftArray = new ArrayList<>();
        for(int i=0; i<mid;++i){
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid; i<arrayToSort.size();++i){
            rightArray.add(arrayToSort.get(i));
        }

        // S3: Call Recursive mergeSortTask
        MergeSorterTask leftSorter = new MergeSorterTask(leftArray);
        MergeSorterTask rightSorter = new MergeSorterTask(rightArray);


        List<Integer> leftSortedArray = leftSorter.call();
        List<Integer> rightSortedArray = rightSorter.call();

        // we have gotten the sorted arrays. We need to merge them Now

        // S4: JOIN USING TWO POINTERS
        List<Integer> sortedArray = new ArrayList<>();
        int i=0, j=0;

        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            }else{
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }

        // S5: Check for remaining elements
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i)); i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j)); j++;
        }

        // S6: return finally
        return sortedArray;
    }
}
