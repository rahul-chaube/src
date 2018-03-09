package threadDemo;

import java.util.concurrent.Callable;

public class CallableAdder implements Callable<Integer> {
    Integer operand1;
    Integer operand2;

    public CallableAdder(Integer operand1, Integer operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"says portal sum  "+operand1 +" + "+operand2 +"  =  "+(operand1+operand2));
        return operand1+operand2;
    }
}
