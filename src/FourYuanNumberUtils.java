public class FourYuanNumberUtils {
    Utils mUtils;

    private static FourYuanNumberUtils instance=new FourYuanNumberUtils();

    private FourYuanNumberUtils(){
        mUtils=new Utils();
        //默认提供的构造方法是public的 因此在此需要自定义一个无参的构造 并将访问权限该为private的
    }

    public static FourYuanNumberUtils getInstance(){
        return instance;
    }
    //四元数 w 的实际值=w/0x7FFFFF,例如：
    //Dec(1193046) Float(1193046.0/0x7FFFFF) 0.14222218301560677
    public void getFourYuanDataWValue(String wValue){
        //1.先转为10进制如123456->‭1193046‬
        mUtils.getWValue(wValue);
    }
}
