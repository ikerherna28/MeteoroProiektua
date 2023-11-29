package Astroak;

import java.time.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Meteorito.
 */
public class Astroa implements intAstro {


	/** The izena. */
	// Atributuoak definitu
	protected String izena;
	
	/** The masa. */
	protected double masa;
	
	/** The data aktibitate. */
	protected LocalDate dataAktibitate;
	
	/** The ra graduak. */
	//Zeruko posizioa ateratzeko aldagaiak
	protected Koordenatuak raGraduak;
    
    /** The ra minutoak. */
	protected Koordenatuak raMinutoak;
    
    /** The de graduak. */
	protected Koordenatuak deGraduak;
    
    /** The de minutoak. */
	protected Koordenatuak deMinutoak;
    
    /** The de minutoak. */
	protected String iruzkina;
	
	/**
	 * Gets the izena.
	 *
	 * @return the izena
	 */
	// Metodoak
	public String getIzena() {
		return izena;
	}
	
	/**
	 * Sets the izena.
	 *
	 * @param izena the new izena
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * Gets the masa.
	 *
	 * @return the masa
	 */
	public double getMasa() {
		return masa;
	}
	
	/**
	 * Sets the masa.
	 *
	 * @param masaBerria the new masa
	 */
	public void setMasa(double masaBerria) {
		this.masa = masaBerria;
	}
	
	/**
	 * Gets the de graduak.
	 *
	 * @return the de graduak
	 */
	public Koordenatuak getDeGraduak() {
		return deGraduak;
	}
	
	/**
	 * Sets the de graduak.
	 *
	 * @param deGraduak the new de graduak
	 */
	public void setDeGraduak(Koordenatuak deGraduak) {
		this.deGraduak = deGraduak;
	}
	
	/**
	 * Gets the ra graduak.
	 *
	 * @return the ra graduak
	 */
	public Koordenatuak getRaGraduak() {
		return raGraduak;
	}
	
	/**
	 * Sets the ra graduak.
	 *
	 * @param raGraduak the new ra graduak
	 */
	public void setRaGraduak(Koordenatuak raGraduak) {
		this.raGraduak = raGraduak;
	}
	
	/**
	 * Gets the de minutoak.
	 *
	 * @return the de minutoak
	 */
	public Koordenatuak getDeMinutoak() {
		return deMinutoak;
	}
	
	/**
	 * Sets the de minutoak.
	 *
	 * @param deMinutoak the new de minutoak
	 */
	public void setDeMinutoak(Koordenatuak deMinutoak) {
		this.deMinutoak = deMinutoak;
	}
	
	/**
	 * Gets the ra minutoak.
	 *
	 * @return the ra minutoak
	 */
	public Koordenatuak getRaMinutoak() {
		return raMinutoak;
	}
	
	/**
	 * Sets the ra minutoak.
	 *
	 * @param raMinutoak the new ra minutoak
	 */
	public void setRaMinutoak(Koordenatuak raMinutoak) {
		this.raMinutoak = raMinutoak;
	}
	 
	/**
	 * Sets the data aktibitate.
	 *
	 * @param dataAktibitate the new data aktibitate
	 */
	public void setDataAktibitate(LocalDate dataAktibitate) {
		this.dataAktibitate = dataAktibitate;
	}
	
	/**
	 * Gets the data aktibitate.
	 *
	 * @return the data aktibitate
	 */
	public LocalDate getDataAktibitate() {
		return dataAktibitate;
	}	
	
	/**
	 * Gets the iruzkina.
	 *
	 * @return the iruzkina
	 */
	public String getIruzkina() {
		return iruzkina;
	}
	
	/**
	 * Sets the iruzkina.
	 *
	 * @param iruzkina the new iruzkina
	 */
	public void setIruzkina(String iruzkina) {
		this.iruzkina = iruzkina;
	}
	
}