/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Vista.Frame1;
import java.awt.Color;

/**
 *
 * @author GHOST
 */
public class Principal {

    private static Frame1 f = new Frame1();

    public static void main(String[] args) {
        Principal p = new Principal();
        f.setVisible(true);

    }

    public void suma() {
        int a = Integer.parseInt(f.nA.getText());
        int b = Integer.parseInt(f.nB.getText());
        f.result.setText((a + b) + "");

    }

    public void resta() {
        int a = Integer.parseInt(f.nA.getText());
        int b = Integer.parseInt(f.nB.getText());
        f.result.setText((a - b) + "");

    }

    public void multi() {
        int a = Integer.parseInt(f.nA.getText());
        int b = Integer.parseInt(f.nB.getText());
        f.result.setText((a * b) + "");

    }

    public void divi() {
        f.result.setForeground(Color.BLACK);
        int a = Integer.parseInt(f.nA.getText());
        int b = Integer.parseInt(f.nB.getText());
        try {
            f.result.setText((a / b) + "");
        } catch (Exception e) {
            
            f.result.setText("divicion por cero");
            
        }
        

    }

}
