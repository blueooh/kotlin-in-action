package genericTest;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    private ArrayList<Output<String>> items = new ArrayList<>();

    public ArrayList<Output<String>> getItems() {
        return items;
    }

    public void init() {
        this.items.add(new Output<String>() {
            @Override
            public boolean isArgument(String argument) {
                return true;
            }
        });

        this.items.add(new Output<String>() {
            @Override
            public boolean isArgument(String argument) {
                return false;
            }
        });
    }

    public void printAll(List<? super Output<String>> items) {
        items.add(new Output<String>() {
            @Override
            public boolean isArgument(String argument) {
                return false;
            }
        });

        // compile error
//        for (int i = 0; i < items.size(); ++i) {
//            Output<String> stringOutput = items.get(i);
//            System.out.println(stringOutput.isArgument("" + i));
//        }
    }

    public void printAll2(List<? extends Output<String>> items) {
        // compile error
//        items.add(new Output<String>() {
//            @Override
//            public boolean isArgument(String argument) {
//                return false;
//            }
//        });

        for (int i = 0; i < items.size(); ++i) {
            Output<String> stringOutput = items.get(i);
            System.out.println(stringOutput.isArgument("" + i));
        }
    }
}
