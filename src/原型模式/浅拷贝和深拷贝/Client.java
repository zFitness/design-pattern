package 原型模式.浅拷贝和深拷贝;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/31
 */
public class Client {
    public static void main(String[] args) {
        //浅拷贝测试，产生一个对象
        Thing thing = new Thing();
        thing.setValue("张三");

        //拷贝对象
        Thing clone = thing.clone();
        clone.setValue("李四");

        //结果相同
        System.out.println(thing.getValue());
        System.out.println(clone.getValue());


        // 深拷贝测试，
        DeepThing thing1 = new DeepThing();
        thing1.setValue("王五");
        DeepThing deepThing = thing1.clone();
        deepThing.setValue("赵六");

        System.out.println(thing1.getValue());
        System.out.println(deepThing.getValue());

    }
}
