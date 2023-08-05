package oops.polymorphism.overloading;

import java.util.List;

public class Calculator {
    int x;
    int y;
    int z;


    public int sum(int x, int y, int z){
        return x+y+z;
    }

    public int sum(int y, int z){
        return y+z;
    }

    public int sum(List<Integer> no){
        int sum=0;
        for(int i=0;i<no.size();i++){
            sum = sum + no.get(i);
        }

        return sum;
    }





}
