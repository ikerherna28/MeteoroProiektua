package Astroak;

import java.time.LocalDate;
import java.util.Random;

public class Kometa extends Astroa {
	
	// ATRIBUTOAK

	private double abiadura;			// Kometaren abiadura
	
	/** 
	 *  METROETAN sartzen bada 		-->   Periodoa Segundutan
	 *  KILOMETROTAN sartzen bada 	-->   Periodoa Ordutan
	 */
	
	private double periodoOrbitala;
	
	private String kolaMota;			// Kometaren kolaren datuak
	
	private boolean kolaDauka;			// Kometak kola duen ala ez
	
	// ********************* KLASE ERAIKITZAILEAK ***********************
	
	/**
	 * Kometa berria sortzeko eraikitzailea parametroak erabiliz.
	 *
	 * @param izena 				--> astroaren izena
	 * @param masa 					--> astroaren masa(T)
	 * @param raGraduak 			--> astroaren koordenaturak gradutan º
	 * @param raMinutoak 			--> astroaren koordenatuak minututan
	 * @param deGraduak 			--> astroaren koordenaturak gradutan º
	 * @param deMinutoak 			--> astroaren koordenatuak minututan
	 * @param abiadura				--> kometaren abidarua orbita egiterakoan (km/h)
	 * @param periodoOrbitala 		--> Denbora buelta bat ematen eguzkiari, ordutan
	 * @param kolaMota 				--> kometaren kolaren informazioa
	 * @param kolaDauka				--> kometak kola duen ala ez (true/false)
	 */

	public Kometa (String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			double abiadura, double periodoOrbitala, String kolaMota, Boolean kolaDauka) {
		setIzena(izena);
		setMasa(masa);
		setRaGraduak(raGraduak);
		setRaMinutoak(raMinutoak);
		setDeGraduak(deGraduak);
		setDeMinutoak(deMinutoak);
		setAbiadura(abiadura);
		setPeriodoOrbitala(periodoOrbitala);
		setKolaMota(kolaMota);
		setKolaDauka(kolaDauka);
	}
	
	/**
	 * Kometa berria sortzeko eraikitzailea parametroak erabiliz.
	 *
	 * @param izena 				--> astroaren izena
	 * @param masa 					--> astroaren masa(T)
	 * @param raGraduak 			--> astroaren koordenaturak gradutan º
	 * @param raMinutoak 			--> astroaren koordenatuak minututan
	 * @param deGraduak 			--> astroaren koordenaturak gradutan º
	 * @param deMinutoak 			--> astroaren koordenatuak minututan
	 * @param abiadura				--> kometaren abidarua orbita egiterakoan (km/h)
	 * @param periodoOrbitala 		--> Denbora buelta bat ematen eguzkiari, ordutan
	 * @param kolaMota 				--> kometaren kolaren informazioa
	 * @param kolaDauka				--> kometak kola duen ala ez (true/false)
	 * @param iruzkina				--> komentario extrak sartzeko aukera
	 */

	public Kometa (String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			double abiadura, double periodoOrbitala, String kolaMota, Boolean kolaDauka, String iruzkina) {
		setIzena(izena);
		setMasa(masa);
		setRaGraduak(raGraduak);
		setRaMinutoak(raMinutoak);
		setDeGraduak(deGraduak);
		setDeMinutoak(deMinutoak);	
		setAbiadura(abiadura);
		setPeriodoOrbitala(periodoOrbitala);
		setKolaMota(kolaMota);
		setKolaDauka(kolaDauka);
		setIruzkina(iruzkina);
	}
	
	/**
	 *  Hutsik dagoen eraikitzailea.
	 */
	
	public Kometa() {
		izena				= "";
		masa 				= 0;
		raGraduak 			= new Koordenatuak(0);
		deGraduak 			= new Koordenatuak(0);
		raMinutoak 			= new Koordenatuak(0);
		deMinutoak 			= new Koordenatuak(0);
		abiadura			= 0;
		periodoOrbitala		= 0;
		kolaDauka			= false;
		kolaMota			= "";
	}
	
