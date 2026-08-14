package String;
import java.util.*;
public class CountWordInASentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = name.length();
        boolean word = false;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(name.charAt(i)!=' ')
            {
                if(!word)
                {
                    count++;
                    word=true;
                }
            }
            else
            {
                word=false;
            }
        }
        System.out.println(count);
    }
}
