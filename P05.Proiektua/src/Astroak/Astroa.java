package Astroak;

import java.time.*;
import java.util.Scanner;

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
	
	/**
	 * Astroen menu printzipala.
	 *
	 * @return menu
	 */
	public static String menuAstro() {
		
		String menu = "\n_____________________________________________________\n";
		menu+="\nASTRO KUDEAKETA\n\n";
		menu+="1. Astro ezberdinen kudeaketa\n";
		menu+="2. Astro bat ezabatu\n";
		menu+="3. Astroak datuaren arabera listatu\n";
		menu+="4. Bukatu exekutatzen\n";
		menu+="\n____________________________________________________\n";
		menu+="\nAukeratu bat\n";
		
		return menu;
	}
	
	/**
	 * Astro mota aukeratzeko menua.
	 *
	 * @return menu
	 */
	public static String menuAstroAukeratu() {
		
		String menu ="\nAukeratu zein astro mota nahi duzun kudeatu\n\n";
		menu+="1. Asteroideak\n";
		menu+="2. Planetak\n";
		menu+="3. Kometak\n";
		menu+="4. Meteoroak\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Aukera kontrola erroreak ez egoteko.
	 *
	 * @param menu 		--> Aukeraketa ezberdinak ikusteko menua
	 * @param aukeraDa  --> true/false motakoa
	 * @param aukera 	--> erabiltzaileak egingo duen aukera irakurtzeko
	 * @param scanner 	--> erabiltzaileak datuak sartzeko
	 * @param tarte1 	--> aukeraketa menuaren tarte minimoa
	 * @param tarte2 	--> aukeraketa menuaren tarte maximoa
	 * @return aukera, erabiltzaileak egin duen aukera.
	 */
	public static int aukeraKontrola(String menu, boolean aukeraDa, int aukera, Scanner scanner, int tarte1, int tarte2) {
		while (!aukeraDa) {
			System.out.print(menu);
			String input = scanner.nextLine();

			try {
				aukera = Integer.parseInt(input);

				if (aukera >= tarte1 && aukera <= tarte2) {
					aukeraDa = true;
					return aukera;
				} else {
					System.out.println("Sartu duzun zenbakia ez da " + tarte1 + "-" + tarte2 + " tartekoa.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar duzu.");
			}
		}
		return aukera;
	}
	
	/**
	 * Zerrenda kontrola, zerrendako gauza bat aukeratu nahi denean kontrolatzeko.
	 *
	 * @param mezua 		 --> eskakizun ezberdinak jartzeko
	 * @param aukeraDa 		 --> true/false motakoa
	 * @param aukera		 --> Erabiltzaileak zerredatik hartu duen aukera
	 * @param scanner 		 --> zerrendako aukera irakurtzeko
	 * @param zerrendaLuzera --> zerrendaren luzeera errore kontrola egiteko
	 * @return aukera, erabiltzaileak egindako aukera
	 */
	public static int zerrendaKontrola(String mezua, boolean aukeraDa, int aukera, Scanner scanner, int zerrendaLuzera) {
		while (!aukeraDa) {
			System.out.print(mezua);
			String input = scanner.nextLine();

			try {
				aukera = Integer.parseInt(input);

				if (aukera >= 0 && aukera <= zerrendaLuzera) {
					aukeraDa = true;
					return aukera;
				} else {
					System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar duzu.");
			}
		}
		return aukera;
	
	}
}