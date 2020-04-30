package com.turbojet.components.inner;

import com.thermo.flow.Flow;

public class AerodynamicProfile {
	
	private VelocityTriangle[] velocityTriangleArrayIn; // Lista dei triangoli di velocità in ingresso
	private VelocityTriangle[] velocityTriangleArrayOut; // Lista dei triangoli di velocità in uscita
	private VelocityTriangle velocityTriangleInMeanRadius; // Triangolo di velocità al raggio medio in ingresso
	private VelocityTriangle velocityTriangleOutMeanRadius; // Triangolo di velocità al raggio medio in uscita
	private double reactionDegree; // Grado di reazione
	private double chord; // Corda del profilo
	private double alpha; // Angolo di incidenza
	private Flow flowIn; // Flusso in ingresso
	private Flow flowOut; // Flusso in uscita
	
	public AerodynamicProfile() {
		
	}
	
	
}
