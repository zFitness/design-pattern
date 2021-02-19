package 策略模式.加减法运算.策略枚举;

/**
 * @author zheng
 * @description 策略枚举
 * @date 2021/2/6
 */
public enum Calculator {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },

    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }

    };

    String symbol = "";

    Calculator(String symbol) {
        this.symbol = symbol;
    }

    public String getValue() {
        return this.symbol;
    }

    /**
     * 声明抽象函数
     * @param a
     * @param b
     * @return
     */
    public abstract int exec(int a, int b);
}
