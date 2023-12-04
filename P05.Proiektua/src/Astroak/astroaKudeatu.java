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
		int aukeraOrbita 		= 0;
		double denboraOrbita 	= 0;
		boolean bukatuDa 		= true;
		boolean bukatuAsteroide = false;

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

				boolean aukeraDa = false;

				// Astro ezberdinen kudeaketa egiteko blokea
				
				// Astro menuaren aukeraketa
				if (Asteroidea.aukeraKontrola(Astroa.menuAstro(), aukeraDa, aukera, scanner, 1, 4) == 1) {
					
					aukeraDa = false;
					
					// Astro motaren aukeraketa
					switch (Astroa.aukeraKontrola(Astroa.menuAstroAukeratu(), aukeraDa, aukeraAstro, scanner, 1, 4)) {
					
					// ASTEROIDEEN KUDEAKETA
					case 1: {
					
						while (bukatuAsteroide == false) {

							aukeraDa 		= false;

							// Asteroide menuaren aukeraketa
							switch (Asteroidea.aukeraKontrola(Asteroidea.menuAsteroide(), aukeraDa, aukeraAsteroide, scanner, 1, 6)) {

							// Asteroide berria zerrendara gehitzeko blokea
							case 1: {
								Asteroidea asteroide = new Asteroidea();
								AsteroideZerrenda.add(asteroide);
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

								aukeraDa = false;
								int aukeraDatu = 0;

								// Asteroidearen datuen menua bistaratu eta aukeraren errore kontrola
								aukeraDatu = Astroa.aukeraKontrola(Asteroidea.datuMotaMenuAsteroide(), aukeraDa, aukeraDatu, scanner, 1, 3);

								// Datuak konparatu funtzioari deituz, eta datu horren arabera ordenatu
								Asteroidea.datuakKonparatu(aukeraDatu, AsteroideZerrenda);
							}
							break;

							// Asteroideak eguneratzeko blokea
							case 4: {
								
								aukeraDa = false;
								int aukeraEguneratu = 0;
								
								Asteroidea.asteroideZerrenda(AsteroideZerrenda);
								
								// Zerrenda aukeraketaren errore kontrola	
								
								// Aukeraren arabera, zerrendako asteroide bat hartu eta eguneratu egiten du aldagaiak berriz eskatuz
								Asteroidea.asteroideaEguneratu(Asteroidea.zerrendaKontrola("Sartu eguneratu nahi den asteroidearen zenbakia", aukeraDa, aukeraEguneratu, scanner, AsteroideZerrenda.size()), AsteroideZerrenda);
							}

							// Asteroidea orbitan jartzeko blokea
							case 5: {
								boolean orbitaBoolean 	= false;
								ArrayList<Asteroidea> orbitanAsteroideak = new ArrayList<Asteroidea>();
								
								while (orbitaBoolean == false) {
									
									aukeraDa 				= false;
																
									outerLoop:
									switch (Asteroidea.aukeraKontrola(Asteroidea.orbitaMenu(), aukeraDa, aukeraOrbita, scanner, 1, 5)) {
									
									// Orbitaren posizioa ezartzeko blokea
									case 1: {
										
										Asteroidea.asteroideZerrenda(AsteroideZerrenda);
										
										aukeraDa = false;
										
										while (!aukeraDa) {
											System.out.print("Sartu orbitan jarri nahi den asteroidearen zenbakia: ");
											try {
												aukeraOrbita = Integer.parseInt(scanner.nextLine());

												if (aukeraOrbita >= 0 && aukeraOrbita < AsteroideZerrenda.size()) {
													aukeraDa = true;
												} else {
													System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
												}
											} catch (NumberFormatException e) {
												System.out.println("Zenbaki bat sartu behar duzu.");
											}
										}
										
										aukeraDa = false;
										
										while (!aukeraDa) {
											System.out.print("Sartu asteroideak behar duen denbora orbita egiteko (urteetan): ");
											String sarrera = scanner.nextLine();
											try {
												denboraOrbita = Double.parseDouble(sarrera);
												if (denboraOrbita > 0) {
													aukeraDa = true;
												} else {
													System.out.println("Sartu duzun zenbakia negatiboa da");
												}
											} catch (NumberFormatException e) {
												System.out.println("Zenbaki bat sartu behar da.");
											}
										}
										
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
										
										Asteroidea.asteroideZerrenda(orbitanAsteroideak);
										
										aukeraDa = false;
										
										while (!aukeraDa) {
											System.out.print("Sartu asteroidearen zenbakia: ");
											try {
												aukeraOrbita = Integer.parseInt(scanner.nextLine());

												if (aukeraOrbita >= 0 && aukeraOrbita < AsteroideZerrenda.size()) {
													aukeraDa = true;
												} else {
													System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
												}
											} catch (NumberFormatException e) {
												System.out.println("Zenbaki bat sartu behar duzu.");
											}
										}
										
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
									}
									case 3: {
										aukeraDa = false;
										int aukeraOrbita2 		= 0;
										double distantzia		= 0;
										Asteroidea.asteroideZerrenda(orbitanAsteroideak);

										if (orbitanAsteroideak.size() > 1) {
											while (!aukeraDa) {
												System.out.print("Sartu 1 asteroidearen zenbakia: ");
												try {
													aukeraOrbita = Integer.parseInt(scanner.nextLine());

													if (aukeraOrbita >= 0 && aukeraOrbita < AsteroideZerrenda.size()) {
														aukeraDa = true;
													} else {
														System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
													}
												} catch (NumberFormatException e) {
													System.out.println("Zenbaki bat sartu behar duzu.");
												}
											}
											
											aukeraDa = false;

											while (!aukeraDa) {
												System.out.print("Sartu 2 asteroidearen zenbakia: ");
												try {
													aukeraOrbita2 = Integer.parseInt(scanner.nextLine());

													if (aukeraOrbita >= 0 && aukeraOrbita < AsteroideZerrenda.size()) {
														aukeraDa = true;
													} else {
														System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
													}
												} catch (NumberFormatException e) {
													System.out.println("Zenbaki bat sartu behar duzu.");
												}
											}

											aukeraDa = false;

											while (!aukeraDa) {
												System.out.print("Sartu distanzia limitea bi asteroideena");
												String sarrera = scanner.nextLine();
												try {
													distantzia = Double.parseDouble(sarrera);
													if (distantzia > 0) {
														aukeraDa = true;
													} else {
														System.out.println("Sartu duzun zenbakia negatiboa da");
													}
												} catch (NumberFormatException e) {
													System.out.println("Zenbaki bat sartu behar da.");
												}
											}
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
									case 4: {
										Asteroidea.asteroideZerrenda(orbitanAsteroideak);
										aukeraDa = false;
										
										if (orbitanAsteroideak.isEmpty()) {
											System.out.println("ez dira aurkitu asteroideak orbitan. Mesedez bat sartu.");
											break;
										}	else {
											while (!aukeraDa) {
												System.out.print("Sartu asteroidearen zenbakia: ");
												try {
													aukeraOrbita = Integer.parseInt(scanner.nextLine());

													if (aukeraOrbita >= 0 && aukeraOrbita < orbitanAsteroideak.size()) {
														aukeraDa = true;
													} else {
														System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
													}
												} catch (NumberFormatException e) {
													System.out.println("Zenbaki bat sartu behar duzu.");
												}
											}
										}
										
										aukeraDa = false;
										
										while (!aukeraDa) {
											System.out.print("Sartu asteroideak behar duen denbora orbita egiteko (urteetan): ");
											String sarrera = scanner.nextLine();
											try {
												denboraOrbita = Double.parseDouble(sarrera);
												if (denboraOrbita > 0) {
													aukeraDa = true;
												} else {
													System.out.println("Sartu duzun zenbakia negatiboa da");
												}
											} catch (NumberFormatException e) {
												System.out.println("Zenbaki bat sartu behar da.");
											}
										}
										
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

					//PLANETEN KUDEAKETA
					}
					case 2: {
					
					//KOMETEN KUDEAKETA
					}
					case 3: {
					
					//METEOROEN KUDEAKETA
					}
					case 4: {

					}
					default:
						continue;
					}
				}

//				//Meteoro bat ezabatzeko blokea
//				if (aukera == 2) {
//
//					meteoroZerrenda(AstroZerrenda);
//
//					aukeraDa = false;				
//					int indizea = 0;
//
//					// Errore kontrola, zerrendaren arabera eta negatiboa bada menua itzultzeko aukera
//					while (!aukeraDa) {
//						System.out.print("Sartu ezabatu nahi duzun meteoroaren zenbakia. Ateratzeko, zenbaki negatibo bat sartu: ");
//						StringBuilder mezua = new StringBuilder();
//
//						try {
//							indizea = Integer.parseInt(scanner.nextLine());
//
//							if (indizea >= 0 && indizea < AstroZerrenda.size()) {
//								Astroa borratu = (Astroa) AstroZerrenda.remove(indizea);
//								mezua.append("Meteorito: ").append(borratu.getIzena()).append(" ezabatuta");
//								System.out.println(mezua);
//								aukeraDa = true;
//							} else if (indizea < 0) {
//								break;
//							} else {
//								System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
//							}
//						} catch (NumberFormatException e) {
//							System.out.println("Zenbaki bat sartu, mesedez.");
//						}
//					}
//				}
//				
//				//Meteoroak datu motaren arabera zerrendatzeko blokea
//				if (aukera == 3) {
//
//					int aukera2 = 0;
//
//					// Datu mota aukeratzeko menua
//					String menu2="Aukeratu datu mota zerrendatzeko: \n";
//					menu2+="1.- Izenaren arabera\n";
//					menu2+="2.- Masaren arabera\n";
//					menu2+="3.- RA koordenatuen arabera\n";
//					menu2+="4.- DE koordenatuen arabera\n";
//					menu2+="5.- Aktibitate dataren arabera\n";
//					menu2+="6.- Konposizioa\n";
//
//					aukeraDa = false;
//
//					// Errore kontrola. Datu mota aukeratzeko. Zenbaki bat izan behar du.
//					// Zenbakia 1-5 tartean egon behar du. Negatiboa sartzen bada bueltatzeko aukera.
//					while (!aukeraDa) {
//						System.out.print(menu2);
//						try {
//							aukera2 = scanner.nextInt();
//
//							if (aukera2 >= 1 && aukera2 <= 6) {
//								aukeraDa = true;
//							} else if (aukera2 < 0) {
//								System.out.println("Menu-ra itzuli");
//								return; // o realiza alguna acción adicional según tus necesidades
//							} else {
//								System.out.println("Zenbakia ez da egokia");
//							}
//						} catch (NumberFormatException e) {
//							System.out.println("Zenbaki bat sartu behar duzu.");
//						}
//					}
//
//					//Comparator bat, meteorito objektuko datu motak konparatzeko
//					Comparator<Astroa> comparator = null;
//
//					//Aukeraren arabera, datu mota bat edo beste konparatu
//					switch (aukera2) {
//					case 1:
//						comparator = Comparator.comparing(Astroa::getIzena);
//						break;
//					case 2:
//						comparator = Comparator.comparing(Astroa::getMasa);
//						break;
//					case 3:
//						comparator = Comparator.comparing((Astroa m) -> {
//							Koordenatuak koordenatuak = m.getRaGraduak();
//							return koordenatuak.getZenbakia();
//						});
//						break;
//					case 4:
//						comparator = Comparator.comparing((Astroa m) -> {
//							Koordenatuak koordenatuak = m.getDeGraduak();
//							return koordenatuak.getZenbakia();
//						});
//						break;
//					case 5:
//						comparator = Comparator.comparing(Astroa::getDataAktibitate);
//						break;
//					case 6:
//						comparator = Comparator.comparing(Astroa::getKonposizioa);
//						break;
//					default:
//						System.out.println("Aukera ez da egokia. Menu-ra bueltatu.");
//						return;
//					}
//
//					// Konparadoreak eman duen emaitzaren arabera, meteoro zerrendako objektuak zerrendatu
//					Collections.sort(Meteoroak, comparator);
//
//					// Emaitza bistaratu
//					StringBuilder mezua = new StringBuilder();
//					mezua.append("Meteoritoen zerrenda aukeratutako kriterioarekin zerrendatuta:\n");
//
//					// Meteoroen zerrenda atera, datu motaren arabera
//					for (int i = 0; i < Meteoroak.size(); i++) {
//						Astroa meteoroOrdenatua = Meteoroak.get(i);
//
//						mezua.append(i).append(". - Izena: ").append(meteoroOrdenatua.getIzena()).append("\n");
//						mezua.append("Masa: " + meteoroOrdenatua.getMasa()).append("\n");
//						mezua.append("RA1: " + meteoroOrdenatua.getRaGraduak().toStringGraduak() + ("\n")
//								+  "RA2: " + meteoroOrdenatua.getRaMinutoak().toStringOrduak() + ("\n")
//								+  "DE1: " +  meteoroOrdenatua.getDeGraduak().toStringGraduak() + ("\n")
//								+  "DE2: " + meteoroOrdenatua.getDeMinutoak().toStringOrduak() + ("\n"));
//						mezua.append("Data aktibitate maximoa: " + meteoroOrdenatua.getDataAktibitate()).append("\n");
//						mezua.append("Konposizioa: " + meteoroOrdenatua.getKonposizioa()).append("\n");
//						mezua.append("Iruzkinak: " + meteoroOrdenatua.getIruzkina()).append("\n\n");
//					}
//
//					System.out.println(mezua);
//				}
//
//				//Meteoroak eguneratzeko blokea
//				if (aukera == 4) {
//
//					int aukera3 = 0;
//
//					meteoroZerrenda(Meteoroak);
//
//					aukeraDa = false;
//
//					// Errore kontrola. Erabiltzaileari eskatzeko zein meteoro nahi duen aukeratu
//					// Zenbaki bat bakarrik izan behar du, meteoro zerrenda tartean.
//					// Zenbakia negatiboa bada menura itzultzeko aukera.
//
//					while (!aukeraDa) {
//						System.out.print("Sartu eguneratu nahi den meteoroaren zenbakia: ");
//						try {
//							aukera = Integer.parseInt(scanner.nextLine());
//
//							if (aukera >= 0 && aukera < Meteoroak.size()) {
//								aukeraDa = true;
//							} else {
//								System.out.println("Sartutako zenbakia zerrendatik kanpo dago");
//							}
//						} catch (NumberFormatException e) {
//							System.out.println("Zenbaki bat sartu behar duzu.");
//						}
//					}
//
					//Aldagai berriak sartzen dira eta meteoro berri batean gordetzen dira
//					Astroa MeteoroBerria = aldagaiakEskatu();
//					Astroa Meteoro = Meteoroak.get(aukera3);
//
//					StringBuilder mezua = new StringBuilder();
//
//					String azkenekoIzena = Meteoro.getIzena();
//
//					// Sortutako meteoro berriko datuak eskatutako meteoroan sartu, datuak eguneratzeko
//					Meteoro.setIzena(MeteoroBerria.getIzena());
//					Meteoro.setMasa(MeteoroBerria.getMasa());
//					Meteoro.setDataAktibitate(MeteoroBerria.getDataAktibitate());
//					Meteoro.setKonposizioa(MeteoroBerria.getKonposizioa());
//					Meteoro.setRaGraduak(MeteoroBerria.getRaGraduak());
//					Meteoro.setRaMinutoak(Meteoro.getRaMinutoak());
//					Meteoro.setDeGraduak(MeteoroBerria.getRaMinutoak());
//					Meteoro.setDeMinutoak(MeteoroBerria.getDeMinutoak());
//					Meteoro.setIruzkina(MeteoroBerria.getIruzkina());
//
//					mezua.append("Meteorito: ").append(azkenekoIzena).append(" eguneratuta,").append(" horain: ").append(MeteoroBerria.getIzena());
//					System.out.println(mezua);
//
//				}	
//
//				if (aukera == 5) {
//					bukatuDa = false;
//				}			
//			}
		}

		System.out.println("Exekuzioa bukatu da.");
	}
}
