import java.util.ArrayList;

public class Scuola {
    public static void main(String args[]) {

        Studente studente1 = new Studente("Claudia", "Andriani", 1992, 5, 'G', "");
        Studente studente2 = new Studente("Antonio", "Piga", 1993, 5, 'A', "");

        Docente docente1 = new Docente("Nunzio", "Castagnaro", 1992, "Informatica");
        Docente docente2 = new Docente("Giacomo", "Luparelli", 1991, "Educazione Fisica");

        ArrayList<Studente> Studenti = new ArrayList<>();
        ArrayList<Docente> Docenti = new ArrayList<>();

        Studenti.add(studente1);
        Studenti.add(studente2);

        Docenti.add(docente1);
        Docenti.add(docente2);

        System.out.println("\n***** Elenco studenti *****\n");

        for (int i = 0; i < Studenti.size(); i++) {
            if (Studenti.get(i).getNascita() == 0 || Studenti.get(i).getClasse() == 0) {
                Studenti.remove(i);
                System.out.println("I dati inseriti per uno studente non sono corretti, riprovare!");
            }

            System.out.println("Lo studente " + Studenti.get(i).getNome() + " " + Studenti.get(i).getCognome() + ", " + "nato/a nel " + Studenti.get(i).getNascita() + " frequenta la classe " + Studenti.get(i).getClasse() + "^ sez. " + Studenti.get(i).getSezione() + " con n° di matricola " + Studenti.get(i).getMatricola());
        }
        System.out.println();

        System.out.println("***** Elenco docenti *****\n");

        for (int i = 0; i < Docenti.size(); i++) {
            if (Docenti.get(i).getNascita() == 0) {
                Docenti.remove(i);
                System.out.println("L'anno di nascita di un docente non e' corretto, riprovare!");
            }

            System.out.println("Il docente " + Docenti.get(i).getNome() + " " + Docenti.get(i).getCognome() + ", " + "nato/a nel " + Docenti.get(i).getNascita() + " insegna la materia " + Docenti.get(i).getMateria());
        }
    }
}
