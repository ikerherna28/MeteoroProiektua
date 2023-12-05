package Astroak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class astroaKudeatu {

    private static String izena;
    private static String idioma;
    private static String euskara;
    private static String ingles;

    private static void setLanguage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aukeratu idioma (euskara/ingles): ");
        idioma = scanner.nextLine().toLowerCase();

        if ("euskara".equals(idioma)) {
            euskara = "euskara";
            ingles = "ingles";
        } else if ("ingles".equals(idioma)) {
            euskara = "basque";
            ingles = "english";
        } else {
            System.out.println("Idioma hori ez dago onartuta. Hizkuntza lehenetsia inglesa izango da.");
            euskara = "basque";
            ingles = "english";
        }
    }

    private static String getString(String euskaraText, String inglesText) {
        return "euskara".equals(idioma) ? euskaraText : inglesText;
    }

    private static Koordenatuak koordenatuaIrakurri(String mezua) {
        Scanner scanner = new Scanner(System.in);
        boolean koordenatuZuzena = false;
        double graduak = 0.0;
        double minutuak = 0.0;

        while (!koordenatuZuzena) {
            try {
                System.out.print(mezua);
                graduak = Double.parseDouble(scanner.nextLine());

                System.out.print(getString("Sartu minutuak: ", "Enter minutes: "));
                minutuak = Double.parseDouble(scanner.nextLine());

                if (graduak >= 0 && graduak < 90 && minutuak >= 0 && minutuak < 60) {
                    koordenatuZuzena = true;
                } else {
                    System.out.println(getString("Koordenatuak ez dira zuzenak. Mesedez, sartu baliozkoak.", "Coordinates are not valid. Please enter valid values."));
                }
            } catch (NumberFormatException e) {
                System.out.println(getString("Koordenatuak zenbaki positiboak izan behar dute. Mesedez, saiatu berriro.", "Coordinates should be positive numbers. Please try again."));
            }
        }

        return new Koordenatuak(graduak, minutuak);
    }

    private static Asteroidea aldagaiakEskatu() {
        double masa = 0.0;
        Koordenatuak raKoordenatuak;
        Koordenatuak deKoordenatuak;

        try (Scanner scanner = new Scanner(System.in)) {
            boolean aukeraDa;

            aukeraDa = false;

            while (!aukeraDa) {
                System.out.print(getString("Sartu astroaren izena: ", "Enter the name of the astro: "));
                izena = scanner.nextLine();
                if (izena != null && !izena.trim().isEmpty()) {
                    aukeraDa = true;
                } else {
                    System.out.println(getString("Mesedez, sartu izen bat.", "Please enter a name."));
                }
            }

            aukeraDa = false;

            while (!aukeraDa) {
                System.out.print(getString("Sartu astroaren masa (gramoetan): ", "Enter the mass of the astro (in grams): "));
                try {
                    masa = Double.parseDouble(scanner.nextLine());
                    if (masa > 0) {
                        aukeraDa = true;
                    } else {
                        System.out.println(getString("Mesedez, sartu baliozko masa positiboa.", "Please enter a valid positive mass."));
                    }
                } catch (NumberFormatException e) {
                    System.out.println(getString("Mesedez, sartu zenbaki positiboa masa gisa.", "Please enter a valid positive number as mass."));
                }
            }

            // Solicitar otras propiedades del astro
            raKoordenatuak = koordenatuaIrakurri(getString("Sartu R.A. koordenatuak:", "Enter R.A. coordinates: "));
            deKoordenatuak = koordenatuaIrakurri(getString("Sartu declinazio koordenatuak:", "Enter declination coordinates: "));

            return new Asteroidea(izena, masa, null, euskara, raKoordenatuak, deKoordenatuak, deKoordenatuak, deKoordenatuak);
        }
    }

    private static void menuaErakutsi() {
        System.out.println(getString("Aukeratu zure ekintza:", "Choose your action:"));
        System.out.println("1. " + getString("Astroa sartu", "Add astro"));
        System.out.println("2. " + getString("Astroen zerrenda erakutsi", "Show list of astros"));
        System.out.println("3. " + getString("Astroen informazioa erakutsi", "Show astro information"));
        System.out.println("4. " + getString("Astroa eguneratu", "Update astro"));
        System.out.println("5. " + getString("Astroa ezabatu", "Delete astro"));
        System.out.println("6. " + getString("Ordenatu astroak", "Sort astros"));
        System.out.println("7. " + getString("Irten", "Exit"));
    }

    private static void astroaSartu(ArrayList<intAstro> lista) {
        intAstro astroa = aldagaiakEskatu();
        lista.add(astroa);
        System.out.println(getString("Astroa ondo gehitu da.", "Astro added successfully."));
    }

    private static void astroakErakutsi(ArrayList<intAstro> lista) {
        System.out.println(getString("Astroen zerrenda:", "List of astros:"));
        for (intAstro astroa : lista) {
            System.out.println(astroa.getIzena());
        }
    }

    private static void astroarenInformazioaErakutsi(ArrayList<intAstro> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getString("Sartu astroaren izena: ", "Enter the name of the astro: "));
        izena = scanner.nextLine();

        intAstro astroa = bilatuAstroa(izena, lista);
        if (astroa != null) {
            System.out.println(getString("Astroaren informazioa:", "Astro information:"));
            System.out.println(getString("Izena: " + astroa.getIzena(), "Name: " + astroa.getIzena()));
            System.out.println(getString("Masa: " + astroa.getMasa() + " g", "Mass: " + astroa.getMasa() + " g"));
            System.out.println(getString("R.A. Graduak: " + astroa.getRaKoordenatuak().getGraduak() + " Minutuak: " + astroa.getRaKoordenatuak().getMinutuak(),
                    "R.A. Degrees: " + astroa.getRaKoordenatuak().getGraduak() + " Minutes: " + astroa.getRaKoordenatuak().getMinutuak()));
            System.out.println(getString("Declinazioa Graduak: " + astroa.getDeKoordenatuak().getGraduak() + " Minutuak: " + astroa.getDeKoordenatuak().getMinutuak(),
                    "Declination Degrees: " + astroa.getDeKoordenatuak().getGraduak() + " Minutes: " + astroa.getDeKoordenatuak().getMinutuak()));
        } else {
            System.out.println(getString("Astroa ez da aurkitu.", "Astro not found."));
        }
    }

    private static intAstro bilatuAstroa(String izena, ArrayList<intAstro> lista) {
        for (intAstro astroa : lista) {
            if (astroa.getIzena().equalsIgnoreCase(izena)) {
                return astroa;
            }
        }
        return null;
    }

    private static void astroaEguneratu(ArrayList<intAstro> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getString("Sartu astroaren izena: ", "Enter the name of the astro: "));
        izena = scanner.nextLine();

        intAstro astroa = bilatuAstroa(izena, lista);
        if (astroa != null) {
            System.out.println(getString("Sartu astroaren eguneratutako izena (hutsik utzita mantendu): ",
                    "Enter the updated name of the astro (leave blank to keep current name): "));
            String updatedIzena = scanner.nextLine();
            if (!updatedIzena.isEmpty()) {
                astroa.setIzena(updatedIzena);
            }

            System.out.println(getString("Sartu astroaren eguneratutako masatua (gramoetan) (hutsik utzita mantendu): ",
                    "Enter the updated mass of the astro (in grams) (leave blank to keep current mass): "));
            String updatedMasa = scanner.nextLine();
            if (!updatedMasa.isEmpty()) {
                try {
                    double masa = Double.parseDouble(updatedMasa);
                    if (masa > 0) {
                        astroa.setMasa(masa);
                        System.out.println(getString("Astroa eguneratu da.", "Astro updated successfully."));
                    } else {
                        System.out.println(getString("Mesedez, sartu baliozko masa positiboa.", "Please enter a valid positive mass."));
                    }
                } catch (NumberFormatException e) {
                    System.out.println(getString("Mesedez, sartu zenbaki positiboa masa gisa.", "Please enter a valid positive number as mass."));
                }
            } else {
                System.out.println(getString("Astroa eguneratu da.", "Astro updated successfully."));
            }
        } else {
            System.out.println(getString("Astroa ez da aurkitu.", "Astro not found."));
        }
    }


    private static void astroaEzabatu(ArrayList<intAstro> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(getString("Sartu astroaren izena: ", "Enter the name of the astro: "));
        izena = scanner.nextLine();

        intAstro astroa = bilatuAstroa(izena, lista);
        if (astroa != null) {
            lista.remove(astroa);
            System.out.println(getString("Astroa ezabatu da.", "Astro deleted successfully."));
        } else {
            System.out.println(getString("Astroa ez da aurkitu.", "Astro not found."));
        }
    }

    private static void astroakOrdenatu(ArrayList<intAstro> lista) {
        Collections.sort(lista, Comparator.comparing(intAstro::getIzena));
        System.out.println(getString("Astroak izenaren arabera ordenatu dira.", "Astros have been sorted by name."));
    }

    public static void main(String[] args) {
        setLanguage();
        ArrayList<intAstro> astroak = new ArrayList<>();

        int aukera = 0;
        while (aukera != 7) {
            menuaErakutsi();

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print(getString("Aukeratu zenbaki bat (1-7): ", "Choose a number (1-7): "));
                aukera = Integer.parseInt(scanner.nextLine());

                switch (aukera) {
                    case 1:
                        astroaSartu(astroak);
                        break;
                    case 2:
                        astroakErakutsi(astroak);
                        break;
                    case 3:
                        astroarenInformazioaErakutsi(astroak);
                        break;
                    case 4:
                        astroaEguneratu(astroak);
                        break;
                    case 5:
                        astroaEzabatu(astroak);
                        break;
                    case 6:
                        astroakOrdenatu(astroak);
                        break;
                    case 7:
                        System.out.println(getString("Agur!", "Goodbye!"));
                        break;
                    default:
                        System.out.println(getString("Aukera ez da baliogarria. Mesedez, saiatu berriro.", "Invalid choice. Please try again."));
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(getString("Zenbaki bat sartu behar duzu.", "You must enter a number."));
            }
        }
    }
}
