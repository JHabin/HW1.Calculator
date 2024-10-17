package HWCalculator.LV3;

public class BadDivideException extends Exception{
    public BadDivideException(){
        super("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
    }
}
