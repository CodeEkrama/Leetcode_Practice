package com.dca.assignment;

public class averageArray {
    public static double average(int[] salary) {
        int a[]=sort(salary);
        double avg=0;
        int sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=a[i];
        }
        avg=(double)sum/(salary.length-2);
        return avg;
    }
    static int[] sort(int[] sal){
        for(int i=sal.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(sal[j]>sal[j+1]){
                    int temp=sal[j];
                    sal[j]=sal[j+1];
                    sal[j+1]=temp;
                }
            }
        }
        return sal;
    }
    public static void main(String[] args) {
		int a[]=new int[] {4000,3000,1000,2000};
		System.out.println(average(a));
	}
}