	// ************************METODOAK*********************************

	/**
	 * Sets the abiadura.
	 *
	 * @param abiadura the new abiadura
	 */
	public void setAbiadura(double abiadura) {
		this.abiadura = abiadura;
	}
	
	/**
	 * Gets the abiadura.
	 *
	 * @return the abiadura
	 */
	public double getAbiadura() {
		return abiadura;
	}
	
	/**
	 * Sets the periodo orbitala.
	 *
	 * @param periodoOrbitala the new periodo orbitala
	 */
	public void setPeriodoOrbitala(double periodoOrbitala) {
		this.periodoOrbitala = periodoOrbitala;
	}
	
	/**
	 * Gets the periodo orbitala.
	 *
	 * @return the periodo orbitala
	 */
	public double getPeriodoOrbitala() {
		return periodoOrbitala;
	}
	
	/**
	 * Sets the kola mota.
	 *
	 * @param kolaren informazio berria (konposizioa, gasezkoa ala hautsezkoa etc)
	 */
	public void setKolaMota(String kolaMota) {
		this.kolaMota = kolaMota;
	}
	
	/**
	 * kolaren informazioa ezarri
	 *
	 * @return kolaren informazioa (konposizioa, gasezkoa ala hautsezkoa etc)
	 */
	public String getKolaMota() {
		return kolaMota;
	}
	
	/**
	 * kola duen ala ez ezarri
	 *
	 * @param true: BAI false: EZ
	 */
	public void setKolaDauka(boolean kolaDauka) {
		this.kolaDauka = kolaDauka;
	}
	
	/**
	 * kola duen ala ez
	 *
	 * @return true: BAI false: EZ
	 */
	public boolean getKolaDauka() {
		return kolaDauka;
	}
	
	/**
	 * Kola sortu.
	 *
	 * @param kola mota (konposizioa, gasezkoa ala hautsezkoa etc)
	 */
	public void kolaSortu(String kolaMota) {
		setKolaMota(kolaMota);
		setKolaDauka(true);
	}
	
	/**
	 * Ausazko kola sortu.
	 */
	public void ausazkoKolaSortu() {
		setKolaMota(ausazkoKola());
		setKolaDauka(true);
	}
	
	/**
	 * Ausazko kola mota bat sortzeko metodoa, simulazioak egiteko.
	 *
	 * @return kola mota.
	 */
	private String ausazkoKola() {
		Random random = new Random();
        int ausazkoa = random.nextInt(3);

        switch (ausazkoa) {
            case 0:
                return "Hautsa";
            case 1:
                return "Gasa";
            default:
                return "Konbinatua";
        }
	}
	
	/**
	 *  PERIODO ORBITALA. Kalkulatzeko formula bat erabiltzen da. Formula honek zenbat denbora
	 *  kostatzen zaio kometari eguzkiari buelta bat emateko kalkulatzen du. Horretarako, distantziaren
	 *  formatuaren arabera, denbora unitate bat edo beste emango du emaitzan.
	 *
	 * @param distanziaEguzkia (KILOMETROAK)
	 * @return periodoa, ordutan, zenbat denbora
	 */
	
	public double periodoOrbitalaKalkulatu (double distanziaEguzkia) {
		//Konstanteak
		final double G 			= 6.67430e-11; // Konstante grabitazionala
		final double M_Eguzkia 	= 1.989e30;	   // Eguzkiaren masa (kg)
		
		// Keplerren legea erabiliz periodo orbitala kalkulatu
		periodoOrbitala = Math.sqrt(4 * Math.PI * Math.PI * Math.pow(distanziaEguzkia, 3)) / (G * M_Eguzkia);
		
		return periodoOrbitala;
	}
}
