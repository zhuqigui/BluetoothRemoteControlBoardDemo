/* @src  http://eric-619.iteye.com/blog/693665
 *公式自己总结吧，很简单了
 * java进制转换代码实例(算法实现)
 * 2、8、10、16两两转换
 *     二进制： 0-1
 *     八进制： 0-7
 *     十进制： 0-9
 *     十六进制：0-9 a-f(A表示10，而F表示15) (十六进制一般以ox或Ox开头)
 *
 *
 */
public class SuanFa {

    public static void main(String[] args) {
        int shi = 120;

        new SuanFa().ershi();
        new SuanFa().bashi();
        new SuanFa().liushi();

        new SuanFa().shier(shi);
        new SuanFa().shiba(shi);
        new SuanFa().shiliu(shi);
    }

    public void ershi(){
        int er = 1100100; // 二进制数1100100转化成十进制
        double f01 = 0 * Math.pow(2,0);
        double f02 = 0 * Math.pow(2,1);
        double f03 = 1 * Math.pow(2,2);
        double f04 = 0 * Math.pow(2,3);
        double f05 = 0 * Math.pow(2,4);
        double f06 = 1 * Math.pow(2,5);
        double f07 = 1 * Math.pow(2,6);
        double fz = f01 + f02 + f03 + f04 + f05 + f06 + f07;
        System.out.println("算法：" + "二进制数" + er + "转化成十进制数为" + fz);
    }

    public void bashi(){
        int ba = 1507; // 八进制数1507转化成十进制
        double f01 = 7 * Math.pow(8,0);
        double f02 = 0 * Math.pow(8,1);
        double f03 = 5 * Math.pow(8,2);
        double f04 = 1 * Math.pow(8,3);
        double fz = f01 + f02 + f03 + f04;
        System.out.println("算法：" + "八进制数" + ba + "   转化成十进制数为" + fz);
    }

    public void liushi(){
        String liu = "2AF5";   // 八进制数2AF5转化成十进制
        double f01 = 5 * Math.pow(16,0);
        double f02 = 15 * Math.pow(16,1);
        double f03 = 10 * Math.pow(16,2);
        double f04 = 2 * Math.pow(16,3);
        double fz = f01 + f02 + f03 + f04;
        System.out.println("算法：" + "十六进制数" + liu + " 转化成十进制数为" + fz);
    }

    // 十进制数120转化成二进制
    public void shier(int shi){
        int f01 = shi / 2;
        int f02 = f01 / 2;
        int f03 = f02 / 2;
        int f04 = f03 / 2;
        int f05 = f04 / 2;
        int f06 = f05 / 2;
        int f07 = f06 / 2; // f0_为0才终止
        int s01 = shi % 2;
        int s02 = f01 % 2;
        int s03 = f02 % 2;
        int s04 = f03 % 2;
        int s05 = f04 % 2;
        int s06 = f05 % 2;
        int s07 = f06 % 2;
        String str01 = String.valueOf(s01);
        String str02 = String.valueOf(s02);
        String str03 = String.valueOf(s03);
        String str04 = String.valueOf(s04);
        String str05 = String.valueOf(s05);
        String str06 = String.valueOf(s06);
        String str07 = String.valueOf(s07);
        String sz = str07 + str06 + str05 + str04 + str03 + str02 + str01;
        //int isz = Integer.parseInt(sz);
        System.out.println("算法：" + "十进制数" + shi + "转化成二进制数为" + sz);
    }

    // 十进制数120转化成八进制
    public void shiba(int shi){
        int f01 = shi / 8;
        int f02 = f01 / 8;
        int f03 = f02 / 8; // f0_为0才终止
        int s01 = shi % 8;
        int s02 = f01 % 8;
        int s03 = f02 % 8;
        String str01 = String.valueOf(s01);
        String str02 = String.valueOf(s02);
        String str03 = String.valueOf(s03);
        String sz = str03 + str02 + str01;
        //int isz = Integer.parseInt(sz);
        System.out.println("算法：" + "十进制数" + shi + "转化成八进制数为" + sz);
    }

    // 十进制数120转化成十六进制
    public void shiliu(int shi){
        int f01 = shi / 16;
        int f03 = f01 / 16; // f0_为0才终止
        int s01 = shi % 16;
        int s02 = f01 % 16;
        String str01 = String.valueOf(s01);
        String str02 = String.valueOf(s02);
        String sz = str02 + str01;
        //int isz = Integer.parseInt(sz);
        System.out.println("算法：" + "十进制数" + shi + "转化成十六进制数为" + sz);
    }
}