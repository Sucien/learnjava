package chapter02;


/** 一个类注释 */
//javadoc只能为public（公共）和protected（受保护）成员处理注释文档。
public class AboutNotes {
    //一共有两种注释：
    //第一种~

    /*
    * 第二种
    * 可以跨越多行！
    * */

    /** 一个变量注释 */
    public int i;

    /*
    * 类文档标记
    * @version 版本信息:
    *   “版本信息”代表任何适合作为版本说明的资料
    * @author 作者信息:
    *   “作者信息”包括您的姓名、电子函件地址或者其他任何适宜的资料。
    * @param 参数名 说明:
    *   “参数名”是指参数列表内的标识符，而“说明”代表一些可延续到后续行内的说明文字。
    * @return 说明:
    *   “说明”是指返回值的含义。它可延续到后面的行内。
    * @exception 完整类名 说明:
    *   “完整类名”明确指定了一个违例类的名字，它是在其他某个地方定义好的。
    * @deprecated:若将一个方法标记为@deprecated，则使用该方法时会收到编译器的警告。
    *
    * */

}