package ch03;

public class OperationEx15 {
    public static void main(String[] args) {
        // 소문자 대문자로 출력
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        System.out.println(upperCase);

        // 대문자 소문자로 출력(소수점 이하는 버림)
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);

        // 대문자 소문자로 출력(소수점 넷째자리에서 반올림)
        double pi2 = 3.141592;
        double shortPi2 = (int)(pi2 * 1000 + 0.5) / 1000.0;
        System.out.println(shortPi2);
    }
}
