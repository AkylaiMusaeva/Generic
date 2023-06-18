package practice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxElement(List.of(16, 6, 4, 6, 1, 1, -2, 0, 3, -1), 2, 6));

    }
    public static  <T extends Comparable<T>> T findMaxElement(List<T> list, int start, int end) {
        T max = list.get(start);
        if (end < list.size()) {
            for (int i = start; i < end; i++) {
                if (list.get(i).compareTo(max) > 0) {
                    max = list.get(i);
                }
            }
        }else{
            throw new ArrayIndexOutOfBoundsException("Error");
        }
        return max;
    }
}



