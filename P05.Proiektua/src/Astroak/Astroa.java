package Astroak;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Meteorito.
 */
public class Astroa implements intAstro {


	// Atributuoak definitu
	protected String izena;
	
	/** Masa kilogramotan. */
	protected double masa;
	
	//Zeruko posizioa ateratzeko aldagaiak (gradutan eta minututan)
	/** RA Gradutan. */
	protected Koordenatuak raGraduak;
    
    /** RA Minututan. */
	protected Koordenatuak raMinutoak;
    
    /** DE Gradutan. */
	protected Koordenatuak deGraduak;
    
    /** DE Minututan */
	protected Koordenatuak deMinutoak;
    
    /** The de minutoak. */
	protected String iruzkina;
	
	/**
	 * Izena lortu.
	 *
	 * @return the izena
	 */
	// Metodoak
	public String getIzena() {
		return izena;
	}
	
	/**
	 * Izena jarri.
	 *
	 * @param izena --> izen berria
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * Masa lortu.
	 *
	 * @return the masa
	 */
	public double getMasa() {
		return masa;
	}
	
	/**
	 * Masa ezarri.
	 *
	 * @param masaBerria --> masa berria
	 */
	public void setMasa(double masaBerria) {
		this.masa = masaBerria;
	}
	
	/**
	 * de graduak lortu
	 *
	 * @return the de graduak
	 */
	public Koordenatuak getDeGraduak() {
		return deGraduak;
	}
	
