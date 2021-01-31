public class Carte
{
        String numeAutor;
        String titluCarte;
        String numeEditura;
        int anAparitie;
        int anCurent=2021;

        public Carte(String numeAutor, String titluCarte, String numeEditura, int anAparitie) {
            this.numeAutor = numeAutor;
            this.titluCarte = titluCarte;
            this.numeEditura = numeEditura;
            this.anAparitie = anAparitie;
        }

        public String getNumeAutor() {
            return numeAutor;
        }

        public void setNumeAutor(String numeAutor) {
            this.numeAutor = numeAutor;
        }

        public String getTitluCarte() {
            return titluCarte;
        }

        public void setTitluCarte(String titluCarte) {
            this.titluCarte = titluCarte;
        }

        public String getNumeEditura() {
            return numeEditura;
        }

        public void setNumeEditura(String numeEditura) {
            this.numeEditura = numeEditura;
        }

        public int getAnAparitie() {
            return anAparitie;
        }

        public void setAnAparitie(int anAparitie) {
            this.anAparitie = anAparitie;
        }

        @Override
        public String toString() {
            return "Carte{" +
                    "numeAutor='" + numeAutor + '\'' +
                    ", titluCarte='" + titluCarte + '\'' +
                    ", numeEditura='" + numeEditura + '\'' +
                    ", anAparitie=" + anAparitie +
                    '}';
        }
        public int vechimeCarte(Carte carte){
            int vechime=anCurent-carte.anAparitie;
            return vechime;
        }


}
