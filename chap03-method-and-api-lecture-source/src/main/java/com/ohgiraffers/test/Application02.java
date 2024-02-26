package com.ohgiraffers.test;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("메인 메소드 동작 실행함...");

        Application02 app2 = new Application02();
        app2.testMethod1(100);
        int result = app2.testMethod2(200);
        System.out.println("result = " + result);

        app2.testMethod3("김재중", 20, '남');

        System.out.println("메인 메소드 동작 종료함...");



    }

    public void testMethod1(int num) {

        System.out.println(++num);

    }

    public int testMethod2(int num) {

        return num;

    }

    public void testMethod3(String name, int age, char gender) {

        System.out.println("내 이름은 " + name + "이고" + "나이는" + age + "살이며" + "성별은" + gender + "이야");



    }

}