	/**
	 * de graduak ezarri
	 *
	 * @param deGraduak --> de gradu berria
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
	 * Datu motak erakusteko menua.
	 *
	 * @return menu
	 */
	public static String datuMotaMenu() {
		
		String menu = "\nDATU AUKERAKETA\n";
		menu+="1. Izenaren arabera\n";
		menu+="2. Masaren arabera\n";
		menu+="3. RA Koordenatuen arabera\n";
		menu+="3. DE Koordenatuen arabera\n";
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
	public static int aukeraKontrola(String menu, int aukera, Scanner scanner, int tarte1, int tarte2) {
		boolean aukeraDa = false;
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
	public static int zerrendaKontrola(String mezua, int aukera, Scanner scanner, int zerrendaLuzera) {
		boolean aukeraDa = false;
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
	
	/**
	 * Koordenatua irakurri graduako formatuan eta errore kontrola.
	 *
	 * @param mezua --> koordenatu motaren mezua
	 * @return koordenatu objektua
	 */
	public static Koordenatuak koordenatuaIrakurriGraduak(String mezua) {

		double graduak;
		boolean baliozkoa = false;
		Koordenatuak koordenatu = new Koordenatuak(0);
		Scanner scanner = new Scanner(System.in);

		try {
			while (!baliozkoa) {
				System.out.print(mezua);
				String sarrera = scanner.nextLine();

				try {
					graduak = Double.parseDouble(sarrera);
					koordenatu.setZenbakia(graduak);
					baliozkoa = true;
				} catch (NumberFormatException e) {
					System.out.println("Balio okerra. Mesedez, sartu zenbaki bat.");
				}
			}
		} finally {
			
		}
		return koordenatu;	
	}
	
	/**
	 * Koordenatua irakurri minututako formatuan eta errore kontrola.
	 *
	 * @param mezua --> koordenatu motaren mezua
	 * @return koordenatu objektua
	 */
	public static Koordenatuak koordenatuaIrakurriMinutoak(String mezua) {

		double minutoak = 0;
		boolean baliozkoa = false;
		Koordenatuak koordenatu = new Koordenatuak(0);
		Scanner scanner = new Scanner(System.in);

		try {
			while (!baliozkoa) {
				System.out.print(mezua);
				String sarrera = scanner.nextLine();

				try {
					minutoak = Double.parseDouble(sarrera);
					if (minutoak >= 0 && minutoak <= 3600) {
						koordenatu.setZenbakia(minutoak);
						baliozkoa = true;
					}	else if (minutoak < 0) {
						System.out.println("Zenbaki negatiboa, 24 orduko formatua erabili (0 < minutoak < 3600)");
					}
				} catch (NumberFormatException e) {
					System.out.println("Balio okerra. Mesedez, sartu zenbaki bat.");
				}
			}
		} finally {
			
		}		
		return koordenatu;		
	}
	
	/**
	 * Astroaren datu mota bat eskatu.
	 *
	 * @param mezua 			--> erabiltzaileak jakiteko ze datu sartu behar duen
	 * @param zenbakia			--> datu mota, denbora, distantzia... ahal du izan
	 * @param scanner			--> erabiltzaileari datua galdetzeko
	 * @return zenbakia			--> erabiltzaileak sartutako datua bueltatuko du
	 */
	public static double datuaEskatu(String mezua, double zenbakia, Scanner scanner) {
		
		boolean aukeraDa = false;
	
		while (!aukeraDa) {
			System.out.print(mezua);
			String sarrera = scanner.nextLine();
			try {
				zenbakia = Double.parseDouble(sarrera);
				if (zenbakia > 0) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}
		
		return zenbakia;
	}
	
	/**
	 * Astroen zerrenda bistaratzeko metodoa.
	 *
	 * @param kometak the kometak
	 */
	public static void astroZerrenda(ArrayList<Astroa> astroak) {
		StringBuilder mezua = new StringBuilder();
		mezua.append("Sartutako Astroen zerrenda:\n");
		for (int i = 0; i < astroak.size(); i++) {
			Astroa astro = astroak.get(i);
			mezua.append(i).append(". Izena: ").append(astro.getIzena()).append("\n");
		}
		System.out.println(mezua.toString());

	}
	
	/**
	 * Astroa ezabatu.
	 *
	 * @param Astroak --> Astro mota guztien zerrenda
	 * @return Astroak --> zerrenda berdina baina sartutako aukeraren astroa ezabaturik
	 */
	public static ArrayList<Astroa> astroaEzabatu(ArrayList<Astroa> Astroak) {
		boolean aukeraDa = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!aukeraDa) {
			System.out.print("Sartu ezabatu nahi duzun asteroidearen zenbakia. Ateratzeko, zenbaki negatibo bat sartu: ");
			StringBuilder mezua = new StringBuilder();

			try {
				int indizea = Integer.parseInt(scanner.nextLine());

				if (indizea >= 0 && indizea < Astroak.size()) {
					Astroa borratu = (Astroa) Astroak.remove(indizea);
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
		return Astroak;		
	}
	
	/**
	 * Astroaren atributoak konparatzeko funtzioa.
	 *
	 * @param aukera 		--> nahi den datu motaren aukera
	 * @param astroak 		--> astroen zerrenda
	 */
	public static void datuakKonparatuAstro(int aukera, ArrayList<Astroa> astroak) {
		Comparator<Astroa> comparator = null;
		switch (aukera) {
		case 1:
			comparator = Comparator.comparing(Astroa::getIzena);
			break;
		case 2:
			comparator = Comparator.comparing(Astroa::getMasa);
			break;
		case 3:
			comparator = Comparator.comparing((Astroa m) -> {
				Koordenatuak koordenatuak = m.getRaGraduak();
				return koordenatuak.getZenbakia();
			});
			break;
		case 4:
			comparator = Comparator.comparing((Astroa m) -> {
				Koordenatuak koordenatuak = m.getDeGraduak();
				return koordenatuak.getZenbakia();
			});
			break;
		default:
			System.out.println("Aukera ez da egokia.");
			break;
		}
		Collections.sort(astroak, comparator);
		// Emaitza bistaratu
		StringBuilder mezua = new StringBuilder();
		mezua.append("Kometen zerrenda aukeratutako kriterioarekin zerrendatuta:\n");

		// Meteoroen zerrenda atera, datu motaren arabera
		for (int i = 0; i < astroak.size(); i++) {
			Astroa astroOrdenatua = astroak.get(i);

			mezua.append("\n" + (i + 1)).append(". - Izena: ").append(astroOrdenatua.getIzena()).append("\n");
			mezua.append("Masa: " + astroOrdenatua.getMasa()).append("\n");
			mezua.append("RA1: " + astroOrdenatua.getRaGraduak().toStringGraduak() + ("\n"));
			mezua.append("RA2: " + astroOrdenatua.getRaMinutoak().toStringOrduak() + ("\n"));
			mezua.append("DE1: " + astroOrdenatua.getDeGraduak().toStringGraduak() + ("\n"));
			mezua.append("DE2: " + astroOrdenatua.getDeMinutoak().toStringOrduak() + ("\n"));

		}
		System.out.println(mezua);
	}
}