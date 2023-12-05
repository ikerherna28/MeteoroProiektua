package Astroak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Astroa implements intAstro {

    protected String izena;
    protected double masa;
    protected String Konposizioa;
    protected LocalDate dataAktibitate;
    protected Koordenatuak raGraduak;
    protected Koordenatuak raMinutoak;
    protected Koordenatuak deGraduak;
    protected Koordenatuak deMinutoak;
    protected String iruzkina;

    // Nuevas propiedades para rastrear creador y última modificación
    private String creador;
    private String ultimoModificador;
    private LocalDate fechaUltimaModificacion;

    Astroa(String izena, double masa, LocalDate dataAktibitate, String Konposizioa, Koordenatuak raGraduak,
           Koordenatuak raMinutoak, Koordenatuak deGraduak, Koordenatuak deMinutoak) {
        this.izena = izena;
        this.masa = masa;
        this.dataAktibitate = dataAktibitate;
        this.Konposizioa = Konposizioa;
        this.raGraduak = raGraduak;
        this.raMinutoak = raMinutoak;
        this.deGraduak = deGraduak;
        this.deMinutoak = deMinutoak;

        this.creador = "Desconocido";  // Valor predeterminado
        this.ultimoModificador = "Desconocido";  // Valor predeterminado
        this.fechaUltimaModificacion = LocalDate.now();
    }

    public String getCreador() {
        return creador;
    }

    public String getUltimoModificador() {
        return ultimoModificador;
    }

    public LocalDate getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void actualizarInfoModificacion(String nuevoModificador) {
        this.ultimoModificador = nuevoModificador;
        this.fechaUltimaModificacion = LocalDate.now();
    }

	@Override
	public String getIzena() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getMasa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDataAktibitate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKonposizioa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Koordenatuak getRaKoordenatuak() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Koordenatuak getDeKoordenatuak() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIruzkinak() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIzena(String updatedIzena) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMasa(double masa) {
		// TODO Auto-generated method stub
		
	}

    // Métodos restantes existentes
}
