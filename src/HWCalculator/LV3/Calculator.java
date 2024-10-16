package HWCalculator.LV3;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Double> resqueue;
    public Calculator() {
        resqueue = new LinkedList<>();  //연산결과 저장하는 큐 생성

    }
    public Queue<Double> getResult() { //getter 메서드
        return resqueue;
    }
    public void setResult() { //setter 메서드
        this.resqueue = resqueue;
    }
    public void printQueue(){   //큐 내용 전체 출력
        System.out.println(resqueue);
    }
    public void removeRes (){
        resqueue.poll();    //가장 먼저 저장된 데이터 삭제
        System.out.println("삭제되었습니다.");
    }
    public double calculate(char op, double firstReal, double secondReal){   //연산 수행
        double res = 0;

        switch (op) {
            case '+':
                res = firstReal + secondReal;
                break;
            case '-':
                res = firstReal - secondReal;
                break;
            case '*':
                res = firstReal * secondReal;
                break;
            case '/':
                res = firstReal / secondReal;
                break;
            case '%':
                res = firstReal % secondReal;
                break;
        };
        return res;
    }

}
