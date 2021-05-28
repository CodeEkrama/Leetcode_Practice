package com.dca.assignment;

public class bunaryAddition {
	   public static String addBinary(String a, String b) {
		    StringBuilder sb = new StringBuilder();
		    int i = a.length()-1, j = b.length()-1, carry=0;     
		    while(i >= 0 || j >= 0){
		        int sum = carry;
		        if(i >= 0) sum += a.charAt(i--)-'0';
		        if(j >= 0) sum += b.charAt(j--)-'0';
		        sb.append(sum % 2);
		        carry = sum / 2;
		    }
		    if(carry != 0) sb.append(carry);
		    return sb.reverse().toString();
		  }
//	static double binaryToDecimal(String n){
//        double s=0;
//        if(n.compareTo("0")==0){
//            return 0;
//        }
//        else{
//        for(int i=0;i<n.length();i++){
//            String c=n.charAt(n.length()-i-1)+"";
//            int num=Integer.parseInt(c);
//            s=(double) (s+(Math.pow(2,i)*num));
//        }
//        
//        return s;
//            }
//    }
//    static String decimalToBinary(double a){
//        String str="";
//        String res="";
//        while(a!=0){
//            if(a%2==0){
//                str+="0";
//            }
//            else{
//                str+="1";
//            }
//            a=(int)a/2;
//        }
//        for(int i=str.length()-1;i>=0;i--) {
//        	res=res+str.charAt(i);
//        }
//        return res;
//        
//    }
    public static void main(String[] args) {
		System.out.println(addBinary("11110","101010"));

	}
}
