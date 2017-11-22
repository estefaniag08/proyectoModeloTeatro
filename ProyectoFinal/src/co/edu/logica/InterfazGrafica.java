package co.edu.logica;


import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica {
	private PruebaComando ejecucionComando= new PruebaComando();	//Objeto del tipo comando
	//Todos los elementos que hacen parte de la interfaz gráfica
	public JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel panelComidas;
	private JPanel cPrincipal;
	private JLabel lblFondo_1;
	private JPanel panelBoletas;
	private JPanel bPrincipal;
	private JLabel lblFondo_2;
	private JPanel panelAtencionCliente;
	private JPanel aPrincipal;
	private JLabel lblFondo_3;
	private JLabel lblFondo;
	private JLabel lblGestinComida;
	private JLabel lblGestinBoletas;
	private JLabel lblGestinAtencinAl;
	private JLabel lblFondo_4;
	private JLabel lblGestinSalasY;
	private JPanel panelSalasEventos;
	private JPanel sPrincipal;
	private JButton btnSalasDeCine;
	private JButton btnCine;
	private JButton btnSillasVip;
	private JButton btnQuejasYReclamos;
	private JButton btnBaseDeDatos;
	private JButton btnPreparacinComida;
	private JButton btnPagoDeCuenta;
	private JButton btnPagoMonedaExtranjeraM;
	private JButton btnArmarCombo;
	private JButton btnRevisarPrecioPor;
	private JButton btnPagoMonedaExtranjera;
	private JButton btnGeneracinDeBoleta;
	private JButton btnMediosDePago;
	private JButton btnPromocionesBoleta;
	private JButton btnEstadoCliente;
	
	//Constructor
	public InterfazGrafica() {
		initialize();
	}
	/**Método que ejecutan los botones para realizar una accion que no conocen*/
	public void llamarComando(int opcionCom){
		ejecucionComando.ejecucionComponentes(opcionCom);
	}
	/**Inicializa los elementos de la interfaz grafica*/
	private void initialize() {
		
		frame = new JFrame();
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panelComidas = new JPanel();
		cPrincipal = new JPanel();
		lblFondo_1 = new JLabel("");
		panelBoletas = new JPanel();
		bPrincipal = new JPanel();
		lblFondo_2 = new JLabel("");
		panelAtencionCliente = new JPanel();
		aPrincipal = new JPanel();
		lblFondo_3 = new JLabel("");
		lblFondo = new JLabel("");
		btnPreparacinComida = new JButton("Preparaci\u00F3n comida");
		btnPagoDeCuenta = new JButton("Pago sin combo");
		btnArmarCombo = new JButton("Armar Combo");
		btnRevisarPrecioPor = new JButton("Precio por c\u00F3digo");
		lblGestinComida = new JLabel("GESTI\u00D3N COMIDA");
		btnPagoMonedaExtranjera = new JButton("Moneda extranjera");
		btnGeneracinDeBoleta = new JButton("Generaci\u00F3n de boleta");
		btnMediosDePago = new JButton("Medios de pago");
		btnPromocionesBoleta = new JButton("Promociones boleta");
		panelSalasEventos = new JPanel();
		lblGestinBoletas = new JLabel("GESTI\u00D3N BOLETAS");
		sPrincipal = new JPanel();
		btnSalasDeCine = new JButton("Historial salas");
		lblFondo_4 = new JLabel("");
		btnQuejasYReclamos = new JButton("Quejas y reclamos");
		btnCine = new JButton("Funciones Cine");
		btnSillasVip = new JButton("Sillas VIP");
		lblGestinSalasY = new JLabel("GESTI\u00D3N SALAS Y EVENTOS");
		btnBaseDeDatos = new JButton("Base de datos");
		btnEstadoCliente = new JButton("Estado Cliente");
		lblGestinAtencinAl = new JLabel("GESTI\u00D3N ATENCI\u00D3N AL CLIENTE");
		setCaracteristicas();
	}
	/**Asigna las caracteristicas graficas a los elementos de la interfaz*/
	private void setCaracteristicas(){
		frame.setBounds(100, 100, 797, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.getContentPane().setLayout(null);
		
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(106, 72, 574, 354);
		frame.getContentPane().add(tabbedPane);
		
		panelComidas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Gestion Comida", null, panelComidas, null);
		tabbedPane.setBackgroundAt(0, new Color(255, 255, 255));
		panelComidas.setLayout(null);
		
		cPrincipal.setBackground(new Color(250, 235, 215));
		cPrincipal.setBounds(0, 0, 569, 330);
		panelComidas.add(cPrincipal);
		cPrincipal.setLayout(null);
		
		btnPreparacinComida.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnPreparacinComida.setBounds(78, 112, 163, 37);
		btnPreparacinComida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llamarComando(2);
			}
		});
		cPrincipal.add(btnPreparacinComida);
		
		btnPagoDeCuenta.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnPagoDeCuenta.setBounds(78, 201, 163, 37);
		btnPagoDeCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llamarComando(3);
			}
		});
		cPrincipal.add(btnPagoDeCuenta);
		
		btnArmarCombo.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnArmarCombo.setBounds(316, 112, 163, 37);
		btnArmarCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(4);
			}
		});
		cPrincipal.add(btnArmarCombo);	
		
		btnRevisarPrecioPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llamarComando(0);
			}
		});
		btnRevisarPrecioPor.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnRevisarPrecioPor.setBounds(316, 201, 163, 37);
		cPrincipal.add(btnRevisarPrecioPor);
		
		lblGestinComida.setFont(new Font("Gabriola", Font.BOLD, 34));
		lblGestinComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinComida.setBounds(0, 0, 569, 84);
		cPrincipal.add(lblGestinComida);
		
		lblFondo_1.setIcon(new ImageIcon(InterfazGrafica.class.getResource("/Recursos/Fondot.png")));
		lblFondo_1.setBounds(0, 0, 569, 330);
		cPrincipal.add(lblFondo_1);
		
		panelBoletas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Gestion Boleta", null, panelBoletas, null);
		panelBoletas.setLayout(null);
		
		bPrincipal.setBounds(0, 0, 569, 326);
		panelBoletas.add(bPrincipal);
		bPrincipal.setLayout(null);
				
		btnPagoMonedaExtranjera.setBounds(71, 112, 163, 37);
		bPrincipal.add(btnPagoMonedaExtranjera);
		btnPagoMonedaExtranjera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(13);
			}
		});
		btnPagoMonedaExtranjera.setFont(new Font("Agency FB", Font.PLAIN, 20));
		
		btnGeneracinDeBoleta.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnGeneracinDeBoleta.setBounds(308, 112, 163, 37);
		btnGeneracinDeBoleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llamarComando(6);
			}
		});
		bPrincipal.add(btnGeneracinDeBoleta);
		
		btnMediosDePago.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnMediosDePago.setBounds(71, 194, 163, 37);
		btnMediosDePago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(5);
			}
		});
		bPrincipal.add(btnMediosDePago);
		
		btnPromocionesBoleta.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnPromocionesBoleta.setBounds(308, 194, 163, 37);
		btnPromocionesBoleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(1);
			}
		});
		bPrincipal.add(btnPromocionesBoleta);
		
		lblGestinBoletas.setBounds(0, 0, 569, 84);
		bPrincipal.add(lblGestinBoletas);
		lblGestinBoletas.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinBoletas.setFont(new Font("Gabriola", Font.BOLD, 34));
		
		lblFondo_2.setIcon(new ImageIcon(InterfazGrafica.class.getResource("/Recursos/Fondot.png")));
		lblFondo_2.setBounds(0, 0, 569, 326);
		bPrincipal.add(lblFondo_2);
		
		tabbedPane.addTab("Gestion Salas y Eventos", null, panelSalasEventos, null);
		panelSalasEventos.setLayout(null);
		
		sPrincipal.setBounds(0, 0, 569, 326);
		panelSalasEventos.add(sPrincipal);
		sPrincipal.setLayout(null);
		
		btnSalasDeCine.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnSalasDeCine.setBounds(203, 106, 163, 37);
		btnSalasDeCine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(7);
			}
		});
		sPrincipal.add(btnSalasDeCine);
		
		btnCine.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnCine.setBounds(86, 189, 163, 37);
		btnCine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llamarComando(9);
			}
		});
		sPrincipal.add(btnCine);
		
		
		lblGestinSalasY.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinSalasY.setFont(new Font("Gabriola", Font.BOLD, 34));
		lblGestinSalasY.setBounds(0, 0, 569, 84);
		sPrincipal.add(lblGestinSalasY);
		
		btnSillasVip.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnSillasVip.setBounds(323, 189, 163, 37);
		btnSillasVip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llamarComando(10);
			}
		});
		sPrincipal.add(btnSillasVip);
		
		lblFondo_4.setIcon(new ImageIcon(InterfazGrafica.class.getResource("/Recursos/Fondot.png")));
		lblFondo_4.setBounds(0, 0, 569, 326);
		sPrincipal.add(lblFondo_4);
		
		panelAtencionCliente.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Atencion al cliente", null, panelAtencionCliente, null);
		panelAtencionCliente.setLayout(null);
			
		aPrincipal.setBounds(0, 0, 569, 326);
		panelAtencionCliente.add(aPrincipal);
		aPrincipal.setLayout(null);
		
		
		btnQuejasYReclamos.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnQuejasYReclamos.setBounds(85, 129, 163, 37);
		btnQuejasYReclamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(12);
			}
		});
		aPrincipal.add(btnQuejasYReclamos);
		
		btnBaseDeDatos.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnBaseDeDatos.setBounds(322, 129, 163, 37);
		btnBaseDeDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(8);
			}
		});
		aPrincipal.add(btnBaseDeDatos);
		
		btnEstadoCliente.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnEstadoCliente.setBounds(208, 194, 163, 37);
		btnEstadoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarComando(11);
			}
		});
		aPrincipal.add(btnEstadoCliente);
		
		lblGestinAtencinAl.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinAtencinAl.setFont(new Font("Gabriola", Font.BOLD, 34));
		lblGestinAtencinAl.setBounds(0, 0, 569, 84);
		aPrincipal.add(lblGestinAtencinAl);
			
		lblFondo_3.setIcon(new ImageIcon(InterfazGrafica.class.getResource("/Recursos/Fondot.png")));
		lblFondo_3.setBounds(0, 0, 569, 326);
		aPrincipal.add(lblFondo_3);
		
		lblFondo.setIcon(new ImageIcon(InterfazGrafica.class.getResource("/Recursos/Fondo.png")));
		lblFondo.setBounds(0, 0, 781, 501);
		frame.getContentPane().add(lblFondo);
		
	}
}
