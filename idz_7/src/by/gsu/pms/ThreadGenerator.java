package by.gsu.pms;

public class ThreadGenerator {
    private final int threadNum;
    private final MathOperator operator;
    private final Calculator[] calculators;
    private final long a;
    private boolean resultReady = false;

    public ThreadGenerator(int threadNum, long a, MathOperator operator) {
        this.threadNum = threadNum;
        this.operator = operator;
        calculators = new Calculator[threadNum];
        this.a = a;
    }


}
