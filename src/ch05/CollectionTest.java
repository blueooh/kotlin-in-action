package ch05;

import ch03.ex3_4_1_NoOverridingForExtensionFunctions.View;

import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    public static void main(String [] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(integers.stream().map(e -> e*e));

        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Something...
            }
        });

        button.setOnClickListener(view -> {
            // Do Something2...
        });
    }
}
