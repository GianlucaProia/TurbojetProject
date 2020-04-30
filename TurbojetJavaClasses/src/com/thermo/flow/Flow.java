package com.thermo.flow;

public class Flow {
	
	private double T;
	private double P;
	private double gamma;
	private double Mach;
	private double Ttot;
	private double Ptot;
	private double density;
	private double delta;
	private double soundSpeed;
	private double Rgas;
	
	public Flow() {
		
	}

	public double getT() {
		return T;
	}

	public void setT(double t) {
		T = t;
	}

	public double getP() {
		return P;
	}

	public void setP(double p) {
		P = p;
	}

	public double getGamma() {
		return gamma;
	}

	public void setGamma(double gamma) {
		this.gamma = gamma;
	}

	public double getMach() {
		return Mach;
	}

	public void setMach(double mach) {
		Mach = mach;
	}

	public double getTtot() {
		return Ttot;
	}

	public void setTtot(double ttot) {
		Ttot = ttot;
	}

	public double getPtot() {
		return Ptot;
	}

	public void setPtot(double ptot) {
		Ptot = ptot;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}
	
	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public double getSoundSpeed() {
		return soundSpeed;
	}

	public void setSoundSpeed(double soundSpeed) {
		this.soundSpeed = soundSpeed;
	}

	public double getRgas() {
		return Rgas;
	}

	public void setRgas(double rgas) {
		Rgas = rgas;
	}
}
