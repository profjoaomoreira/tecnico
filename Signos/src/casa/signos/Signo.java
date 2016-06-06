/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa.signos;

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class Signo {

    public static void main(String[] Args) {
        String signo;
        int mes, dia;
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        mes = Integer.parseInt(JOptionPane.showInputDialog("Qual mês você nasceu?"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Qual dia você nasceu?"));
        if ((mes == 12) && (dia >= 22) && (dia <= 31)
                || (mes == 1) && (dia >= 1) && (dia <= 20)) {
            JOptionPane.showMessageDialog(null, "Você é de Capricórnio");
        } else if ((mes == 1) && (dia >= 21) && (dia <= 31)
                || (mes == 2) && (dia >= 1) && (dia <= 19)) {
            JOptionPane.showMessageDialog(null, "Você é de Aquário");
        } else if ((mes == 2) && (dia >= 20) && (dia <= 29)
                || (mes == 3) && (dia >= 1) && (dia <= 20)) {
            JOptionPane.showMessageDialog(null, "Você é de Peixes");
        } else if ((mes == 3) && (dia >= 21) && (dia <= 31)
                || (mes == 4) && (dia >= 1) && (dia <= 20)) {
            JOptionPane.showMessageDialog(null, "Você é de Áries");
        } else if ((mes == 4) && (dia >= 21) && (dia <= 30)
                || (mes == 5) && (dia >= 1) && (dia <= 20)) {
            JOptionPane.showMessageDialog(null, "Você é de Touro");
        } else if ((mes == 5) && (dia >= 21) && (dia <= 31)
                || (mes == 6) && (dia >= 1) && (dia <= 20)) {
            JOptionPane.showMessageDialog(null, "Você é de Gêmeos");
        } else if ((mes == 6) && (dia >= 21) && (dia <= 30)
                || (mes == 7) && (dia >= 1) && (dia <= 21)) {
            JOptionPane.showMessageDialog(null,"Você é de Cancêr");
        } else if ((mes == 7) && (dia >= 22) && (dia <= 31)
                || (mes == 8) && (dia >= 1) && (dia <= 22)) {
            JOptionPane.showMessageDialog(null,"Você é de Leão");
        } else if ((mes == 8) && (dia >= 23) && (dia <= 31)
                || (mes == 9) && (dia >= 1) && (dia <= 22)) {
            JOptionPane.showMessageDialog(null,"Você é de Virgem");
        } else if ((mes == 9) && (dia >= 23) && (dia <= 30)
                || (mes == 10) && (dia >= 1) && (dia <= 22)) {
            JOptionPane.showMessageDialog(null,"Você é de Libra");
        } else if ((mes == 10) && (dia >= 23) && (dia <= 31)
                || (mes == 11) && (dia >= 1) && (dia <= 21)) {
            JOptionPane.showMessageDialog(null,"Você é de Escorpião");
        } else if ((mes == 11) && (dia >= 22) && (dia <= 30)
                || (mes == 12) && (dia >= 1) && (dia <= 21)) {
            JOptionPane.showMessageDialog(null,"Você é de Sagitário");
        } else {
            JOptionPane.showMessageDialog(null,"Dia ou mês inválidos");
        }
    }

}
