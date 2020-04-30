package com.turbojet.components.inner;

public class Stage {
	
	private HalfStage rotativeStage;
	private HalfStage fixedStage;
	
	public Stage() {
		
	}

	public HalfStage getRotativeStage() {
		return rotativeStage;
	}

	public void setRotativeStage(HalfStage rotativeStage) {
		this.rotativeStage = rotativeStage;
	}

	public HalfStage getFixedStage() {
		return fixedStage;
	}

	public void setFixedStage(HalfStage fixedStage) {
		this.fixedStage = fixedStage;
	}
	
}
