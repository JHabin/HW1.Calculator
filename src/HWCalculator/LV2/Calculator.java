package HWCalculator.LV2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Integer> resqueue;
    public Calculator() {
        resqueue = new LinkedList<>();  // 큐 생성

    }
    public Queue<Integer> getResult() {     //getter 메서드
        return resqueue;
    }
    public void setResult() {   //setter 메서드
        this.resqueue = resqueue;
    }
    public void printQueue(){   //큐 내용 전체 출력
        System.out.println(resqueue);
    }
    public void removeRes (){
        resqueue.poll();    //가장 먼저 저장된 데이터 삭제
        System.out.println("삭제되었습니다.");
    }
    public int calculate(char op, int firstNumber, int secondNumber){   //연산 수행
        int res = 0;
        switch (op) {
            case '+':
                res = firstNumber + secondNumber;
                break;
            case '-':
                res = firstNumber - secondNumber;
                break;
            case '*':
                res = firstNumber * secondNumber;
                break;
            case '/':
                res = firstNumber / secondNumber;
                break;
            case '%':
                res = firstNumber % secondNumber;
                break;
        };
        return res;
    }

}
