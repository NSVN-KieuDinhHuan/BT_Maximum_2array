package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] newArray=createArray(4,3);
        print2Array(newArray);
        int max=MaximumArray(newArray);
        System.out.println("giá trị lớn nhất của mảng 2 chiều phía trên là: "+max);

    }

    public static int[][] createArray(int RowLength,int ColumLength){
        int[][] Arr=new int[RowLength][ColumLength];
        for (int row=0;row<RowLength;row++){
            for (int colum=0;colum<ColumLength;colum++){
            Arr[row][colum]=(int)(Math.random()*1000);
            }
        }
        return Arr;
    }
    public static void print2Array(int[][] arr){
        for (int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                System.out.print(arr[row][colum]+" ");
            }
            System.out.print("\n");
        }
    }
    public static int MaximumArray(int[][] arr){
       int  maximum= arr[0][0];
        for (int row=0;row<arr.length;row++){
            for (int colum=0;colum<arr[row].length;colum++){
               if (arr[row][colum]>maximum){
                   maximum=arr[row][colum];
               }
            }
        }
        return maximum;
    }

}
