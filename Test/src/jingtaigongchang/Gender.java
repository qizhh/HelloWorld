package jingtaigongchang;

public class Gender
{

    /*
     *    这一特性的缺点是与其他的静态方法没有明显的区别，
     *    使用户难以识别类中到底哪些静态方法专门负责返回类的实例。
     *    为了减少这一缺点带来的负面影响，
     *    可以在为静态工厂方法命名时尽量遵守约定俗成的规范，
     *    当然这不是必需的。
     *    目前比较流行的规范是把静态工厂方法命名为valueOf或者getInstance。
     *    比如  //Integer a = Integer.valueOf(100);
     *          //Calendar cal=Calendar.getInstance(Locale.CHINA);
     */
    private String description;

    private Gender(String description)
    {
        this.description = description;
    }

    //静态工厂
    public static Gender getFemale()
    {
        return new Gender("女");
    }

    //静态工厂
    public static Gender getMale()
    {
        return new Gender("男");
    }

    public String getDescription()
    {
        return description;
    }
}

