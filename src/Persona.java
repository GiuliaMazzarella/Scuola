public class Persona {
    private String nome;
    private String cognome;
    private int nascita;

    public Persona(String nome, String cognome, int nascita) {
        setNome(nome);
        setCognome(cognome);
        if (nascita > 1990) setNascita(nascita);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNascita(int nascita) {
        this.nascita = nascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNascita() {
        return nascita;
    }

}
