package Array;
import java.util.*;
public class assignment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"Apple","Banana","Cherry","Dragon Fruit","Egg Plant"};
        HashSet<String> map = new HashSet<>();
        for(int i=0; i<5; i++){
            map.add(arr[i]);
        }
        System.out.println(map);
    }
}