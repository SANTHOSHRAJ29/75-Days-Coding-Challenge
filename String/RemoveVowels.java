package String;
import java.util.*;
public class RemoveVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String s="";
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    s=s+' ';
                }
                else
                {
                    s=s+ch;
                }
            }
        }
        System.out.println(s);

    }
}
