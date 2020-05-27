package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import res.MainTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTestTest3 extends MainTest {
    static MainTest test;
    static int i = 1;
    @BeforeAll
    static void setUp() {
        test = new MainTest();
        System.out.println("测试开始!");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("测试完成!");
    }

    @ParameterizedTest
    @MethodSource("getTestParas")
    void func(int x,int y,int z,int expect) {
        System.out.println("执行func第"+i+"个组合覆盖");
        //实际值
        int actual = test.Func(x,y,z);
        //判定覆盖
        assertEquals(expect,actual);
        System.out.println("x:"+x+" y:"+y+" z:"+z+" 期望值:"+expect+" 实际值:"+actual);
        i++;
    }

    public static Stream<Arguments> getTestParas(){
        return Stream.of(
                //组合覆盖
                Arguments.of(1, 4, 8, 13),
                Arguments.of(2, 3, 5, 10),
                Arguments.of(2, 3, 8, 13),
                Arguments.of(0, 2, 5, 7));
    }
}