public class Docente extends Persona {
    private String materia;

    public Docente(String nome, String cognome, int nascita, String materia) {
        super(nome, cognome, nascita);
        setMateria(materia);
    }

    private void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
}
