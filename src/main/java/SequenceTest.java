import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceTest {
    public static void test() {
        // Java List<?> == Kotlin List<out Any?>
        List<?> objects = Arrays.asList(1, '2', "3");
        // 필요 타입: capture of ?
        // 제공된 타입: int
        objects.add(null);

        List<String> words = Arrays.asList("The quick brown fox jumps over the lazy dog".split(" "));
        List<Integer> results = words.stream()
                .filter(e -> {
                    System.out.println("filter: " + e);
                    return e.length() > 3;
                })
                .map(e -> {
                    System.out.println("length: " + e.length());
                    return e.length();
                })
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(results);

//        output
//        filter: The
//        filter: quick
//        length: 5
//        filter: brown
//        length: 5
//        filter: fox
//        filter: jumps
//        length: 5
//        filter: over
//        length: 4
//        [5, 5, 5, 4]
    }
}
