package com.todo.task.model;

public class timSoLonNhat {
    private int[] arr;
    public int TimMax(int []arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i ++ ){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
