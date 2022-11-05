import java.io.*;
class Duplicates{
    public static void main(String[] args){
        int[] arr = {30,35,10,16,45,35,1,5,30};

        System.out.println("Duplicates element in an array are:-");

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}