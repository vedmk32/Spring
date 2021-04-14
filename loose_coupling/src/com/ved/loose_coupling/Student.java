package com.ved.loose_coupling;

public class Student {

	private Cheat objCheat;

	public void setObjCheat(Cheat objCheat) {
		this.objCheat = objCheat;
	}

	public void studentCheatmethod() {
		objCheat.cheat();
	}
}
