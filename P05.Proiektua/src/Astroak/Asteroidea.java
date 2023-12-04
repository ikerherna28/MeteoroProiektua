package Astroak;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Asteroidea.
 */
public class Asteroidea extends Astroa{
	
	// ATRIBUTOAK
	
	/** The diametroa. */
	private double diametroa;			// Asteroidearen diametroa, kilometroetan	
	
	/** The distantzia zentroa. */
	private double distantziaZentroa;	// Orbita zentroa dagoen distantzia, kilometroetan	

	/** The abiadura angeluarra. */
	private double abiaduraAngeluarra;	// Abiadura, km/h	
	
	/** The angelua. */
	private double angelua;				// Gradutan º
	
	/** The x. */
	private double x;					// orbitaren x koordenatua
	
	/** The y. */
	private double y;					// orbitaren y koordenatua
	
	// ********************* KLASE ERAIKITZAILEAK ***********************

	/**
	 * Asteroide berria sortzeko eraikitzailea parametroak erabiliz.
	 *
	 * @param izena 				--> astroaren izena
	 * @param masa 					--> astroaren masa(T)
	 * @param raGraduak 			--> astroaren koordenaturak gradutan º
	 * @param raMinutoak 			--> astroaren koordenatuak minututan
	 * @param deGraduak 			--> astroaren koordenaturak gradutan º
	 * @param deMinutoak 			--> astroaren koordenatuak minututan
	 * @param diametroa				--> asteroidearen diametroa kilometrotan (km)
	 * @param distantziaZentroa 	--> Zentroarekiko distantzia, eguzkia, kilometrotan (km)
	 * @param abiaduraAngeluarra 	--> angeluarekiko abiadura. (km/h)
	 * @param angelua				--> angelua, gradutan º
	 */
	
	public Asteroidea(String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			   double diametroa, double distantziaZentroa, double abiaduraAngeluarra, double angelua) {
		setIzena(izena);
		setMasa(masa);
		setRaGraduak(raGraduak);
		setRaMinutoak(raMinutoak);
		setDeGraduak(deGraduak);
		setDeMinutoak(deMinutoak);
		setAbiaduraAngeluarra(abiaduraAngeluarra);
		setDistantziaZentroa(distantziaZentroa);
		setAngelua(angelua);
		setDiametroa(diametroa);

	}
	
	/**
	 * Asteroide berria sortzeko eraikitzailea parametroak erabiliz eta iruzkinak gehituz.
	 *
	 * @param izena 				--> astroaren izena
	 * @param masa 					--> astroaren masa(T)
	 * @param raGraduak 			--> astroaren koordenaturak gradutan º
	 * @param raMinutoak 			--> astroaren koordenatuak minututan
	 * @param deGraduak 			--> astroaren koordenaturak gradutan º
	 * @param deMinutoak 			--> astroaren koordenatuak minututan
	 * @param diametroa				--> asteroidearen diametroa kilometrotan (km)
	 * @param distantziaZentroa 	--> Zentroarekiko distantzia, eguzkia, kilometrotan (km)
	 * @param abiaduraAngeluarra 	--> angeluarekiko abiadura. (km/h)
	 * @param angelua				--> angelua, gradutan º
	 * @param iruzkina				--> komentario extrak sartzeko aukera
	 */

	public Asteroidea(String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			   double diametroa, double distantziaZentroa, double abiaduraAngeluarra, double angelua, String iruzkina) {
		setIzena(izena);
		setMasa(masa);
		setRaGraduak(raGraduak);
		setRaMinutoak(raMinutoak);
		setDeGraduak(deGraduak);
		setDeMinutoak(deMinutoak);
		setAbiaduraAngeluarra(abiaduraAngeluarra);
		setDistantziaZentroa(distantziaZentroa);
		setAngelua(angelua);
		setDiametroa(diametroa);
		setIruzkina(iruzkina);
	}
	
	/**
	 *  Aldagaiaen arabera asteroidea sortzeko eraikitzailea.
	 */
	
	public Asteroidea() {
		aldagaiakEskatuAsteroide();		
	}
	
	// ************************METODOAK*********************************
	
	/**
	 * Sets the distantzia zentroa.
	 *
	 * @param distantziaZentroa the new distantzia zentroa
	 */
	public void setDistantziaZentroa(double distantziaZentroa) {
		this.distantziaZentroa = distantziaZentroa;
	}
	
	/**
	 * Gets the distantzia zentroa.
	 *
	 * @return the distantzia zentroa
	 */
	public double getDistantziaZentroa() {
		return distantziaZentroa;
	}
	
