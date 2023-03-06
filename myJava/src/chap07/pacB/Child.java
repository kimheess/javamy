package chap07.pacB;

import chap07.pacA.Parent;

public class Child extends Parent{
	int methodC() {
		return methodA();
	}
}
