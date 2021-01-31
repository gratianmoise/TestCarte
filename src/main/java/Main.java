public class Main {
    public static void main(String[] args) {

        Carte carte1 = new Carte("Tudor Arghezi", "Flori de mucigai", "Cultura nationala", 1931);
        Carte carte2 = new Carte("Vasile Alecsandri", "Dan, capitan de plai", "Minerva", 1974);
        Carte carte3 = new Carte("Hector Malot", "Singur pe lume", "Ion Creanga", 1980);

        aflaVechime(carte1,carte2,carte3);
    }

    public static void aflaVechime(Carte carte1, Carte carte2, Carte carte3) {
        int vechime1 = 2021 - carte1.anAparitie;
        int vechime2 = 2021 - carte2.anAparitie;
        int vechime3 = 2021 - carte3.anAparitie;
        int minim;
        Carte carteRecenta = carte1;
        if (vechime1 < vechime2) {
            minim = vechime1;
            carteRecenta = carte1;
        } else {
            minim = vechime2;
            carteRecenta = carte2;
        }
        if (minim > vechime3) {
            minim = vechime3;
            carteRecenta = carte3;
        }

        System.out.println("Cea mai recenta carte este " + carteRecenta.titluCarte + ", de "+ carteRecenta.numeAutor+" cu o vechime de " + minim + " ani."); // carteaRecenta.toString()


    }

}