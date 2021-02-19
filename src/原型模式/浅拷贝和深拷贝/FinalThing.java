package 原型模式.浅拷贝和深拷贝;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author zheng
 * @description final 和 clone
 * @date 2021/1/31
 */
public class FinalThing implements Cloneable {
    /**
     * 私有变量
     * 要使用 clone 方法， 类的成员变量上不要增加 final 关键字
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected FinalThing clone() {
        FinalThing thing = null;

        try {
            thing = (FinalThing) super.clone();

            //
            thing.arrayList = (ArrayList<String>) thing.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
