package beans;

import java.util.ArrayList;

public abstract class Opera {


    private String autore;
    private String titolo;
    private boolean esposta;

    public Opera(){
        this.esposta= false;
    }
    public Opera(String autore, String titolo) {
        this.autore = autore;
        this.titolo = titolo;
    }

    public void Esponi(){

        setEsposta(false);

    }
    public void Riponi(){
        setEsposta(true);
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public boolean isEsposta() {
        return esposta;
    }

    public void setEsposta(boolean esposta) {
        this.esposta = esposta;
    }


    @Override
    public String toString() {
        return "Opera{" +
                "autore='" + autore + '\'' +
                ", titolo='" + titolo + '\'' +
                ", esposta=" + esposta +
                '}';
    }

}
