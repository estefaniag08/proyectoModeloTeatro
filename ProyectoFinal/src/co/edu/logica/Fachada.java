package co.edu.logica;

import java.awt.EventQueue;
import java.util.ArrayList;

import co.edu.logica.comandoComponentes.*;

public class Fachada {
		
	
	public void inicializarInterfaz(){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();	
				}
			}
		});	
	}
	
}
