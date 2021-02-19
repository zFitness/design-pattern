package 原型模式.浅拷贝和深拷贝;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 浅拷贝
 * @date 2021/1/31
 */
public class Thing implements Cloneable {
    /**
     * 私有变量
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Thing clone() {
        Thing thing = null;

        try {
            thing = (Thing) super.clone();
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
