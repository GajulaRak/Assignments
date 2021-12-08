package com.example;

public class PlatinumStall extends SilverStall {
	int projector;

	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}

	public PlatinumStall(String name, String detail, String owner, int cost, int projector) {
		super(name, detail, owner, cost);
		this.projector = projector;
	}

	public int getTvset() {
		// TODO Auto-generated method stub
		return getTvset();
	}

	/*public PlatinumStall(String string, String string2, String string3, int parseInt, int parseInt2, int parseInt3) {
		// TODO Auto-generated constructor stub
	}*/
	/*public int getTvSet() {
		// TODO Auto-generated method stub
		
return 0;
	}*/

}
