import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

public class Calculadora extends Frame implements ActionListener{
	TextField txt;
	Button salir;
	
	
	String[] signo = {"+", "-", "x", "/", "^"};
	Panel pSignos, pNumeros, pSuperior;
	Button[]  numeros, signos;
	public Calculadora() {
		
		
		
		this.setSize(250,300);
		this.setVisible(true);	
	
		numeros = new Button[11];
		signos = new Button[6];
		
		
		salir = new Button("x");
		txt = new TextField();
		
		
		
		pNumeros = new Panel();
		pSignos = new Panel();
		pSuperior = new Panel();
		pSuperior.setLayout(new BorderLayout());
		pNumeros.setLayout(new GridLayout(4, 3));
		
		
		
		pSuperior.add(txt, BorderLayout.CENTER); // DERECHA
		pSuperior.add(salir, BorderLayout.EAST); // IZQUIERDA
		salir.addActionListener(this);		
		
		
		for(int i = 9; i >= 0; i--) {
			numeros[i] = new Button(String.valueOf(i));
			pNumeros.add(numeros[i]);
		}
		numeros[10] = new Button("=");
		pNumeros.add(numeros[10] );
		int j=0;
		for(String i: signo) {
			signos[j] = new Button(i);
			j++;
		}
		
		
		pSignos.setLayout(new GridLayout(5,1));
		
		
		for(int i = 0; i <5; i++) {
			pSignos.add(signos[i]);
		}
		
		
		
		this.add(pSignos, BorderLayout.EAST); 
		this.add(pNumeros, BorderLayout.CENTER);
		this.add(pSuperior, BorderLayout.NORTH);
		
		
		pulsar();
		
		
	}
	private void pulsar() {
		for(int i = 0; i <= 10; i++) {
			numeros[i].addActionListener(this);
		}
		for(int i = 0; i < 5; i++) {
			signos[i].addActionListener(this);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.print(e.getActionCommand());
		if(e.getSource().equals(salir)) {
			System.exit(0);
		}
		if(e.getSource() != (signos)) {
			txt.setText(e.getActionCommand());
		}
		
		
	}

	
}
