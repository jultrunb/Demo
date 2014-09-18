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
        try {
            float a = Float.parseFloat(f.nA.getText());
            float b = Float.parseFloat(f.nB.getText());
            f.result.setText((a + b) + "");
        } catch (NumberFormatException ex) {
            f.result.setText("formato no compatible");
        }

    }

    public void resta() {
        try {
            float a = Float.parseFloat(f.nA.getText());
            float b = Float.parseFloat(f.nB.getText());
            f.result.setText((a - b) + "");
        } catch (NumberFormatException ex) {
            f.result.setText("formato no compatible");
        }

    }

    public void multi() {

        try {
            float a = Float.parseFloat(f.nA.getText());
            float b = Float.parseFloat(f.nB.getText());
            f.result.setText((a * b) + "");
        } catch (NumberFormatException ex) {
            f.result.setText("formato no compatible");
        }

    }

    public void divi() {

        try {
            float a = Float.parseFloat(f.nA.getText());
            float b = Float.parseFloat(f.nB.getText());
            f.result.setText((a / b) + "");
        } catch (ArithmeticException ex) {

            f.result.setText("divicion por cero");

        } catch (NumberFormatException ex) {
            f.result.setText("formato no compatible");
        }

    }

}
