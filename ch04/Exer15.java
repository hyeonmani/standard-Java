package ch04;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        // number를 거꾸로 변환해서 담을 변수
        int result = 0;

        while(tmp != 0){
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        if(number == result){
            System.out.println(number + "는 회문수 입니다.");
        } else {
            System.out.println(number + "는 회문가 아닙니다..");
        }
    }
}
