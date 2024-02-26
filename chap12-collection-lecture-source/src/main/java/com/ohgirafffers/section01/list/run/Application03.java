package com.ohgirafffers.section01.list.run;

import java.util.Stack;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. Stack 에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   Stack 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        *   후입선출(LIF0 - Last In First Out) 방식의 자료구조이다.
        *  */

        Stack<Integer> intergerStack = new Stack<>();

        /* 필기. 값을 넣을 때는 push() 메소드를 이용한다. add() 도 가능하다. */

        intergerStack.push(1);
        intergerStack.push(2);
        intergerStack.push(3);
        intergerStack.push(4);
        intergerStack.push(5);


        System.out.println("intergerStack = " + intergerStack);

        /* 필기.
        *   Stack 에서 요소를 찾을 때 search() 를 이용할 수 있다.
        *   인덱스가 아닌 위에서부터의 순번을 의미한다.
        *   또한 가장 상단의 위치가 0이 아닌 1부터 시작한다.
        *   */

        System.out.println(intergerStack.search(5));

        /* 필기.
        *   peek() : 해당 스택의 가장 마지막에 있는(상단) 요소 반환
        *   pop() : 해당 스택의 가장 마지막에 있는(상단) 요소 반환 후 제거
        *  */

        System.out.println("peek() : " + intergerStack.peek());
        System.out.println("integerStack = " + intergerStack);

        System.out.println("pop() : " + intergerStack.pop());
        System.out.println("integerStack = " + intergerStack);
    }
}
