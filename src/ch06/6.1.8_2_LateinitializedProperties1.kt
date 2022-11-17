package ch06.ex1_8_2_LateinitializedProperties1

import org.junit.Before
import org.junit.Test
import org.junit.Assert

// 나중에 초기화하는 프로퍼티 사용하기

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    // 초기화하지 않고 널이 될수 없는 프로퍼티 선언
    // 항상 var 사용
    private lateinit var myService: MyService

    @Before fun setUp() {
        // 초기화
        myService = MyService()
    }

    @Test fun testAction() {
        //  널 검사 수행하지 않음
        Assert.assertEquals("foo",
            myService.performAction())
    }
}
