package HWCalculator.LV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum, secondNum;
        int res = 0;
        char op;
        // 종료여부 yes 입력받기 전까지 무한 반복
        while(true){
            //정수형 피연산자, char형 연산자 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            secondNum = sc.nextInt();
            System.out.print("연산자를 입력하세요: ");
            op = sc.next().charAt(0);
            sc.nextLine();

            // 연산자에 따라 연산 수행
            switch(op){
                case '+':
                    res = firstNum + secondNum;
                    break;
                case '-':
                    res = firstNum - secondNum;
                    break;
                case '*':
                    res = firstNum - secondNum;
                    break;
                case '/':
                    if(secondNum == 0) {    // 분모가 0인 경우 처음부터 재입력
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다. 처음부터 다시 입력해주세요.");
                        continue;
                    }
                    res = firstNum / secondNum;
                    break;
                case '%':
                    res = firstNum % secondNum;
                    break;
            }

            //연산 결과 출력 후 종료 여부 묻기
            System.out.println("연산 결과 : "+res);
            System.out.println("종료하시겠습니까?(yes/no)");
            if (sc.nextLine().equals("yes")) break;

        }


    }
}
