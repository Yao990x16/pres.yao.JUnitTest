package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import res.Computer;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest extends Computer {
    static Computer test;
    static double result;
    @BeforeAll
    static void setUp() {
        test = new Computer();
        System.out.println("测试开始!");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("测试完成!");
    }
    @Test
    void add() {
        assertEquals(100,test.add(0,100));
    }

    @Test
    void sub() {
        assertEquals(-100,test.sub(0,100));
    }

    @Test
    void mul() throws Exception{
        Assert.assertEquals(6.0,test.mul(2,3));
        try {
            for(; ;){
                Assert.assertEquals(8.0,test.mul(2,4));
                //wait(1000);
                //break;
            }
        }catch (Exception e){
            assertEquals("死循环",e.getMessage());
            fail("死循环");
        }
    }

    @Test
    void div() throws Exception{
        result = test.div(6,2);
        Assert.assertEquals(3.0,result);
        try
        {
            result = test.div(4,0);
        }
        catch(Exception ex){
            assertEquals("除数不能为0!", ex.getMessage());
            fail("除数不能为0");
        }
    }

    @Test
    void fac() {
        assertEquals(3628800,test.fac(10));
    }

    @Test
    void pow() {
        assertEquals(8,test.pow(2,3));
    }
}