	/**
	 * Sets the abiadura angeluarra.
	 *
	 * @param abiaduraAngeluarra the new abiadura angeluarra
	 */
	public void setAbiaduraAngeluarra(double abiaduraAngeluarra) {
		this.abiaduraAngeluarra = abiaduraAngeluarra;
	}
	
	/**
	 * Gets the abiadura angeluarra.
	 *
	 * @return the abiadura angeluarra
	 */
	public double getAbiaduraAngeluarra() {
		return abiaduraAngeluarra;
	}
	
	/**
	 * Sets the angelua.
	 *
	 * @param angelua the new angelua
	 */
	public void setAngelua(double angelua) {
		this.angelua = angelua;
	}
	
	/**
	 * Gets the angelua.
	 *
	 * @return the angelua
	 */
	public double getAngelua() {
		return angelua;
	}
	
	/**
	 * diametroa ezarri.
	 *
	 * @param diametroa (km)
	 */
	public void setDiametroa(double diametroa) {
		this.diametroa = diametroa;
	}
	
	/**
	 * diametroa lortu.
	 *
	 * @return diametroa (km)
	 */
	public double getDiametroa() {
		return diametroa;
	}
	
	/**
	 * Asteroidearen posizioa ezartzen du orbitarekiko.
	 *
	 * @param x koordenatua kilometroetan
	 * @param y koordenatua kilometroetan
	 */

	public void setPosizioa (double x, double y) {
		this.x = x;
		this.y = y;		
	}
	
	/**
	 * x posizioa lortu.
	 *
	 * @return x posizioa (km)
	 */
	public double getX() {
		return x;
	}

	/**
	 * y posizioa lortu.
	 *
	 * @return y posizioa (km)
	 */
	public double getY() {
		return y;
	}

	/**
	 * Orbitaren posizio absolutoa lortu.
	 *
	 * @return orbitaren posizioaren kalkuloa, kilometroetan (km)
	 */
	public double[] getPosizioa() {
		return new double[]{x, y};
	}
	
	/**
	 * Orbitaren posizioa kalkulatzeko. Abiadura angeluarra km/h-tan dagoenez,
	 * denbora minututan kalkulatu behar da.
	 *
	 * @param denbora urteetan
	 */
	public void orbita (double denbora) {
		
		this.angelua += this.abiaduraAngeluarra * UrteakToMinutu(denbora);
		this.x = distantziaZentroa * Math.cos(angelua);
		this.y = distantziaZentroa * Math.sin(angelua);
		
		setPosizioa(x, y);
	}
	
	/**
	 * Orduak to minutu.
	 *
	 * @param urteak --> orbita egiteko behar diren urteak
	 * @return minutoak
	 */
	private double UrteakToMinutu (double urteak) {
		return urteak * 365 * 24;
	}
	
	/**
	 * Orbita eguneratu.
	 *
	 * @param denboraGehitu urteetan, orbita eguneratzeko denbora
	 */
	public void orbitaEguneratu (double denboraGehitu) {
		orbita(denboraGehitu);
	}
	
	/**
	 * bi asteroideen arteko distantzia kalkulatzeko.
	 *
	 * @param besteAsteroidea the beste asteroidea
	 * @return distantziaren kalkulo absolutu bat.
	 */
	
	private double distantziaKalkulatu (Asteroidea besteAsteroidea) {
		double deltaX = getX() - besteAsteroidea.getX();
		double deltaY = getY() - besteAsteroidea.getY();
		
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
				
	}
	
	/**
	 * bi asteroideen arteko gerturapena detektatzeko.
	 *
	 * @param besteAsteroide the beste asteroide
	 * @param distantziaLimitea the distantzia limitea
	 * @return true / false, distantzia txikiagoa bada distantzia limitea baino.
	 */
	
	public boolean gerturapenaIkusi(Asteroidea besteAsteroide, double distantziaLimitea) {
        double distantzia = distantziaKalkulatu(besteAsteroide);

        return distantzia < distantziaLimitea;
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
	 * Erabiltzaileari asteroidearen aldagaiak eskatzeko metodoa.
	 *
	 * @return asteroide berriaren datuak
	 */
	
	public Asteroidea aldagaiakEskatuAsteroide() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean aukeraDa = false;
		
		// Asteroidearen izena sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.println("Sartu asteroidearen izena:");
			this.izena = scanner.nextLine();
			if (this.izena != null && !this.izena.trim().isEmpty()) {
				aukeraDa = true;
			} else {
				System.out.println("Mesedez, sartu izen bat.");
			}
		}
		
		aukeraDa = false;
		
		// Asteroidearen masa sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.print("Asteroidearen masa sartu (toneladetan): ");
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
		
		// Asteroidearen diametroa sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.print("Asteroidearen diametroa sartu (kilometroetan): ");
			String input = scanner.nextLine();
			try {
				this.diametroa = Integer.parseInt(input);

				if (this.diametroa > 0) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}
		
