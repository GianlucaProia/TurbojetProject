package com.turbojet.components;

import com.thermo.flow.Flow;
import com.turbojet.components.inner.Stage;

public class Compressor {
	
	private Stage[] stageArray; // Lista di stadi
	private int nStages; // Numero di stadi
	private double beta, etaMecc, etaAdiab, omega, Din, Dout, Ain, Aout, rTip, rHub;
	private Flow flowIn;
	private Flow flowOut;
	
	// Inizializzazione di base del compressore...
	public Compressor(int beta, int etaMecc, int etaAdiab) {
		this.flowIn = new Flow();
		this.flowOut = new Flow();
		this.beta = beta;
		this.etaMecc = etaMecc;
		this.etaAdiab = etaAdiab;
	}

	
}
