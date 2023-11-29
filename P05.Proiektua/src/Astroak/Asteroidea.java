package Astroak;

// TODO: Auto-generated Javadoc
/**
 * The Class Asteroidea.
 */
public class Asteroidea extends Astroa{
	
	// ATRIBUTOAK
	
	private double diametroa;			// Asteroidearen diametroa, kilometroetan	
	private double distantziaZentroa;	// Orbita zentroa dagoen distantzia, kilometroetan	
	private double abiaduraAngeluarra;	// Abiadura, km/h	
	private double angelua;				// Gradutan º
	
	// ********************* KLASE ERAIKITZAILEAK ***********************

	/**
	 * Asteroide berria sortzeko eraikitzailea parametroak erabiliz
	 *
	 * @param izena --> astroaren izena
	 * @param masa -->  astroaren masa
	 * @param raGraduak --> astroaren koordenaturak gradutan º
	 * @param raMinutoak --> astroaren koordenatuak minututan
	 * @param deGraduak --> astroaren koordenaturak gradutan º
	 * @param deMinutoak --> astroaren koordenatuak minututan
	 * @param diametroa --> asteroidearen diametroa kilometrotan (km)
	 * @param distantziaZentroa --> Zentroarekiko distantzia, eguzkia, kilometrotan (km)
	 * @param abiaduraAngeluarra --> angeluarekiko abiadura. (km/h)
	 * @param angelua the angelua --> angelua, gradutan º
	 */
	
	Asteroidea(String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			   double diametroa, double distantziaZentroa, double abiaduraAngeluarra, double angelua) {

	}
	
	/**
	 * Asteroide berria sortzeko eraikitzailea parametroak erabiliz eta iruzkinak gehituz
	 *
	 * @param izena the izena
	 * @param masa the masa
	 * @param raGraduak the ra graduak
	 * @param raMinutoak the ra minutoak
	 * @param deGraduak the de graduak
	 * @param deMinutoak the de minutoak
	 * @param diametroa the diametroa
	 * @param distantziaZentroa the distantzia zentroa
	 * @param abiaduraAngeluarra the abiadura angeluarra
	 * @param angelua the angelua
	 * @param iruzkina the iruzkina
	 */
	// Asteroide berria sortzeko eraikitzailea parametroak erabiliz, iruzkina gehituta
	Asteroidea(String izena, double masa, Koordenatuak raGraduak, Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak,
			   double diametroa, double distantziaZentroa, double abiaduraAngeluarra, double angelua, String iruzkina) {

	}
	
	/**
	 *  Hutsik dagoen eraikitzailea
	 */
	 Hutsik dagoen eraikitzailea
	public Asteroidea() {
		izena				= "";
		masa 				= 0;
		raGraduak 			= new Koordenatuak(0);
		deGraduak 			= new Koordenatuak(0);
		raMinutoak 			= new Koordenatuak(0);
		deMinutoak 			= new Koordenatuak(0);
		distantziaZentroa 	= 0;
		abiaduraAngeluarra 	= 0;
		angelua 			= 0;		
	}
}