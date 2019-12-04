package beans;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Museo {
private Opera[] sala;
private String nome;
private int dimMaxSala;
private ArrayList<Opera>deposito;
//private Void carica;
//private int sposta;
//private String cerca;
//private String stampaSala;
//private String srampaDeposito;

    public Museo(String n ,int dimSala){
        this.nome=n;
        this.sala=new Opera[dimSala];
        this.deposito=new ArrayList<Opera>();
    }
    public void carica(Opera o){
        boolean p=true;
        for(int i =0;i<sala.length;i++){
    if (sala[i]==null){
        sala[i]=o;
        System.out.println("L'opera è stata messa in esposizione ");
        break;
    }
    p=false;
    }
    if(!p){
    deposito.add(o);
    System.out.println("L'opera è stata messa nel deposito");
                }
    }
    public void sposta(int p){
            deposito.add(sala[p]);
            sala[p].setEsposta(false);
            sala[p]=null;
    }
    public void cerca(String n){
        boolean v=true;
        for(int i = 0;i< deposito.size();i++){
            if (deposito.get(i).getTitolo().equals(n)){
                System.out.println("Opera trovata nel deposito");
                v=false;
                break;
            }
        }
        if (v){
            for(int x = 0;x< sala.length;x++){
                if (sala[x].getTitolo().equals(n)){
                    System.out.println("Opera trovata nella sala");
                    break;
                }else{
                    System.out.println("Opera non trovata");
                }
            }
        }
    }
    public void stampaSala(Opera[] sala){

        for(int i =0;i < sala.length;i++) {
            System.out.println("sono in stampaSala");
            if(sala[i] != null){
                System.out.println("stampo ogni singola posizione della sala occupata da un opera : "+ sala[i].toString());

            }
        }
    }

    public void stampaDeposito(){
        int i=0;
        System.out.println("I nomi delle opere presenti nel DEPOSITO sono:");
        for(i =0;i<deposito.size();i++){
            System.out.println("Posizione");
            deposito.get(i).toString();
        }

    }
    public void aggOpera(Opera o) {
        System.out.println("dimensione sala : "+ this.sala.length);
        for (int i=0; i < this.sala.length;i++){
            if (sala[i]==null){
                sala[i]=o;
                System.out.println("opera inserita con successo");
                break;
            }else{
              continue;
            }
        }
    }

    public Opera[] getSala() {
        return sala;
    }

    public void setSala(Opera[] sala) {
        this.sala = sala;
    }

    public ArrayList<Opera> getDeposito() {
        return deposito;
    }

    public void setDeposito(ArrayList<Opera> deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
        return "Museo{" +
                "sala=" + Arrays.toString(sala) +
                ", nome='" + nome + '\'' +
                ", dimMaxSala=" + dimMaxSala +
                ", deposito=" + deposito +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDimMaxSala() {
        return dimMaxSala;
    }
    public void setDimMaxSala(int dimMaxSala) {
        this.dimMaxSala = dimMaxSala;
    }

}