		aukeraDa = false;
		
		// Asteroidearen distantzia eguztikik errore kontrola
		while (!aukeraDa) {
			System.out.print("Eguzkitik distantzia maximoa sartu (kilometroetan): ");
			String input = scanner.nextLine();
			try {
				this.distantziaZentroa = Integer.parseInt(input);

				if (this.distantziaZentroa > 0) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}
		
		aukeraDa = false;
		
		// Asteroidearen abiadura angeluarra sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.print("Asteroidearen abiadura angeluarra sartu: ");
			String input = scanner.nextLine();
			try {
				this.abiaduraAngeluarra = Integer.parseInt(input);

				if (this.abiaduraAngeluarra > 0) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}
		
		aukeraDa = false;
		
		// Asteroidearen angelua orbitarekiko sartzeko errore kontrola
		while (!aukeraDa) {
			System.out.print("Asteroidearen orbitateriko angelua sartu: (360º): ");
			String input = scanner.nextLine();
			try {
				this.angelua = Integer.parseInt(input);

				if (this.angelua > 0 && angelua <= 360) {
					aukeraDa = true;
				} else {
					System.out.println("Sartu duzun zenbakia negatiboa da edo 360º baino handiagoa da");
				}
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki bat sartu behar da.");
			}
		}

		System.out.print("Iruzkin bat edo beste daturen bat sartu nahi duzu? (BAI/EZ): ");
		String emaitza = scanner.nextLine();

		// Aukera bat edo beste erabiltzeko.
		if ("BAI".equalsIgnoreCase(emaitza)) {
			System.out.print("Hemen idatzi: ");
			this.iruzkina = scanner.nextLine();
			System.out.println("Zure iruzkina: '" + this.iruzkina + "' gorde egin da.");

		} else if ("EZ".equalsIgnoreCase(emaitza)) {
			System.out.println("Ez duzu iruzkinik idatzi.");

			// Aldagaien balioak asteroide berrian sartu, iruzkinarik gabe
			Asteroidea asteroide = new Asteroidea(izena, masa, raGraduak, raGraduak, deGraduak, deMinutoak, diametroa, distantziaZentroa, abiaduraAngeluarra, angelua);
			return asteroide;

		} else {
			System.out.println("Hautatu duzun erantzunak ez da baliogarria. Programa amaituko da.");
			return null;  
		}

		// Aldagaien balioak asteroide berrian sartu, iruzkinarekin
		Asteroidea asteroide = new Asteroidea(izena, masa, raGraduak, raGraduak, deGraduak, deMinutoak, diametroa, distantziaZentroa, abiaduraAngeluarra, angelua, iruzkina);
		return asteroide;
	}
	
	
	/**
	 * Asteroidearen menu printzipala ikusi.
	 *
	 * @return menu
	 */
	public static String menuAsteroide() {
		
		String menu = "\n________________________________\n";
		menu+="\nASTEROIDEAREN KUDEAKETA\n\n";
		menu+="1. Asteroide berria gehitu\n";
		menu+="2. Asteroide bat ezabatu\n";
		menu+="3. Asteroideak datuaren arabera listatu\n";
		menu+="4. Asteroide bat eguneratu\n";
		menu+="5. Asteroidearen orbita jarri\n";
		menu+="6. Astroen menura itzuli\n";
		menu+="________________________________\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Datu motak erakusteko menua.
	 *
	 * @return menu
	 */
	public static String datuMotaMenuAsteroide() {
		
		String menu = "\nDATU AUKERAKETA\n";
		menu+="1. Diametroaren arabera\n";
		menu+="2. Abiaduraren arabera\n";
		menu+="3. Distantziaren arabera\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Orbita menu.
	 *
	 * @return the string
	 */
	public static String orbitaMenu() {
		
		String menu = "\nASTEROIDEEN ORBITAK\n";
		menu+="1. Asteroideak orbitan jarri\n";
		menu+="2. Orbitak ikusi\n";
		menu+="3. Asteroideak gertu dauden ikusi\n";
		menu+="4. Orbita eguneratu\n";
		menu+="5. Bueltatu\n";
		menu+="\nAukeratu bat:\n";
		
		return menu;
	}
	
	/**
	 * Asteroideen zerrenda bistaratzeko metodoa.
	 *
	 * @param asteroideak --> asteroideen arraylist motako zerrenda
	 */
	public static void asteroideZerrenda(ArrayList<Asteroidea> asteroideak) {
		StringBuilder mezua = new StringBuilder();
		mezua.append("Sartutako asteroideen zerrenda:\n");
		for (int i = 0; i < asteroideak.size(); i++) {
			Asteroidea asteroide = asteroideak.get(i);
			mezua.append(i).append(". Izena: ").append(asteroide.getIzena()).append("\n");
		}
		System.out.println(mezua.toString());
	}
	
	/**
	 * Asteroideen zerrendatik, zerrendaren posizioaren arabera, asteroide bat ezabatu.
	 *
	 * @param asteroideak  --> asteroideen arraylist motako zerrenda
	 * @return asteroideak --> zerrenda berria baino aukeratutako asteroidea ezabatyta
	 */
	public static ArrayList<Asteroidea> asteroideEzabatu(ArrayList<Asteroidea> asteroideak) {
		boolean aukeraDa = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!aukeraDa) {
			System.out.print("Sartu ezabatu nahi duzun asteroidearen zenbakia. Ateratzeko, zenbaki negatibo bat sartu: ");
			StringBuilder mezua = new StringBuilder();

			try {
				int indizea = Integer.parseInt(scanner.nextLine());

				if (indizea >= 0 && indizea < asteroideak.size()) {
					Astroa borratu = (Astroa) asteroideak.remove(indizea);
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
		return asteroideak;		
	}
	
	/**
	 * Asteroidearen atributo bereziak konparatzeko funtzioa.
	 *
	 * @param aukera 		--> nahi den datu motaren aukera
	 * @param asteroideak 	--> asteroideen zerrenda
	 * @return comparator	--> datu motaren aukeraketa
	 */
	public static void datuakKonparatu(int aukera, ArrayList<Asteroidea> asteroideak) {
		Comparator<Asteroidea> comparator = null;
		switch (aukera) {
		case 1:
			comparator = Comparator.comparing(Asteroidea::getDiametroa);
			break;
		case 2:
			comparator = Comparator.comparing(Asteroidea::getAbiaduraAngeluarra);
			break;
		case 3:
			comparator = Comparator.comparing(Asteroidea::getDistantziaZentroa);
			break;
		default:
			System.out.println("Aukera ez da egokia.");
			break;
		}
		Collections.sort(asteroideak, comparator);
		// Emaitza bistaratu
		StringBuilder mezua = new StringBuilder();
		mezua.append("Asteroideen zerrenda aukeratutako kriterioarekin zerrendatuta:\n");

		// Meteoroen zerrenda atera, datu motaren arabera
		for (int i = 0; i < asteroideak.size(); i++) {
			Asteroidea asteroideOrdenatua = asteroideak.get(i);

			mezua.append("\n" + (i + 1)).append(". - Izena: ").append(asteroideOrdenatua.getIzena()).append("\n");
			mezua.append("Diametroa: " + asteroideOrdenatua.getDiametroa()).append("\n");
			mezua.append("Abiadura angeluarra: " + asteroideOrdenatua.getAbiaduraAngeluarra() + ("\n"));
			mezua.append("Distantzia zentrora: " + asteroideOrdenatua.getDistantziaZentroa() + ("\n"));

		}
		System.out.println(mezua);
	}
	
	/**
	 * Asteroidea eguneratzeko blokea, aldagai berriak eskatuz.
	 *
	 * @param aukera the aukera
	 * @param asteroideak the asteroideak
	 */
	public static void asteroideaEguneratu(int aukera, ArrayList<Asteroidea> asteroideak) {
		Asteroidea asteroideBerria = new Asteroidea();
		Asteroidea asteroide = asteroideak.get(aukera);

		StringBuilder mezua = new StringBuilder();

		String azkenekoIzena = asteroide.getIzena();

		// Sortutako meteoro berriko datuak eskatutako meteoroan sartu, datuak eguneratzeko
		asteroide.setIzena(asteroideBerria.getIzena());
		asteroide.setMasa(asteroideBerria.getMasa());
		asteroide.setRaGraduak(asteroideBerria.getRaGraduak());
		asteroide.setRaMinutoak(asteroideBerria.getRaMinutoak());
		asteroide.setDeGraduak(asteroideBerria.getRaMinutoak());
		asteroide.setDeMinutoak(asteroideBerria.getDeMinutoak());
		asteroide.setDiametroa(asteroideBerria.getDiametroa());
		asteroide.setAbiaduraAngeluarra(asteroideBerria.getAbiaduraAngeluarra());
		asteroide.setDistantziaZentroa(asteroideBerria.getDistantziaZentroa());
		asteroide.setAngelua(asteroideBerria.getAngelua());
		asteroide.setIruzkina(asteroideBerria.getIruzkina());

		mezua.append("Asteroide: ").append(azkenekoIzena).append(" eguneratuta,").append(" horain: ").append(asteroideBerria.getIzena());
		System.out.println(mezua);
	}
}
	
