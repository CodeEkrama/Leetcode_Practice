package com.dca.assignment;

public class dustanceBus {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1=0,sum2=0;
        //clockwise
        int s=Math.min(start,destination);
        destination=Math.max(start,destination);
        for(int i=s;i<destination;i++)
            sum1+=distance[i];
        for(int i=0;i<distance.length;i++)
            sum2+=distance[i];
        sum2=sum2-sum1;
        return Math.min(sum1,sum2);
    }
    /*
     * [7,10,1,12,11,14,5,0]
7
2
     */
    public static void main(String[] args) {
    	int[] distance=new int[] {7,10,1,12,11,14,5,0};
    	int start=7, destination=2;
		System.out.println(distanceBetweenBusStops(distance,start,destination));
	}
}
