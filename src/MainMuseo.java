import beans.Opera;
import beans.Museo;
import beans.Quadro;
import beans.Statua;

import java.util.Scanner;
import java.util.Scanner.*;
public class MainMuseo {
    public static void main(String argv[]){


        int scelta,g,p,sQ;
        String n,m,t,x,au,ti;
        double a;
        Scanner Tastiera= new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Crea il tuo Museo ");
        System.out.println("********************");

        System.out.println("Inserisci il nome del museo:");
        n=Tastiera.nextLine();
        System.out.println("Inserisci la grandezza del museo:");
        g=Tastiera.nextInt();
       Museo mioMuseo= new Museo( n, g);

       do {
           System.out.println("********************");
           System.out.println("Premi 1 per inserire una opera ");
           System.out.println("Premi 2 per sopstare un oper dalla sala al museo");
           System.out.println("Premi 3 per cercare un opera ");
           System.out.println("Premi 4 per vedere le opere presenti nella sala ");
           System.out.println("Premi 5 per vedere le opere presenti nella deposito ");
           System.out.println("Premi 6 per uscire ");
           System.out.println("********************");

           scelta= Tastiera.nextInt();

           switch (scelta){

               case 1:
                   System.out.println("Cosa vuoi inserie una Statua[1] o un Quadro[2]?");
                   sQ= Tastiera.nextInt();
                   if(sQ==1){
                       System.out.println("Inserisci l'autore :");
                         au=Tastiera.next();
                       System.out.println("Inserisci il Titolo della statua:");
                         ti=Tastiera.next();
                       System.out.println("Inserisci il materiale:");
                       m=Tastiera.next();
                       System.out.println("Inserisci l'altezza della statua:");
                       a=Tastiera.nextDouble();
                       Opera miaOpera=new Statua(au,ti,m,a);
                      mioMuseo.aggOpera(miaOpera);
                      Opera[] salaDelMioMuseo = mioMuseo.getSala();
                      mioMuseo.stampaSala(salaDelMioMuseo);
                      //In alternativa puoi usare direttamente il toString :
                       System.out.println("stampo la sala tramite toString : "+ salaDelMioMuseo.toString());
                   }else{
                       System.out.println("Inserisci l'autore :");
                       au=Tastiera.next();
                       System.out.println("Inserisci il Titolo del quadro:");
                       ti=Tastiera.next();
                       System.out.println("Inserisci la tecnica");
                       t=Tastiera.next();
                    Opera mioOuadro=new Quadro(au,ti,t);
                       mioMuseo.aggOpera(mioOuadro);
                   }
                   break;
               case 2:
                   //mioMuseo.stampaSala();
                   System.out.println("Inserisci l'opera da spostare:");
                   p=Tastiera.nextInt();
                   mioMuseo.sposta(p);
                   break;
               case 3:
                   System.out.println("Inserisci il titolo dell'opera:");
                   x=Tastiera.next();
                   mioMuseo.cerca(x);
                   break;
               case 4:

                       //mioMuseo.stampaSala();

                   //mioMuseo.stampaSala();
                   break;
               case 5:
                   mioMuseo.stampaDeposito();
                   break;
           }
       }while (scelta!=6);

    }

}
