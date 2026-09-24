package String;
import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char mostfrequent = str.charAt(0);
        int maxcount = 0;
        for(int i = 0;i < str.length();i++){
            char current = str.charAt(i);
            int count = 0;
            for(int j = 0;j < str.length();j++){
                if(current == str.charAt(j)){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                mostfrequent = current;
            }
        }
        System.out.println("Most frequent character: " + mostfrequent);
        System.out.println("Frequency = " + maxcount);
    }
}