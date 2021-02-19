package 原型模式.通用代码;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/31
 */
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;

        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototypeClass;
    }
}
