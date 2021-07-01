import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Double mayornota=0.0;
        Double menornota=0.0;
        int i;
        Double nota=0.0;
        int repeticiones;
        ArrayList miarrar=new ArrayList();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Cuantas notas");
        repeticiones=entrada.nextInt();
        for(i = 1 ; i<= repeticiones ; i++){
            System.out.println("ingrese nota");
            nota=entrada.nextDouble();
            miarrar.add(nota);

            if(i==1){
                mayornota=nota;
                menornota=nota;
            }
            if(nota<menornota)
                menornota=nota;
            if(nota>mayornota)
                mayornota=nota;
        }
        System.out.println("el mayores es " +mayornota);
        System.out.println("la menor nota es "+menornota);
        Comparator<Double>comparador= Collections.reverseOrder();
        Collections.sort(miarrar,comparador);
        System.out.println(miarrar);

    }

}
