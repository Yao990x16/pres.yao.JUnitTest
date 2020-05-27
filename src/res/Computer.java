package res;

/**
 * @author Yao
 * @ClassName Computer
 * @Description TOAD
 * Date 2020/5/10 21:32
 **/
public class Computer {
    private double num0;
    private double num1;
    public Computer(){

    }
    public Computer(double num0, double num1){
            this.num0 = num0;
            this.num1 = num1;
    }

    public double getNum0() {
        return num0;
    }

    public void setNum0(double num0) {
        this.num0 = num0;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double add(double num0, double num1){
        return num0 + num1;
    }

    public double sub(double num0,double num1){
        return num0 - num1;
    }

    public double mul(double num0,double num1){ return num0*num1; }

    public double div(double num0,double num1){
        if(num1 == 0){
            throw new IllegalArgumentException("除数不能为0");
        }
        return num0/num1;
    }

    public double fac(double num){
        if(num<=1) {
            return  1;
        } else {
            return num*fac(num-1);
        }
    }

    public double pow(double num0,double num1){
        return Math.pow(num0, num1);
    }
}
