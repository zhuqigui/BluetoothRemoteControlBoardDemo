import java.text.NumberFormat;

public class JavaTest1 {
    public static void main(String[] args) {
       //String mBufferRead="0100025e4105664f06e27c00000e000000000000";
         String mBufferRead="0100fcdace01a6f5fc3c6400063f000881900202";
        /**
         * 01----表示该数据包为欧拉角数据帧
         * 00----reserved
         * fc da ce --y -818.2478
         * 01 a6 f5 --x 10.8277
         * fc 3c 64 --z -814.1924
         * 00 06 3f --第 1599 次数据
         * 00 ----扳机是松开的
         * ff 08 ----power button 是按下的
         * 81 90 ---x 10 00 0001 1001 0000 表示移动事件，x=400
         * 02 02---y y=514
         */
        String dataType=mBufferRead.substring(0,2);
        String y=mBufferRead.substring(4,10);
        String x=mBufferRead.substring(10,16);
//        String z=mBufferRead.substring(16,22);
//        String times=mBufferRead.substring(22,28);
//        String trigger=mBufferRead.substring(28,30);
//        String keyDown=mBufferRead.substring(30,32);
//        String xMoveEvent=mBufferRead.substring(32,36);
//        String yMoveEvent=mBufferRead.substring(36,40);
//        System.out.println("y=="+y+",x=="+x+",,z=="+z);
//        System.out.println("times=="+times+",trigger=="+trigger+",,keyDown=="+keyDown);
        //System.out.println("xMoveEvent=="+xMoveEvent+",yMoveEvent=="+yMoveEvent);
        //y="fcdace";x="01a6f5";z="fc3c64";

        Utils mUtils=new Utils();
        mUtils.dataTypeEvent("01");//1
        mUtils.dataTypeEvent("02");//2
        mUtils.dataTypeEvent("20");//32

        //欧拉数测试
//        System.out.println("y=="+ONaUtils.getInstance().getONaYPoint(y)); //fcdace
//        System.out.println("x=="+ONaUtils.getInstance().getONaYPoint(x)); //01a6f5
//        System.out.println("z=="+ONaUtils.getInstance().getONaYPoint(z)); //fc3c64

//        ONaUtils.getInstance().getTriggerStatus("00");//0
//        ONaUtils.getInstance().getTriggerStatus("ff");//255
//        ONaUtils.getInstance().getKeydownStatus("f0");//App 按键按下
//        ONaUtils.getInstance().getKeydownStatus("08");//Power/Home 按键按下
//        ONaUtils.getInstance().getKeydownStatus("04");//Touchpad 按键按下
//        ONaUtils.getInstance().getKeydownStatus("02");//Hand (left) 按键按下
//        ONaUtils.getInstance().getKeydownStatus("01");//Hand (right 按键按下
//        ONaUtils.getInstance().getMoveEventStatus("8190");
//        ONaUtils.getInstance().getMoveEventXPoint("8190");
//        ONaUtils.getInstance().getMoveEventYPoint("0202");

        //4元数测试

    }


}
