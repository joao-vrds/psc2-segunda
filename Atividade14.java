/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade14;

/**
 *
 * @author Jovro
 */
//Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 
import java.util.Scanner;
import java.text.DecimalFormat;


public class Atividade14
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        
        int p1x1 = 0;
        int p1y1 = 0;
        int p2x2 = 0;
        int p2y2 = 0;
        
        double potenciaP1 = 0;
        double potenciaP2 = 0;
        double resultado = 0;
        
        System.out.print("Digite o valor de x1 de P1: ");
        p1x1 = input.nextInt();
        System.out.print("Digite o valor de y1 de P1: ");
        p1y1 = input.nextInt();
        
        System.out.print("\n\n");
        
        System.out.print("Digite o valor de x2 de P2: ");
        p2x2 = input.nextInt();
        System.out.print("Digite o valor de y2 de P2: ");
        p2y2 = input.nextInt();
        
        potenciaP1 = (Math.pow((p1x1 - p2x2), 2));
        potenciaP2 = (Math.pow((p1y1 - p2y2), 2));

        resultado = Math.sqrt(potenciaP1 + potenciaP2);
        
        System.out.print("A distância entre P1 e P2 é igual à " + df.format(resultado));
        
        input.close();
    }
}
