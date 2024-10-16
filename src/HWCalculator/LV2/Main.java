package HWCalculator.LV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();     // Calculator 클래스 객체 생성

        int firstNumber, secondNumber;
        int result = 0;
        char op;

        // 종료여부 yes 입력받기 전까지 무한 반복
        while(true){
            //정수형 피연산자, char형 연산자 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            secondNumber = sc.nextInt();
            System.out.print("연산자를 입력하세요: ");
            op = sc.next().charAt(0);
            sc.nextLine();

            if (op == '/' & secondNumber == 0) {    // 분모가 0인 경우 처음부터 재입력
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다. 처음부터 다시 입력해주세요.");
                continue;
            }
            //Calculator 클래스의 연산 메서드로 연산 수행
            result = calc.calculate(op, firstNumber, secondNumber);
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
