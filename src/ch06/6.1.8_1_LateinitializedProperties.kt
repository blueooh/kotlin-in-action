package ch06.ex1_8_1_LateinitializedProperties

import org.junit.Before
import org.junit.Test
import org.junit.Assert

// 6.1.8 나중에 초기화할 프로퍼티

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    // 널이 될 수 없는 타입을 사용하면 반드시 널이 아닌값으로 초기화
    // 초기화 값을 제공할 수 없으면 널이 될 수 있는 타입을 사용하면 모든 프로퍼트 접근에 널감사를 넣가 !!연산자 사용
    private var myService: MyService? = null

    @Before fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        // 널 가능성에 신경써야 한다.
        Assert.assertEquals("foo",
            myService!!.performAction())
    }
}

// 코드가 못 생겨진다.
