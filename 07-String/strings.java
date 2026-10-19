

public class strings {

    public static void printCharByChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }

    }

    public static void main(String[] args) {

        String firstName=new String("Jay");
        String lastName="Ravat";

        System.out.println(firstName);
        System.out.println(lastName);

        //concatenation

        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        // lenght of string

        System.out.println("length of string "+ firstName.length());

        // charAt()
        printCharByChar(fullName);
        
    }
    
}
