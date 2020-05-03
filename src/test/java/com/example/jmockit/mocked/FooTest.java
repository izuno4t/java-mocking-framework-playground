package com.example.jmockit.mocked;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mockit.Expectations;
import mockit.Mocked;


public class FooTest {

    @Test
    public void testFooWithoutMock() {
        Foo foo = new Foo();
        assertEquals(11, foo.foo(5,6));
        assertEquals("fooxxx", foo.foo("xxx"));
    }


    // テストメソッドのパラメータとして指定することで、モック化されたインスタンスを作成できます
    // FIXME VSCode だと引き通付きのテストを単体で実行できない
    @Test
    public void testFooWithMock(@Mocked Foo mock) {
        new Expectations() {{
            // hogeがx=5, y = 6で呼ばれたら1回目は99を返す
            mock.foo(5,6);
            result  = 99;
        }};

        // Expectationsでメソッドのresultを指定した場合は、その値が取得される
        assertEquals(99, mock.foo(5,6));
        // Expectationsでメソッドのresultを指定されていない場合は、初期値(null)となる
        assertEquals(null, mock.foo("xxx"));

        // @Mockedを使用した場合、そのテストの期間は、すべての該当のインスタンスがモック化される
        Foo foo = new Foo();
        assertEquals(99, foo.foo(5,6));
        assertEquals(null, foo.foo("xxx"));

    }

}
