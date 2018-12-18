import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_AndThen {
    public static void main(String[] args) {
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of integers
        Consumer<List<Integer>>
                dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(3);

        // using addThen()
        modify.andThen(dispList).accept(list);



        //To demonstrate when NullPointerException is returned
        Consumer<List<Integer>>
                listConsumer = list2 -> list2.stream().forEach(a -> System.out.println(a + " "));
        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(7);
        try {
            //using andThen()
            modify.andThen(null).accept(list2);
        }
        catch (Exception e){
            System.out.println("Exception: " + e);



            //To demonstrate how an Exception in the after function is returned and handled.
            Consumer<List<Integer>>
                    listConsumer1 = list3 -> list3.stream().forEach(a -> System.out.println(a + " "));
            List<Integer> list3 = new ArrayList<>();
            list3.add(2);
            list3.add(100);
            try {
                listConsumer1.andThen(modify).accept(list3);
            }
            catch (Exception e1){
                System.out.println("Exception " + e1);
            }
         }
    }
}
