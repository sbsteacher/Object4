package com.sbs.obj4;

public class AbstTest {
	public static void main(String[] args) {
		AbstCls cls = getObj(2);
		printResult(cls, 10, 20);
	}
	
	public static AbstCls getObj(int a) {
		if(a == 1) {
			return new Calc();
		} else {
			return new Calc3();
		}
	}
	
	public static void printResult(AbstCls cls, int a, int b) {
		System.out.println(cls.multi(a, b));
	}
	
}













