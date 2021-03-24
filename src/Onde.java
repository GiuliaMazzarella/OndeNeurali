import java.util.ArrayList;

public class Onde {

    public String[] nomiOnde = new String[]{"Alfa", "Beta", "Delta", "Gamma", "Theta"};
    public double numFrequenza;
    static ArrayList<Canzoni> canzoni = new ArrayList<>();

    //System.out.println(Arrays.asList(nomiOnde))

    public void mostraFrequenzeOnde() {
        int index = 0;

        if ((numFrequenza >= 0.1) && (numFrequenza <= 3.9)) {

            index = playCanzoni("-Ninna Nanna-", "Soft", "Delta");
            System.out.println("La frequenza e' relativa alle onde " + nomiOnde[2] + " che caratterizzano gli stadi di sonno profondo.");
            System.out.println("La canzone scelta per te e': " + canzoni.get(index).titoloCanzone + ", " + "adatta a momenti di riposo. Il genere e' " + canzoni.get(index).genereCanzone + ". " + "La canzone appartiene alla categoria delle onde " + canzoni.get(index).ondeCanzone + ".");

        } else if ((numFrequenza > 4) && (numFrequenza <= 7.9)) {

            index = playCanzoni("Shine on you crazy diamond", "Rock", "Theta");
            System.out.println("La frequenza e' relativa alle onde " + nomiOnde[4] + " che caratterizzano gli stadi di sonno NREM e REM.");
            System.out.println("La canzone scelta per te e': " + canzoni.get(index).titoloCanzone + ", " + "adatta a momenti di riflessione. Il genere e' " + canzoni.get(index).genereCanzone + ". " + "La canzone appartiene alla categoria delle onde " + canzoni.get(index).ondeCanzone + ".");

        } else if ((numFrequenza > 8) && (numFrequenza <= 13.9)) {

            index = playCanzoni("-Canzone che aiuta a concentrarsi-", "Lo-Fi/Chillout", "Alfa");
            System.out.println("La frequenza e' relativa alle onde " + nomiOnde[0] + "che caratterizzano gli stadi della veglia ad occhi chiusi e degli istanti precedenti l'addormentamento.");
            System.out.println("La canzone scelta per te e': " + canzoni.get(index).titoloCanzone + ", " + "adatta a momenti di concentrazione. Il genere e' " + canzoni.get(index).genereCanzone + ". " + "La canzone appartiene alla categoria delle onde " + canzoni.get(index).ondeCanzone + ".");

        } else if ((numFrequenza > 14) && (numFrequenza <= 30)) {

            index = playCanzoni("Breezeblocks", "Indie Rock", "Beta");
            System.out.println("La frequenza e' relativa alle onde " + nomiOnde[1] + " che caratterizzano lo stadio di veglia.");
            System.out.println("La canzone scelta per te e': " + canzoni.get(index).titoloCanzone + ", " + "adatta a momenti generici della giornata. Il genere e' " + canzoni.get(index).genereCanzone + ". " + "La canzone appartiene alla categoria delle onde " + canzoni.get(index).ondeCanzone + ".");

        } else if ((numFrequenza > 30) && (numFrequenza <= 42)) {

            index = playCanzoni("Le Quattro Stagioni", "Classica", "Gamma");
            System.out.println("La frequenza e' relativa alle onde " + nomiOnde[3] + " che caratterizzano gli stati di particolare tensione.");
            System.out.println("La canzone scelta per te e': " + canzoni.get(index).titoloCanzone + ", " + "adatta a momenti di tensione. Il genere e' " + canzoni.get(index).genereCanzone + ". " + "La canzone appartiene alla categoria delle onde " + canzoni.get(index).ondeCanzone + ".");

        } else {

            System.out.println("Onde non riconosciute");

        }
    }

    public int playCanzoni(String titolo, String genere, String onde) { //riempio il metodo con le variabili
        Canzoni songs = new Canzoni(); //inizio dalla classe da cui voglio prendere
        int indice = 0;

        songs.titoloCanzone = titolo;
        songs.genereCanzone = genere;
        songs.ondeCanzone = onde;

        canzoni.add(songs);

        indice = canzoni.indexOf(songs);
        return indice;
    }

}

