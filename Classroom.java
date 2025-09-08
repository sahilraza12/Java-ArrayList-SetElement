    import java.util.ArrayList;

    public class Classroom{
        public static void main(String args[]){
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<String > list2 = new ArrayList<>();
            ArrayList<Boolean> list3 = new ArrayList<>();

    list.add(1); // O(1) Time Complexity
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1,9); // O(n) Time Complexity 

    System.out.println(list);// after insertion [1,9,2,3,4,5];

    // set - O(n) Time Complexity
    list.set(2,10);
    System.out.println(list);
    }
}