

public class checkPalindrom {

    public static String palinDrome(String str){
        String str1="";
        int n=str.length();
        n=n-1;
        
        for(int i=n;i>=0;i--){
            str1+=str.charAt(i);
        }
        return str1;
    }

    public static void main(String[] args) {
        
        String str="racecar";

        String str1=palinDrome(str);
        System.out.print("reverse string"+" "+ str1);

        if(str.equals(str1)){
            System.out.println("string is palindrom");
        }else{
            System.out.println("string is not palindrom");
        }


    }
    
}
