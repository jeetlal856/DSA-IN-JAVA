

public class subString {

    // find substring in string

    public static String subStr(String str, int si,int ei){
        StringBuilder sb=new StringBuilder();
        for(int i=si;i<ei;i++){
            sb.append(str.charAt(i));

        }
      
        return sb.toString();

    }
    
    // find lagest strig

    public static String largestStr(String fruites[]){
        String largest=fruites[0];
        for(int i=1;i<fruites.length;i++){
               if((largest.compareToIgnoreCase(fruites[i]))<0){
                largest=fruites[i];
               }
        }
      return largest;
    }

    // for a given string convert each the first letter of each word to uppercase

    public static String strtoUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        Character ch=Character.toUpperCase(str.charAt(0));
         ch.toString();
         sb.append(ch);
        for(int i=1;i<str.length();i++){
            if((str.charAt(i)==' '&& i<str.length()-1)){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

 // string copression

 public static String strCompress(String str){
 
    StringBuilder sb=new StringBuilder("");
    for(int i=0;i<str.length();i++){
           Integer count=1;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            count+=1;
            i++;
            
        }
        sb.append(str.charAt(i));
       if(count>1){
        sb.append(count.toString());
       }

    }
    return sb.toString();
 }

    public static void main(String[] args) {

        String str="Hellokkk";
        int si=2;
        int ei=7;
        // System.out.print(subStr(str, si, ei));
        String fruites[]={"apple","mango","banana"};

        // System.out.print(largestStr(fruites));
        String str1="hi i am jay";
    //   System.out.print(strtoUpperCase(str1));
    String str2="aaabbcccdd";
    System.out.print(strCompress(str2));

        
    }
}
