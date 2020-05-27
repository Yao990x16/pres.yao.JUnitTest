package test;

import res.Computer;

/**
 * @ClassName TestCom
 * @Description TOOD
 * Date 2020/5/25 12:17
 **/
public class TestCom {
    public static void main(String[] args) {
        Computer test = new Computer();
        System.out.println("1+2: "+test.add(1,2));
        System.out.println("5-2: "+test.sub(5,2));
        System.out.println("2*3: "+test.mul(2,3));
        System.out.println("10/2: "+test.div(10,2));
        System.out.println("3的阶乘: "+test.fac(3));
        System.out.println("5的2次幂: "+test.pow(5,2));
    }
}
