package 原型模式.浅拷贝和深拷贝;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 深拷贝
 * @date 2021/1/31
 */
public class DeepThing implements Cloneable {
    /**
     * 私有变量
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected DeepThing clone() {
        DeepThing thing = null;

        try {
            thing = (DeepThing) super.clone();

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
