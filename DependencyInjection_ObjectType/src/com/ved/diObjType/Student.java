package com.ved.diObjType;

public class Student {

	private MathCheat objMathCheat;

	public void setObjMathCheat(MathCheat objMathCheat) {
		this.objMathCheat = objMathCheat;
	}

	public void studentCheatmethod() {
		objMathCheat.mathCheatMethod();
	}
}
