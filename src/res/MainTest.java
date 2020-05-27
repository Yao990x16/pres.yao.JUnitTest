package res;
/**
 * @author Yao
 * @ClassName MainTest
 * @Description TOD
 * Date 2020/4/26 18:58
 **/
public class MainTest {
    public static void main(String[] args) {
        MainTest test = new MainTest();
        int a = test.Func(0,2,6);
        System.out.println(a);
    }

    public int Func(int x,int y,int z){
        if((x<2)&&(z>5)) {
            x++;
        } else {
            x--;
        }
        if((y==3)||(z<8)) {
            y++;
        } else {
            y--;
        }
        return x+y+z;
    }
}
