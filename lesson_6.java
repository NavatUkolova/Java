import java.util.HashSet;
public class lesson_6 {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(12);
        for(var item: set) System.out.println(item);
        set.clear();
        System.out.println(set);

    }
}
