/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

/**
 *
 * @author Jovro
 */
//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).
import java.util.Scanner;
public class Atividade1 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       int horas;
       int minutos;
       int minutosDia = 0;
       int horasDia = 0;
       int total;
       
       System.out.print("Digite somente a hora atual: ");
       horas = input.nextInt();
       
       System.out.print("Digite somente os minutos atual: ");
       minutos = input.nextInt();
       
       minutosDia = minutos;
       horasDia = horas * 60;
       total = horasDia + minutosDia;
       
       System.out.print("Hoje ja se passaram " +  total + " minutos.");
       
       input.close();
       
    }
}
