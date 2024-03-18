/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade7;

/**
 *
 * @author Jovro
 */
//Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade7
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####0.00");
        
        double larguraDaArea = 0;
        double comprimentoDaArea = 0;
        double larguraDaCeramica = 0;
        double comprimentoDaCeramica = 0;
        double valorDaCeramica = 0;
        double valorTotal = 0;
        
        System.out.print("Digite o valor da largura do local em M: ");
        larguraDaArea = input.nextDouble();
        
        System.out.print("Digite o valor do comprimento do local em M: ");
        comprimentoDaArea = input.nextDouble();
        
        System.out.print("Digite o valor da largura da cerâmica em M: ");
        larguraDaCeramica = input.nextDouble();
        
        System.out.print("Digite o valor do comprimnto da cerâmica em M: ");
        comprimentoDaCeramica = input.nextDouble();
        
        System.out.print("Digite o valor do metro quadrado da cerâmica: ");
        valorDaCeramica = input.nextDouble();
        
        
        
        double area = (larguraDaArea * comprimentoDaArea) * 1.10;
        double areaDaCeramica = larguraDaCeramica * comprimentoDaCeramica;
        double quantidadeDeCeramica = (area / areaDaCeramica);
        valorTotal = valorDaCeramica * area;
        
        
        System.out.print("Você terá de comprar " + Math.round(quantidadeDeCeramica) + " peças que são " + df.format(area) + "m^2 que custará o total de R$ " + df.format(valorTotal));
        
        input.close();
    }
}

