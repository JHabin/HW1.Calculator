package HWCalculator.LV3;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    private static final String OPERATION_REG = "[+\\-*/]";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calc = new ArithmeticCalculator();     // Calculator 클래스 객체 생성

        double firstReal, secondReal;
        double result = 0;
        char op;

        // 종료여부 yes 입력받기 전까지 무한 반복
        while(true){
            //정수형 피연산자, char형 연산자 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstReal = sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            secondReal = sc.nextDouble();
            System.out.print("연산자를 입력하세요: ");
            op = sc.next().charAt(0);
            sc.nextLine();
            if (!Pattern.matches(OPERATION_REG, Character.toString(op))) {  // 연산자가 아닌 값을 입력받을 경우 실행
                System.out.println("잘못된 연산자입니다. 처음부터 다시 입력하세요.");
                continue;
            }
            try {
                //Calculator 클래스의 연산 메서드로 연산 수행
                result = calc.calculate(op, firstReal, secondReal);

            }
            catch (BadDivideException e){    // second가 0이고 연산자가 / 일 경우 에러메세지를 출력
                System.out.println(e.getMessage());
            }
            System.out.println("연산 결과 : "+ result);
            calc.getResult().add(result);   //연산 결과 큐에 저장

            System.out.println("연산 결과가 성공적으로 저장되었습니다.");
            calc.printQueue();  //큐에 정상적으로 저장되었는지 확인

            System.out.println(" 가장 먼저 저장된 데이터를 삭제할까요?(yes/no)");
            if (sc.nextLine().equals("yes")) {
                calc.removeRes();   // 가장 먼저 저장된 데이터 삭제
                calc.printQueue();  // 정상적으로 삭제되었는지 확인
            }

            //종료 여부 묻기
            System.out.println("종료하시겠습니까?(yes/no)");
            if (sc.nextLine().equals("yes")) break;

        }

    }
}