package beans;

public class Quadro extends Opera {

    private String tecnica;

    public Quadro(){

    }
    public Quadro(String autore, String titolo, String tecnica) {
        super(autore, titolo);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "tecnica='" + tecnica + '\'' +
                '}';
    }
}


