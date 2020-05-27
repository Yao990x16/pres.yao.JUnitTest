/*
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import res.MainTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTestTest extends MainTest {
    static MainTest test;
    @BeforeEach
    void setUp() {
        test = new MainTest();
        System.out.println("测试开始!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("测试完成!");
    }

    @ParameterizedTest
    @MethodSource("getTestParas")
    void func(int x,int y,int z,int expect) {
        System.out.println("执行func");
        //实际值
        int actual = test.Func(x,y,z);
        //判定覆盖
        assertEquals(expect,actual);
        //条件覆盖
        assertEquals(expect,actual);
        //判定-条件覆盖
        assertEquals(expect,actual);
        //条件组合
        assertEquals(expect,actual);
    }

    public static Stream<Arguments> getTestParas(){
        return Stream.of(
                //判定覆盖
                Arguments.of(1,4,6,13),
                Arguments.of(2,4,4,10),
                //条件覆盖
                Arguments.of(0,2,5,7),
                Arguments.of(2,3,8,13),
                //判定-条件覆盖
                Arguments.of(1,3,6,12),
                Arguments.of(2,4,4,10),
                //条件组合覆盖
                Arguments.of(1, 3, 6, 12),
                Arguments.of(1, 3, 8, 14),
                Arguments.of(1, 4, 6, 13),
                Arguments.of(1, 4, 8, 13),
                Arguments.of(1, 3, 5, 9),
                Arguments.of(2, 3, 6, 11),
                Arguments.of(2, 3, 8, 13),
                Arguments.of(2, 4, 6, 12),
                Arguments.of(2, 4, 8, 12),
                Arguments.of(2, 3, 5, 10),
                Arguments.of(2, 4, 5, 11));
    }
}*/
