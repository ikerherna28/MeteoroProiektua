package Astroak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Kometa.
 */
public class Kometa extends Astroa {
	
	// ATRIBUTOAK

	/** The abiadura. */
	private double abiadura;			// Kometaren abiadura
	
	/**    METROETAN sartzen bada 		-->   Periodoa Segundutan  KILOMETROTAN sartzen bada 	-->   Periodoa Ordutan. */
	
	private double periodoOrbitala;
	
	/** The kola mota. */
	private String kolaMota;			// Kometaren kolaren datuak
	
	/** The kola dauka. */
	private boolean kolaDauka = false;			// Kometak kola duen ala ez
	
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
	 * @param abiadura 			--> kometaren abidarua orbita egiterakoan (km/h)
	 * @param kolaMota 				--> kometaren kolaren informazioa
	 * @param kolaDauka 			--> kometak kola duen ala ez (true/false)
	 */

	public Kometa (String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			double abiadura, String kolaMota, Boolean kolaDauka) {
		setIzena(izena);
		setMasa(masa);
		setRaGraduak(raGraduak);
		setRaMinutoak(raMinutoak);
		setDeGraduak(deGraduak);
		setDeMinutoak(deMinutoak);
		setAbiadura(abiadura);
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
	 * @param abiadura 			--> kometaren abidarua orbita egiterakoan (km/h)
	 * @param kolaMota 				--> kometaren kolaren informazioa
	 * @param kolaDauka 			--> kometak kola duen ala ez (true/false)
	 * @param iruzkina 			--> komentario extrak sartzeko aukera
	 */

	public Kometa (String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			double abiadura, String kolaMota, Boolean kolaDauka, String iruzkina) {
		setIzena(izena);
		setMasa(masa);
		setRaGraduak(raGraduak);
		setRaMinutoak(raMinutoak);
		setDeGraduak(deGraduak);
		setDeMinutoak(deMinutoak);	
		setAbiadura(abiadura);
		setKolaMota(kolaMota);
		setKolaDauka(kolaDauka);
		setIruzkina(iruzkina);
	}
	
	/**
	 *  Hutsik dagoen eraikitzailea.
	 */
	
	public Kometa() {
		aldagaiakEskatuKometa();
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
	 * @param kolaMota the new kola mota
	 */
	public void setKolaMota(String kolaMota) {
		this.kolaMota = kolaMota;
	}
	
	/**
	 * kolaren informazioa ezarri.
	 *
	 * @return kolaren informazioa (konposizioa, gasezkoa ala hautsezkoa etc)
	 */
	public String getKolaMota() {
		return kolaMota;
	}
	
	/**
	 * kola duen ala ez ezarri.
	 *
	 * @param kolaDauka the new kola dauka
	 */
	public void setKolaDauka(boolean kolaDauka) {
		this.kolaDauka = kolaDauka;
	}
	
	/**
	 * kola duen ala ez.
	 *
	 * @return true: BAI false: EZ
	 */
	public boolean getKolaDauka() {
		return kolaDauka;
	}
	
	/**
	 * Kola sortu.
	 *
	 * @param kolaMota the kola mota
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
	 * Kometaren menu printzipala ikusi.
	 *
	 * @return menu
	 */	
	public static String menuKometa() {
		
		String menu = "\n________________________________\n";
		menu+="\nKOMETEN KUDEAKETA\n\n";
		menu+="1. Kometa berria gehitu\n";
		menu+="2. Kometa bat ezabatu\n";
		menu+="3. Kometak datuaren arabera listatu\n";
		menu+="4. Kometa eguneratu\n";
		menu+="5. Kometaren kola gestionatu\n";
		menu+="6. Periodo orbitala kalkulatu\n";
		menu+="7. Astroen menura itzuli\n";
		menu+="________________________________\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Datu motak erakusteko menua.
	 *
	 * @return menu
	 */
	public static String datuMotaMenuKometa() {
		
		String menu = "\nDATU AUKERAKETA\n";
		menu+="1. Abiaduraren arabera\n";
		menu+="2. Kolaren arabera\n";
		menu+="3. Periodo orbitalaren arabera\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Kola menu kometa.
	 *
	 * @return the string
	 */
	public static String kolaMenuKometa() {
		
		String menu = "\nZer nahi da egin?\n";
		menu+="1. Kometak kola duen konprobatu\n";
		menu+="2. Kola berria gehitu\n";
		menu+="3. Ausazko kola bat ezarri\n";
		menu+="3. Bueltatu\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Kometen zerrenda bistaratzeko metodoa.
	 *
	 * @param kometak the kometak
	 */
	public static void kometaZerrenda(ArrayList<Kometa> kometak) {
		StringBuilder mezua = new StringBuilder();
		mezua.append("Sartutako kometen zerrenda:\n");
		for (int i = 0; i < kometak.size(); i++) {
			Kometa kometa = kometak.get(i);
			mezua.append(i).append(". Izena: ").append(kometa.getIzena()).append("\n");
		}
		System.out.println(mezua.toString());
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
		
		return orduakToUrteak(periodoOrbitala);
	}
	
	/**
	 * Orduak to urteak.
	 *
	 * @param orduak the orduak
	 * @return the double
	 */
	private double orduakToUrteak (double orduak) {
		return orduak / 8760 ;
	}
	
	/**
	 * Erabiltzaileari kometaren aldagaiak eskatu.
	 *
	 * @return kometa berri bat datu guztiekin
	 */
	public Kometa aldagaiakEskatuKometa() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean aukeraDa = false;
		
		// Kometaren izena sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.println("Sartu kometaren izena:");
			this.izena = scanner.nextLine();
			if (this.izena != null && !this.izena.trim().isEmpty()) {
				aukeraDa = true;
			} else {
				System.out.println("Mesedez, sartu izen bat.");
			}
		}
		
		aukeraDa = false; 
		
		// Kometaren masa sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.print("Kometaren masa sartu (toneladetan): ");
			String input = scanner.nextLine();
			try {
				this.masa = Integer.parseInt(input);

				if (this.masa > 0) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}
		
		// Zeruko posizoa ezartzeko errore kontrola
		System.out.println("Sartu zeruko posizioa. RA/DE erabiliko da.");

		raGraduak 	= koordenatuaIrakurriGraduak("RA1 sartu (Graduak):");
		raMinutoak 	= koordenatuaIrakurriMinutoak("RA2 sartu (Minutuak, 3600 baino gutxiago):");
		deGraduak 	= koordenatuaIrakurriGraduak("DE1 sartu (Graduak):");
		deMinutoak 	= koordenatuaIrakurriMinutoak("DE2 sartu (Minutuak, 3600 baino gutxiago):");
		
		aukeraDa = false;
		
		// Kometaren abiadura sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.print("Kometaren abiadura sartu (km/h): ");
			String input = scanner.nextLine();
			try {
				this.abiadura = Integer.parseInt(input);

				if (this.abiadura > 0) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}
		
		// Kometak kola duen ala ez ikusteko
		try {
            System.out.print("Sartutako kometak kola dauka (Bai/Ez): ");
            String erantzuna = scanner.nextLine();

            // Karaktere guztiak minuskula bihurtu
            erantzuna = erantzuna.toLowerCase();

            kolaDauka = erantzuna.equals("bai");

            if (kolaDauka) {
                System.out.println("Kometak kola du");
            } else {
                System.out.println("Ez duzu sartu kolarik");
            }
        } catch (Exception e) {
            System.err.println("Errorea: " + e.getMessage());
        }
		
		aukeraDa = false;
		
		// Kometak kola badu, kolaren mota eskatu
		if (kolaDauka) {			
			while (!aukeraDa) {
				System.out.println("Sartu kometaren kola mota:");
				this.kolaMota = scanner.nextLine();
				if (this.kolaMota != null && !this.izena.trim().isEmpty()) {
					aukeraDa = true;
				} else {
					System.out.println("Mesedez, sartu izen bat.");
				}
			}			
		}

		// Iruzkin bat sartzeko aukera
		System.out.print("Iruzkin bat edo beste daturen bat sartu nahi duzu? (BAI/EZ): ");
		String emaitza = scanner.nextLine();

		// Aukera bat edo beste erabiltzeko.
		if ("BAI".equalsIgnoreCase(emaitza)) {
			System.out.print("Hemen idatzi: ");
			this.iruzkina = scanner.nextLine();
			System.out.println("Zure iruzkina: '" + this.iruzkina + "' gorde egin da.");

		} else if ("EZ".equalsIgnoreCase(emaitza)) {
			System.out.println("Ez duzu iruzkinik idatzi.");

			// Aldagaien balioak kometa berrian sartu, iruzkinarik gabe
			Kometa kometa = new Kometa(izena, masa, raGraduak, raGraduak, deGraduak, deMinutoak, abiadura, kolaMota, kolaDauka);
			return kometa;

		} else {
			System.out.println("Hautatu duzun erantzunak ez da baliogarria. Programa amaituko da.");
			return null;  
		}

		// Aldagaien balioak kometa berrian sartu, iruzkinarekin
		Kometa kometa = new Kometa(izena, masa, raGraduak, raGraduak, deGraduak, deMinutoak, abiadura, kolaMota, kolaDauka, iruzkina);
		return kometa;
	}
	
	/**
	 * Kometa ezabatu.
	 *
	 * @param kometak the kometak
	 * @return the array list
	 */
	public static ArrayList<Kometa> kometaEzabatu(ArrayList<Kometa> kometak) {
		boolean aukeraDa = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!aukeraDa) {
			System.out.print("Sartu ezabatu nahi duzun asteroidearen zenbakia. Ateratzeko, zenbaki negatibo bat sartu: ");
			StringBuilder mezua = new StringBuilder();

			try {
				int indizea = Integer.parseInt(scanner.nextLine());

				if (indizea >= 0 && indizea < kometak.size()) {
					Astroa borratu = (Astroa) kometak.remove(indizea);
					mezua.append("Asteroide: ").append(borratu.getIzena()).append(" ezabatuta");
					System.out.println(mezua);
					aukeraDa = true;
				} else if (indizea < 0) {
					break;
				} else {
					System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu, mesedez.");
			}
		}
		return kometak;		
	}
	
	/**
	 * Kometa eguneratu.
	 *
	 * @param aukera the aukera
	 * @param kometak the kometak
	 */
	public static void kometaEguneratu(int aukera, ArrayList<Kometa> kometak) {
		Kometa kometaBerria = new Kometa();
		Kometa kometa = kometak.get(aukera);

		StringBuilder mezua = new StringBuilder();

		String azkenekoIzena = kometa.getIzena();

		// Sortutako kometaren berriko datuak eskatutako kometaren sartu, datuak eguneratzeko
		kometa.setIzena(kometaBerria.getIzena());
		kometa.setMasa(kometaBerria.getMasa());
		kometa.setRaGraduak(kometaBerria.getRaGraduak());
		kometa.setRaMinutoak(kometaBerria.getRaMinutoak());
		kometa.setDeGraduak(kometaBerria.getRaMinutoak());
		kometa.setDeMinutoak(kometaBerria.getDeMinutoak());
		kometa.setAbiadura(kometaBerria.getAbiadura());
		kometa.setKolaDauka(kometaBerria.getKolaDauka());
		kometa.setKolaMota(kometaBerria.getKolaMota());


		mezua.append("Kometa: ").append(azkenekoIzena).append(" eguneratuta,").append(" horain: ").append(kometaBerria.getIzena());
		System.out.println(mezua);
	}
	
	/**
	 * Kometaren atributo bereziak konparatzeko funtzioa.
	 *
	 * @param aukera 		--> nahi den datu motaren aukera
	 * @param kometak 		--> kometen zerrenda
	 */
	public static void datuakKonparatu(int aukera, ArrayList<Kometa> kometak) {
		Comparator<Kometa> comparator = null;
		switch (aukera) {
		case 1:
			comparator = Comparator.comparing(Kometa::getAbiadura);
			break;
		case 2:
			comparator = Comparator.comparing(Kometa::getKolaMota);
			break;
		case 3:
			comparator = Comparator.comparing(Kometa::getPeriodoOrbitala);
			break;
		default:
			System.out.println("Aukera ez da egokia.");
			break;
		}
		Collections.sort(kometak, comparator);
		// Emaitza bistaratu
		StringBuilder mezua = new StringBuilder();
		mezua.append("Kometen zerrenda aukeratutako kriterioarekin zerrendatuta:\n");

		// Meteoroen zerrenda atera, datu motaren arabera
		for (int i = 0; i < kometak.size(); i++) {
			Kometa kometaOrdenatua = kometak.get(i);

			mezua.append("\n" + (i + 1)).append(". - Izena: ").append(kometaOrdenatua.getIzena()).append("\n");
			mezua.append("Abiadura: " + kometaOrdenatua.getAbiadura()).append("\n");
			mezua.append("Kola: " + kometaOrdenatua.getKolaMota() + ("\n"));
			mezua.append("Periodo orbitala: " + kometaOrdenatua.getPeriodoOrbitala() + ("\n"));

		}
		System.out.println(mezua);
	}
}
