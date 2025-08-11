
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 4);
        System.out.println(mergeTwoLists(list1, list2));
        System.out.println(mergeTwoLists2Pointers(list1, list2));

    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {

        return Stream.concat(list1.stream(), list2.stream()).sorted().toList();

    }

    public static List<Integer> mergeTwoLists2Pointers(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }
        while (i < list1.size())
            result.add(list1.get(i++));
        while (j < list2.size())
            result.add(list1.get(j++));
        return result;

    }

}
