package com.ohgiraffers.section01.conditional;

public class Applicaiotn01 {


    public static void main(String[] args) {

        A_if a = new A_if();
//        a.testSimpleIfStatement();
//        a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
//        b.testSimpleIfElseStatement();
//        b.testNestedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
//        c.testSimpleIfElseIfStatement();

        D_switch d = new D_switch();
//        d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();
    }
}
