package Astroak;

import java.time.LocalDate;

public class Meteoroa implements intAstro {
    private String izena;
    private double masa;
    private LocalDate dataAktibitate;
    private String konposizioa;
    private Koordenatuak raKoordenatuak;
    private Koordenatuak deKoordenatuak;
    private String iruzkinak;

    public Meteoroa(String izena, double masa, LocalDate dataAktibitate, String konposizioa, Koordenatuak raKoordenatuak, Koordenatuak deKoordenatuak, String iruzkinak) {
        this.izena = izena;
        this.masa = masa;
        this.dataAktibitate = dataAktibitate;
        this.konposizioa = konposizioa;
        this.raKoordenatuak = raKoordenatuak;
        this.deKoordenatuak = deKoordenatuak;
        this.iruzkinak = iruzkinak;
    }

    // Implementar los métodos de la interfaz IntAstro
    @Override
    public String getIzena() {
        return izena;
    }

    @Override
    public double getMasa() {
        return masa;
    }

    @Override
    public String getDataAktibitate() {
        return dataAktibitate.toString();
    }

    @Override
    public String getKonposizioa() {
        return konposizioa;
    }

    @Override
    public Koordenatuak getRaKoordenatuak() {
        return raKoordenatuak;
    }

    @Override
    public Koordenatuak getDeKoordenatuak() {
        return deKoordenatuak;
    }

    @Override
    public String getIruzkinak() {
        return iruzkinak;
    }

	@Override
	public void setIzena(String updatedIzena) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMasa(double masa) {
		// TODO Auto-generated method stub
		
	}
}
