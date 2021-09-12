package net.gowri;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddNumberedUnpaired {

    public int find(int[] A) {

//        Arrays.stream(A).boxed().collect(Collectors.toMap(i -> i, Function.identity(),(oldVal,newVal) -> oldVal +1));

        return Arrays.stream(A)
                .parallel()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(k -> k.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findAny().orElse(0);

    }


    public int findBetter(int[] A) {
        Set<Integer> numbers = new HashSet<>();

        for (int j : A) {
            if (!numbers.remove(j)) {
                numbers.add(j);
            }
        }

        return (int) numbers.toArray()[0];
    }
}
