package Layla;

public class intsc {
    public static void main(String[] args){
        String sentence = "I want to be possessed by Raiden EI in Tibet";

        // 특정 인덱스에 존재하는 문자 출력하기!
        System.out.println(sentence.charAt(0));

        // 특정 길이에 있는 문자열 출력하기
        System.out.println(sentence.substring(26, 35));

        // 문자열을 캐릭터 배열 타입으로 변경 ( 문자 배열 타입 )
        char[] sentence_char = sentence.toCharArray();
        System.out.println(sentence_char);

        // 문자열 길이 확인
        System.out.println(sentence.length());
    }
}
