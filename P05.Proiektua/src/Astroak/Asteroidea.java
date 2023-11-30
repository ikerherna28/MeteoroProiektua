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
	
	private double x;					// orbitaren x koordenatua
	
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
	 *  Hutsik dagoen eraikitzailea.
	 */

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
	 * diametroa ezarri
	 *
	 * @param diametroa (km)
	 */
	public void setDiametroa(double diametroa) {
		this.diametroa = diametroa;
	}
	
	/**
	 * diametroa lortu
	 *
	 * @return diametroa (km)
	 */
	public double getDiametroa() {
		return diametroa;
	}
	
	/**
	 * Asteroidearen posizioa ezartzen du orbitarekiko
	 *
	 * @param x koordenatua kilometroetan
	 * @param y koordenatua kilometroetan
	 */

	public void setPosizioa (double x, double y) {
		this.x = x;
		this.y = y;		
	}
	
	/**
	 * x posizioa lortu
	 *
	 * @return x posizioa (km)
	 */
	public double getX() {
		return x;
	}

	/**
	 * y posizioa lortu
	 *
	 * @return y posizioa (km)
	 */
	public double getY() {
		return y;
	}

	/**
	 * Orbitaren posizio absolutoa lortu
	 *
	 * @return orbitaren posizioaren kalkuloa, kilometroetan (km)
	 */
	public double[] getPosizioa() {
		return new double[]{x, y};
	}
	
	/**
	 * Orbitaren posizioa kalkulatzeko.
	 *
	 * @param denbora minututan
	 */
	public void orbita (double denbora) {
		
		this.angelua += this.abiaduraAngeluarra * denbora;
		this.x = distantziaZentroa * Math.cos(angelua);
		this.y = distantziaZentroa * Math.sin(angelua);
		
		setPosizioa(x, y);
	}
	
	/**
	 * Orbita eguneratu.
	 *
	 * @param denboraGehitu minututan, orbita eguneratzeko denbora
	 */
	public void orbitaEguneratu (double denboraGehitu) {
		orbita(denboraGehitu);
	}
	
	/**
	 * bi asteroideen arteko distantzia kalkulatzeko
	 *
	 * @param asteroidea, nahi den asteroidearen distantzia kalkulatzeko
	 * @return distantziaren kalkulo absolutu bat.
	 */
	
	private double distantziaKalkulatu (Asteroidea besteAsteroidea) {
		double deltaX = getX() - besteAsteroidea.getX();
		double deltaY = getY() - besteAsteroidea.getY();
		
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
				
	}
	
	/**
	 * bi asteroideen arteko gerturapena detektatzeko
	 *
	 * @param asteroidea, nahi den asteroidearen gerturapena kalkulatzeko
	 * @param distantzia limitea (km)
	 * @return true / false, gertu badaude distantziaLimitearekiko, true, bestela false.
	 */
	
	public boolean gerturapenaIkusi(Asteroidea besteAsteroide, double distantziaLimitea) {
        double distantzia = distantziaKalkulatu(besteAsteroide);

        return distantzia < distantziaLimitea;
    }	
}