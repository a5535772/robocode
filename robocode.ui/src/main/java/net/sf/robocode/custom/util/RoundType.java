package net.sf.robocode.custom.util;

public enum RoundType {
	Human(0), Robet(1);

	private int type;

	private RoundType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
