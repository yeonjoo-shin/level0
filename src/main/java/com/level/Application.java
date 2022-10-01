package com.level;

import com.sun.org.apache.bcel.internal.generic.LDIV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        div(3,2);
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num2[] = {1, 7, 10, 3, 5};
        middle(num);
        middle2(num2);
        arrString();
        getPair(20);
    }

    public static int div(int num1, int num2) { // 몫 구하기
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }

    public static double middle(int[] num) {     // 원소의 평균 구하기
        double total = 0;
        for (int n : num) {
            total += n;
        }
        return  total / num.length;
    }

    public static int middle2(int[] array) { // 원소의 중간값 구하기
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static String arrString() { // 문자열 뒤집기
        String temp = "javaBuffer";
        StringBuffer buffer = new StringBuffer(temp);
        String result = buffer.reverse().toString();
        System.out.println(result);
        return result;
    }

    public static int getPair(int num) { // 순서쌍 구하기
        int cnt = 0;
        for(int i= 1; i<= num ; i++) {
            if (num % i == 0) {
                cnt ++;
            }
        }
        return cnt;
    }
}
