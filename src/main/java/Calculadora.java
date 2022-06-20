//GIOVANNI ROMANO NETO 2144018

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora{

    private static Operacoes operacoes = new Operacoes();

    public static void main(String arg[]){
        String x=""; String y=""; String operador="";
        int result=0;

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);


        System.out.println("\nDigite o  primeiro valor: ");
        try{
            x = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro!");
        }

        System.out.println("\n || MENU DE OPERACOES || ");
        System.out.println("\n 1 - SOMA \n 2 - SUBTRACAO \n 3 - DIVISAO \n 4 - MULTIPLICACAO ");

        System.out.println("\nDigite o  numero da operacao: ");
        try{
            operador = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro!");
        }

        System.out.println("\nDigite o  segundo valor: ");
        try{
            y = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro!");
        }

        float v1 = Float.parseFloat(x);
        float v2 = Float.parseFloat(y);
        int op = Integer.parseInt(operador);

        switch(op){
            case 1:
                System.out.println("\n\nResultado: "+operacoes.soma(v1,v2));
                break;
            case 2:
                System.out.println("\n\nResultado: "+operacoes.subtracao(v1,v2));
                break;
            case 3:
                System.out.println("\n\nResultado: "+operacoes.divisao(v1,v2));
                break;
            case 4:
                System.out.println("\n\nResultado: "+operacoes.multiplicacao(v1,v2));
                break;
            default:
                System.out.println("\n\n ERRO! NUMERO DA OPERACAO NAO CADASTRADO!!");
        }

    }
}