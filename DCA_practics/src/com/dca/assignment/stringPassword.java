package com.dca.assignment;

public class stringPassword {
	static boolean lenError=true;
    static boolean lCaseError=true;
    static boolean uCaseError=true;
    static boolean digitError=true;
    static boolean repeatError=true;
    public static int strongPasswordChecker(String password) {
        int l=password.length();
        int step=0;
        String improved="";
        char lastChar=password.charAt(l-1);
        boolean check=isStrong(password,password.length());  //populates error flags
        if(check)
            return 0; //if pass is already strong
        else{
        
            //6 to 20
            //aBBaa3
            //aB1
            //assuming we can insert only to the right and not in between the password
            if(l<=3){ //aaa
                if(repeatingChars(password))  //=> error
                    return (7-l);
                else
                    return (6-l); 
                }
            else if(l<6){
                //aalN
                //4,5
                int charNeeded=6-l;   //2
                String temp=password+"  ";  //length criteria made true
                boolean t=isStrong(temp,6); //rest error flags set
                if(lCaseError){
                    improved=password+'x';
                    step++;
                }
                if(uCaseError){
                    improved=password+'X';
                    step++;
                }
                if(digitError){
                    improved=password+'2';
                    step++;
                }
                if(repeatError){
                    //delete a char
                    //insert different character
                    step++;
                }
                if(step>=charNeeded)
                    return step;
                else
                    return step+1; //add one more char
            }
            else if(l>=6 && l<=20){
                boolean chk=isStrong(password,l);
                if(lCaseError){
                    improved=password+'x'; //add or replace
                    step++; //steps wont be affected
                }
                if(uCaseError){
                    improved=password+'X';
                    step++;
                }
                if(digitError){
                    improved=password+'2';
                    step++;
                }
                if(repeatError){
                    //delete a char
                    //insert different character
                	step++;
                }
                return step;
            }
            else if(l>20){
                //to bypass length check in isStrong()
                boolean bypass=isStrong(password,20);
                 if(lCaseError){
                    step++; //steps wont be affected
                }
                if(uCaseError){
                    step++;
                }
                if(digitError){
                    step++;
                }
                if(repeatError){
                    //delete a char
                    //insert different character
                	step++;
                }
                return step+(l-20); //elements to be removed
            }
        }
        return 0;
    }
    static boolean isStrong(String pass,int length){
        int l1=pass.length();
        int l=length;
        boolean lCase=false,uCase=false,digit=false;
        if(l<6 || l>20){
            
            return false;
        }
            
        else{
            lenError=false;
            for(int i=0;i<l;i++){
                char c=pass.charAt(i);
                if(Character.isLowerCase(c))
                    lCase=true;
                else if(Character.isUpperCase(c))
                    uCase=true;
                else if(Character.isDigit(c))
                    digit=true;
            }
            lCaseError=!lCase; //false --> error flag false
            uCaseError=!uCase; //true
            digitError=!digit; //true
            //check 2nd case
            if(lCase && uCase && digit){
                //check 3rd
                if(repeatingChars(pass)){
                    repeatError=true;
                    return false;
                }
                else
                {
                    repeatError=false;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean repeatingChars(String pass){  //true -> repeating chars found
        int l=pass.length(); //>=3
        for(int i=l-1;i>=0;i--){
            if(i-2>=0 && pass.charAt(i)==pass.charAt(i-1) && pass.charAt(i-1)==pass.charAt(i-2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
		String p="aaa111"; //expected =2
		System.out.println(strongPasswordChecker(p));
	}
}
