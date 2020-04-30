package com.turbojet.components;

import com.thermo.flow.Flow;

public class Inlet {
	
	private Flow flowIn;
	private Flow flowOut;
	private double Ain, Aout, Ath; // Area
	private double Din, Dout; // Diametro
	
	// Inizializza il flusso in ingresso...
	public Inlet(Flow flowin){
		this.flowIn = flowin;
	}

	public Flow getFlowIn() {
		return flowIn;
	}

	public void setFlowIn(Flow flowIn) {
		this.flowIn = flowIn;
	}

	public Flow getFlowOut() {
		return flowOut;
	}

	public void setFlowOut(Flow flowOut) {
		this.flowOut = flowOut;
	}

	public double getAin() {
		return Ain;
	}

	public void setAin(double ain) {
		Ain = ain;
	}

	public double getAout() {
		return Aout;
	}

	public void setAout(double aout) {
		Aout = aout;
	}

	public double getDin() {
		return Din;
	}

	public void setDin(double din) {
		Din = din;
	}

	public double getDout() {
		return Dout;
	}

	public void setDout(double dout) {
		Dout = dout;
	}

	public double getAth() {
		return Ath;
	}

	public void setAth(double ath) {
		Ath = ath;
	}

	// Metodo toString per stampa di tutti i campi della presa dinamica...
	@Override
	public String toString() {
		return "Inlet [flowIn=" + flowIn + ", flowOut=" + flowOut + ", Ain=" + Ain + ", Aout=" + Aout + ", Ath=" + Ath
				+ ", Din=" + Din + ", Dout=" + Dout + "]";
	}
	
}
