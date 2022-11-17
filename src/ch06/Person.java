package ch06;

// 널 가능성 애노테이션이 없는 자바 클래스

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/* Java */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        int i = 1;
        long l = i;

        List list = new ArrayList<Integer>();
        list.add(null);

        return name;
    }
}
