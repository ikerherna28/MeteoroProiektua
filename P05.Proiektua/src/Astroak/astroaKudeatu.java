package Astroak;

import java.util.ArrayList;


import javax.swing.UIManager;

import java.awt.Color;
import java.lang.runtime.SwitchBootstraps;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * The Class meteoroKudeatu.
 */
public class astroaKudeatu {

	private static LocalDate dataAktibitate;

	/**
	 * Meteoro zerrenda bistaratu.
	 *
	 * @param meteoroak the meteoroak
	 */
	// Meteoritoak listatzeko funtzioa
	public static void meteoroZerrenda(ArrayList<Astroa> meteoroak) {
		StringBuilder mezua = new StringBuilder();
		mezua.append("Sartutako meteoritoen zerrenda:\n");
		for (int i = 0; i < meteoroak.size(); i++) {
			Astroa meteorito = meteoroak.get(i);
			mezua.append(i).append(". Izena: ").append(meteorito.getIzena()).append("\n");
		}
		System.out.println(mezua.toString());
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Aldagaiak
		int aukera 				= 0;
		int aukeraAstro			= 0;
		int aukeraAsteroide 	= 0;
		int aukeraKometa		= 0;
		int aukeraOrbita 		= 0;
		double denboraOrbita 	= 0;
		boolean bukatuDa 		= true;
		boolean bukatuAsteroide = false;
		boolean bukatuKometa 	= false;

		// Astroak gordetzeko zerrenda
		ArrayList<Astroa> AstroZerrenda = new ArrayList<Astroa>();

		// Astro ezberdinak gordetzeko zerrendak
		ArrayList<Asteroidea> 	AsteroideZerrenda 	= new ArrayList<Asteroidea>();
		ArrayList<Kometa> 		KometaZerrenda 		= new ArrayList<Kometa>();
		ArrayList<Planeta> 		PlanetaZerrenda 	= new ArrayList<Planeta>();
		ArrayList<Meteoroa> 	MeteoroZerrenda 	= new ArrayList<Meteoroa>();

		Koordenatuak K1 = new Koordenatuak(20);
		Koordenatuak K2 = new Koordenatuak(20);
		Koordenatuak K3 = new Koordenatuak(20);
		Koordenatuak K4 = new Koordenatuak(20);
		Koordenatuak K5 = new Koordenatuak(20);
		Koordenatuak K6 = new Koordenatuak(20);
		Koordenatuak K7 = new Koordenatuak(20);
		Koordenatuak K8 = new Koordenatuak(20);

		// Asteroide batzuk gehitu
		Asteroidea A1 = new Asteroidea("Bennu", 20000, K1, K2, K3, K4, 620, 9000000, 90, 240);
		Asteroidea A2 = new Asteroidea("Messi", 20000, K1, K2, K3, K4, 500, 920e2, 400.50, 2440);
		Asteroidea A3 = new Asteroidea("Kaixo", 20000, K1, K2, K3, K4, 622, 9050000, 90, 240);
		AstroZerrenda.add(A1);
		AstroZerrenda.add(A2);
		AstroZerrenda.add(A3);
		AsteroideZerrenda.add(A1);
		AsteroideZerrenda.add(A2);
		AsteroideZerrenda.add(A3);

		// MENUA HASIERATU
		while (bukatuDa == true) {

			// Astro ezberdinen kudeaketa egiteko blokea

			// Astro menuaren aukeraketa
			switch(Asteroidea.aukeraKontrola(Astroa.menuAstro(), aukera, scanner, 1, 4)) {

			case 1: {

				// Astro motaren aukeraketa
				switch (Astroa.aukeraKontrola(Astroa.menuAstroAukeratu(), aukeraAstro, scanner, 1, 4)) {

				// ASTEROIDEEN KUDEAKETA
				case 1: {

					while (bukatuAsteroide == false) {

						// Asteroide menuaren aukeraketa
						switch (Asteroidea.aukeraKontrola(Asteroidea.menuAsteroide(), aukeraAsteroide, scanner, 1, 6)) {

						// Asteroide berria zerrendara gehitzeko blokea
						case 1: {
							Asteroidea asteroide = new Asteroidea();
							AsteroideZerrenda.add(asteroide);
							AstroZerrenda.add(asteroide);
							System.out.println("ASTEROIDE BERRI BAT SARTU DA!");
							break;
						}

						// Asteroide bat ezabatzeko blokea
						case 2: {
							Asteroidea.asteroideZerrenda(AsteroideZerrenda);
							Asteroidea.asteroideEzabatu(AsteroideZerrenda);
							break;
						}

						// Asteroideak datuen arabera listatzeko blokea
						case 3: {

							int aukeraDatu = 0;

							// Asteroidearen datuen menua bistaratu eta aukeraren errore kontrola
							aukeraDatu = Astroa.aukeraKontrola(Asteroidea.datuMotaMenuAsteroide(), aukeraDatu, scanner, 1, 3);

							// Datuak konparatu funtzioari deituz, eta datu horren arabera ordenatu
							Asteroidea.datuakKonparatu(aukeraDatu, AsteroideZerrenda);
						}
						break;

						// Asteroideak eguneratzeko blokea
						case 4: {

							int aukeraEguneratu = 0;

							Asteroidea.asteroideZerrenda(AsteroideZerrenda);

							// Zerrenda aukeraketaren errore kontrola	

							// Aukeraren arabera, zerrendako asteroide bat hartu eta eguneratu egiten du aldagaiak berriz eskatuz
							Asteroidea.asteroideaEguneratu(Asteroidea.zerrendaKontrola("Sartu eguneratu nahi den asteroidearen zenbakia", aukeraEguneratu, scanner, AsteroideZerrenda.size()), AsteroideZerrenda);
						}

						// Asteroidea orbitan jartzeko blokea
						case 5: {
							boolean orbitaBoolean 	= false;
							ArrayList<Asteroidea> orbitanAsteroideak = new ArrayList<Asteroidea>();

							while (orbitaBoolean == false) {

								outerLoop:
									switch (Asteroidea.aukeraKontrola(Asteroidea.orbitaMenu(), aukeraOrbita, scanner, 1, 5)) {

									// Orbitaren posizioa ezartzeko blokea
									case 1: {

										Asteroidea.asteroideZerrenda(AsteroideZerrenda);

										aukeraOrbita = Astroa.zerrendaKontrola("Aukeratu orbitan jartzeko asteroidea: ", aukeraOrbita, scanner, AsteroideZerrenda.size());

										denboraOrbita = Asteroidea.datuaEskatu("Sartu asteroideak behar duen denbora orbita egiteko" ,denboraOrbita, scanner);

										// Orbitan dauden asteroideen zerrenda hutsik badago, aukeraren arabera orbitan ezarri.
										// Orbitaren zerrendan asteroiderik badago, konprobatu ea aukeratutako asteroidea orbitan dagoen jadanik.
										// Orbitan badago, menura bueltatu.
										if (orbitanAsteroideak.isEmpty()) {

											AsteroideZerrenda.get(aukeraOrbita).orbita(denboraOrbita);
											System.out.println(AsteroideZerrenda.get(aukeraOrbita).getIzena() + " orbitaren posizioa ezarri da.");
											orbitanAsteroideak.add(AsteroideZerrenda.get(aukeraOrbita));

										}	else if (!orbitanAsteroideak.isEmpty())	{
											for (int i= 0; i < orbitanAsteroideak.size(); i++) {
												if (orbitanAsteroideak.get(i) == AsteroideZerrenda.get(aukeraOrbita)) {
													System.out.println("Asteroidearen orbita ezarrita dago. Mesedez, beste bat aukeratu edo beste asteroide bat gehitu.");
													break outerLoop;
												}
											}
											AsteroideZerrenda.get(aukeraOrbita).orbita(denboraOrbita);
											System.out.println(AsteroideZerrenda.get(aukeraOrbita).getIzena() + " orbitaren posizioa ezarri da.");
											orbitanAsteroideak.add(AsteroideZerrenda.get(aukeraOrbita));
										}	else {
											System.out.println("Orbita gaizki joan da. Berriz saiatu.");
											break;
										}

										break;

									}

									// Orbiten posizioak ikusteko blokea
									case 2: {
										if (orbitanAsteroideak.size() > 0) {
											Asteroidea.asteroideZerrenda(orbitanAsteroideak);

											aukeraOrbita = Astroa.zerrendaKontrola("Sartu asteroidearen zenbakia: ", aukeraOrbita, scanner, orbitanAsteroideak.size());

											// Posizioa lortu aukeratutako asteroidearen arabera
											double posizioa[] = orbitanAsteroideak.get(aukeraOrbita).getPosizioa();
											System.out.println("\n" + orbitanAsteroideak.get(aukeraOrbita).getIzena() + "-ren orbitaren posizioa:");

											// Posizioa inprimatu
											for (int i = 0; i < posizioa.length; i++) {
												if (i == 0) {
													System.out.println("X: " + posizioa[i] + "km");
												}
												if (i == 1) {
													System.out.println("Y: " + posizioa[i] + "km");
												}
											}
											break;
										}	else	{
											System.out.println("Ez daude asteroiderik orbitan. Funtzio hau erabiltzeko orbitan sartu behar dira asteroideak.");
											break;
										}
									}

									// Asteroideen gerturapena ikusteko blokea
									case 3: {
										int aukeraOrbita2 		= 0;
										double distantzia		= 0;
										Asteroidea.asteroideZerrenda(orbitanAsteroideak);

										if (orbitanAsteroideak.size() > 1) {

											aukeraOrbita = Astroa.zerrendaKontrola("Sartu 1 asteroidearen zenbakia: ", aukeraOrbita, scanner, orbitanAsteroideak.size());										
											aukeraOrbita2 = Astroa.zerrendaKontrola("Sartu 2 asteroidearen zenbakia: ", aukeraOrbita2, scanner, orbitanAsteroideak.size());
											distantzia = Asteroidea.datuaEskatu("Sartu bi asteroideen arteko distantzia limitea: ", distantzia, scanner);

										}	else {
											System.out.println("Bi asteroide baino gehiago egon behar dute orbitan gerturapenak ikusteko.");
											break;
										}

										if (orbitanAsteroideak.get(aukeraOrbita).gerturapenaIkusi(orbitanAsteroideak.get(aukeraOrbita2), distantzia) == true) {
											System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
											System.out.println("BI ASTEROIDEAK GERTU DAUDE");
											System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
										}	else {
											System.out.println("Asteroideak ez daude gertu");
										}
										break;
									}

									// Orbita eguneratzeko blokea.
									case 4: {

										Asteroidea.asteroideZerrenda(orbitanAsteroideak);

										if (orbitanAsteroideak.isEmpty()) {
											System.out.println("ez dira aurkitu asteroideak orbitan. Mesedez bat sartu.");
											break;
										}	else {
											aukeraOrbita = Astroa.zerrendaKontrola("Sartu asteroidearen zenbakia: ", aukeraOrbita, scanner, orbitanAsteroideak.size());
										}							

										denboraOrbita = Asteroidea.datuaEskatu("Sartu asteroideak behar duen denbora orbita egiteko" ,denboraOrbita, scanner);

										orbitanAsteroideak.get(aukeraOrbita).orbitaEguneratu(denboraOrbita);
										System.out.println("Orbita eguneratu da.");

										break;
									}
									case 5: {
										orbitaBoolean = true;
										break;
									}
									default:
										throw new IllegalArgumentException("Balioa ez da egokia, sartutako balioa: " + aukeraOrbita);
									}

							}
						}

						// Menu printzipalera bueltatzeko blokea
						case 6: {
							bukatuAsteroide = true;
							break;
						}
						default:
							throw new IllegalArgumentException("Balioa ez da egokia, sartutako balioa: " + aukeraAsteroide);
						}

					}
					break;
				}
				//PLANETEN KUDEAKETA
				case 2: {

				}

				//KOMETEN KUDEAKETA
				case 3: {

					while (!bukatuKometa) {

						switch (Kometa.aukeraKontrola(Kometa.menuKometa(), aukeraKometa, scanner, 0, 7)) {

						// Kometa berria zerrendara gehitzeko blokea
						case 1: {
							Kometa kometa = new Kometa();
							KometaZerrenda.add(kometa);
							AstroZerrenda.add(kometa);
							System.out.println("KOMETA BERRI BAT SARTU DA!");
							break;
						}

						// Kometa bat ezabatzeko blokea
						case 2: {
							Kometa.kometaZerrenda(KometaZerrenda);
							Kometa.kometaEzabatu(KometaZerrenda);
							break;
						}

						// Kometak datuaren arabera listatzeko blokea
						case 3: {

							int aukeraDatu = 0;

							// Asteroidearen datuen menua bistaratu eta aukeraren errore kontrola
							aukeraDatu = Astroa.aukeraKontrola(Kometa.datuMotaMenuKometa(), aukeraDatu, scanner, 1, 2);

							// Datuak konparatu funtzioari deituz, eta datu horren arabera ordenatu
							Kometa.datuakKonparatu(aukeraDatu, KometaZerrenda);
						}
						break;

						// Kometak eguneratzeko blokea
						case 4: {

							int aukeraEguneratu = 0;

							Kometa.kometaZerrenda(KometaZerrenda);

							// Zerrenda aukeraketaren errore kontrola	
							// Aukeraren arabera, zerrendako asteroide bat hartu eta eguneratu egiten du aldagaiak berriz eskatuz
							Kometa.kometaEguneratu(Kometa.zerrendaKontrola("Sartu eguneratu nahi den kometaren zenbakia: ", aukeraEguneratu, scanner, KometaZerrenda.size()), KometaZerrenda);
						}

						// Kolak gestionatzeko blokea
						case 5: {

							int aukeraKometa2 = 0;
							int aukeraKola	  = 0;
							boolean aukeraDa = false;
							String kola = "";

							Kometa.kometaZerrenda(KometaZerrenda);
							if (KometaZerrenda.size() > 0) {
								aukeraKola = Kometa.zerrendaKontrola("Sartu kometaren zenbakia kola gestionatzeko", aukeraKola, scanner, KometaZerrenda.size());
							}	else	{
								System.out.println("Ez dira aurkitu kometak. Mesedez, bat sartu.");
								break;
							}
							switch (Kometa.aukeraKontrola(Kometa.kolaMenuKometa(), aukeraKometa2, scanner, 1, 3)){

							case 1: {
								if (KometaZerrenda.get(aukeraKola).getKolaDauka() == true)  {
									System.out.println("Bai, kometa honek kola du eta " + KometaZerrenda.get(aukeraKola).getKolaMota() + " motakoa da");
									break;
								}	else	{
									System.out.println("Kometa honek ez dauka kola");
									break;
								}
							}
							case 2: {
								if (KometaZerrenda.get(aukeraKola).getKolaDauka() == true)  {
									System.out.println("Kometa honek kola bat dauka jadanik.");
									break;
								}	else	{
									while (!aukeraDa) {
										System.out.println("Sartu kometaren kola mota:");
										kola = scanner.nextLine();
										if (kola != null && !kola.trim().isEmpty()) {
											KometaZerrenda.get(aukeraKola).kolaSortu(kola);
											aukeraDa = true;
										} else {
											System.out.println("Mesedez, sartu kola mota bat.");
										}
									}
									System.out.println("Kola sortu da.");
									break;
								}
							}
							case 3: {
								if (KometaZerrenda.get(aukeraKola).getKolaDauka() == true)  {
									System.out.println("Kometa honek kola bat dauka jadanik.");
									break;
								}	else	{
									KometaZerrenda.get(aukeraKola).ausazkoKolaSortu();
									System.out.println("Ausazko kola sortu da: " + KometaZerrenda.get(aukeraKola).getKolaMota());
									break;
								}
							}
							default:
								throw new IllegalArgumentException("Unexpected value: " + aukeraKola);
							}
						}

						case 6: {

							if (KometaZerrenda.size() > 0) {
								double distantzia = 0;
								Kometa.kometaZerrenda(KometaZerrenda);
								aukeraKometa = Kometa.zerrendaKontrola("Sartu periodo orbitala ezarri nahi den kometaren zenbakia", aukeraKometa, scanner, KometaZerrenda.size());
								KometaZerrenda.get(aukeraKometa).periodoOrbitalaKalkulatu(Astroa.datuaEskatu("Sartu kometaren distantzia eguzkiarekiko: ", distantzia, scanner));
								System.out.println(KometaZerrenda.get(aukeraKometa).getIzena() + "-ren periodo orbitala " + KometaZerrenda.get(aukeraKometa).getPeriodoOrbitala() + " da");
							}	else	{
								System.out.println("Ez dira aurkitu kometak. Mesedez, bat sartu.");
								break;
							}
						}
						case 7: {
							bukatuKometa = true;
							break;
						}
						default:
							continue;
						}
					}
					break;
				}

				//METEOROEN KUDEAKETA
				case 4: {

				}
				default:
					continue;
				}
				break;
			}

			// Astroa ezabatzeko blokea
			case 2: {
				Astroa.astroZerrenda(AstroZerrenda);
				Astroa.astroaEzabatu(AstroZerrenda);
				break;
			}
			case 3: {

				int aukeraDatu = 0;

				// Asteroidearen datuen menua bistaratu eta aukeraren errore kontrola
				aukeraDatu = Astroa.aukeraKontrola(Astroa.datuMotaMenu(), aukeraDatu, scanner, 1, 3);

				// Datuak konparatu funtzioari deituz, eta datu horren arabera ordenatu
				Astroa.datuakKonparatuAstro(aukeraDatu, AstroZerrenda);
				break;
			}

			case 4: {
				bukatuDa = true;
				break;
			}
			}
		}
		System.out.println("Exekuzioa bukatu da.");
	}
}
