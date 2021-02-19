package 设计原则.calc;

/**
 * @author zheng
 * @description 运算基类
 * @date 2021/1/23
 */
public abstract class Operation {
    private double numberA;
    private double numberB;


    public abstract double getResult() throws Exception;


    public Operation() {
        numberA = 0;
        numberB = 0;
    }

    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
