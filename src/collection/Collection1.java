package collection;

import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Heng");
        list.add("Dara");
        list.add("Chan");
        System.out.println(list);
        list.set(1,"John");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }

}
