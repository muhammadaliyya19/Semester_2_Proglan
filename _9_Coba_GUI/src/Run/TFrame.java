/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import java.awt.*;
import java.awt.event.*;
public class TFrame extends Frame {
Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
Button btnHasil;
public TFrame(){
setLayout(null);
lbJudul = new Label("Hitung Nilai Akhir");
lbJudul.setFont(new Font("Arial", 1, 14));
add(lbJudul);
lbJudul.setBounds(100, 30, 170, 20);
lbTugas = new Label("Tugas : ");
add(lbTugas);
lbTugas.setBounds(100, 60, 62, 20);
lbKuis = new Label("Kuis : ");
add(lbKuis);
lbKuis.setBounds(100, 90, 70, 20);
lbUTS = new Label("UTS : ");
add(lbUTS);
lbUTS.setBounds(100, 120, 70, 20);
lbUAS = new Label("UAS : ");
add(lbUAS);
lbUAS.setBounds(100, 150, 70, 20);
lbHasil = new Label("Hasil : ");
add(lbHasil);
lbHasil.setBounds(100, 180, 70, 20);
txtTugas = new TextField("0");
add(txtTugas);
txtTugas.setBounds(200, 60, 60, 20);
txtKuis = new TextField("0");
add(txtKuis);
txtKuis.setBounds(200, 90, 60, 20);
txtUTS = new TextField("0");
add(txtUTS);
txtUTS.setBounds(200, 120, 60, 20);
txtUAS = new TextField("0");
add(txtUAS);
txtUAS.setBounds(200, 150, 60, 20);
txtHasil = new TextField("0");
add(txtHasil);
txtHasil.setBounds(200, 180, 60, 20);
btnHasil = new Button("Hitung");
add(btnHasil);
btnHasil.setBounds(120, 200, 100, 20);
btnHasil.addActionListener(new mainAction());
}

class mainAction implements ActionListener {
public void actionPerformed(ActionEvent event) {
int tugas =
Integer.parseInt(txtTugas.getText().trim());
int kuis =
Integer.parseInt(txtKuis.getText().trim());
int UTS =
Integer.parseInt(txtUTS.getText().trim());
int UAS =
Integer.parseInt(txtUAS.getText().trim());
String hasil =
String.valueOf(tugas/4+kuis/4+UTS/4+UAS/4);
txtHasil.setText(hasil);
}
}
}