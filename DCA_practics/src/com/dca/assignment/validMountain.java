package com.dca.assignment;

public class validMountain {
	public static boolean validMountainArray(int[] arr) {
        int l=arr.length;
        int max=arr[0];
        if(l<3)
            return false;
        //find max
        int pivot=0;
        for(int i=0;i<l;i++){
            if(max<arr[i]){
                max=arr[i];
                pivot=i;
            }
        }
        int a[]=new int[pivot+1];
        int b[]=new int[l-pivot];
        for(int i=0;i<a.length;i++)
            a[i]=arr[i];
        for(int i=0;i<b.length;i++)
            b[i]=arr[pivot+i];
        if(increasing(a) && decreasing(b))
            return true;
        else
            return false;
        
    }
    static boolean increasing(int[] a){
        int count=0,pivot=0;
        for(int i=a.length-1;i>=0;i--){
            if(i-1>=0 && a[i]>a[i-1])
                count++;
        }
        if(count==a.length-1)
            return true;
        else
            return false;
    }
        static boolean decreasing(int[] a){
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                count++;
        }
        if(count==a.length-1)
            return true;
        else
            return false;
    }
        public static void main(String[] args) {
        	//[0,1,2,3,4,5,6,7,8,9]
			int a[]=new int[] {0,1,2,3,4,5,6,7,8,9};
			System.out.println(validMountainArray(a));
		}
}
