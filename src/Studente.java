public class Studente extends Persona {
    private int classe = 0;
    private char sezione;
    private String matricola;

    public Studente(String nome, String cognome, int nascita, int classe, char sezione, String matricola) {
        super(nome, cognome, nascita);
        if (classe > 0 && classe <= 5) setClasse(classe);
        setSezione(sezione);
        setMatricola(matricola);
    }

    private void setClasse(int classe) {
        this.classe = classe;
    }

    private void setSezione(char sezione) {
        this.sezione = sezione;
    }

    private void setMatricola(String matricola) {
        /*StringBuilder matricolaBuilder = new StringBuilder(matricola);*/
        for (int i = 0; i < 6; i++) {
            int c = (int) (Math.random() * 10);
            /*matricolaBuilder.append(c);*/
            matricola += c;
        }
        /*matricola = matricolaBuilder.toString();*/
        this.matricola = matricola;
    }

    public int getClasse() {
        return classe;
    }

    public char getSezione() {
        return sezione;
    }

    public String getMatricola() {
        return matricola;
    }

}
