/** 
	Author: TechOGR
	
	Gmail: onelguilarte858@gmail.com
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton btn_exit, btn_min, btn_ciento, btn_exp, btn_clear,btn_igual, btn_dividir, btn_multi, btn_suma, btn_resta,
					btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_punto, btn_oscuro, btn_claro;
	private JLabel  label_calculos1, label_calculos, label_resultado, label_algo;
	protected boolean punto = true;

	String valor1, valor2, simbolos, contenido;
	float resultado;
	String todo = "";
/*
 this.setExtendedState(ICONIFIED);
*/
	public Panel(){
		setLayout(null);
		getContentPane().setBackground(Color.black);
		setIconImage(new ImageIcon(getClass().getResource("img/icon.png")).getImage());
		setUndecorated(true);

		btn_exit = new JButton();
		btn_exit.setBounds(0,0,15,15);
		btn_exit.setBackground(new Color(255,0,0));
		btn_exit.addActionListener(this);
		btn_exit.setBorder(null);
		btn_exit.setBorderPainted(false);
		add(btn_exit);

		btn_min = new JButton();
		btn_min.setBounds(20,0,15,15);
		btn_min.setBackground(new Color(255,255,0));
		btn_min.addActionListener(this);
		btn_min.setBorder(null);
		btn_min.setBorderPainted(false);
		add(btn_min);


		label_calculos = new JLabel();
		label_calculos.setBounds(50,10,200,30);
		label_calculos.setHorizontalAlignment(SwingConstants.RIGHT);
		label_calculos.setFont(new Font("Tahoma", 1, 20));
		label_calculos.setForeground(Color.white);
		add(label_calculos);

		label_resultado = new JLabel();
		label_resultado.setBounds(0,75,248,30);
		label_resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		label_resultado.setFont(new Font("Tahoma", 1, 30));
		label_resultado.setForeground(Color.white);
		add(label_resultado);

		label_calculos1 = new JLabel();
		label_calculos1.setBounds(10,75,90,10);
		label_calculos1.setForeground(Color.black);
		add(label_calculos1);

		panel = new JPanel();
		panel.setBounds(0,0,250,115);
		panel.setBackground(Color.black);
		add(panel);

		label_algo = new JLabel("___________________________________________");
		label_algo.setBounds(0,100,300,20);
		label_algo.setForeground(Color.white);
		add(label_algo);

		btn_clear = new JButton();
		btn_clear.setBounds(10,130,40,40);
		btn_clear.setBorder(null);
		btn_clear.setBorderPainted(false);
		btn_clear.setIcon(new ImageIcon("img/btn_clear.png"));
		btn_clear.setBackground(Color.black);
		btn_clear.setRolloverIcon(new ImageIcon("img/btn_clear_roll.png"));
		btn_clear.setPressedIcon(new ImageIcon("img/btn_clear_pressed.png"));
		btn_clear.addActionListener(this);
		add(btn_clear);

		btn_ciento = new JButton();
		btn_ciento.setBounds(70,130,40,40);
		btn_ciento.setBackground(Color.black);
		btn_ciento.setBorder(null);
		btn_ciento.setBorderPainted(false);
		btn_ciento.setIcon(new ImageIcon("img/btn_ciento.png"));
		btn_ciento.setPressedIcon(new ImageIcon("img/btn_ciento_pressed.png"));
		btn_ciento.setRolloverIcon(new ImageIcon("img/btn_ciento_roll.png"));
		btn_ciento.addActionListener(this);
		add(btn_ciento);

		btn_exp = new JButton();
		btn_exp.setBounds(140,130,40,40);
		btn_exp.setBackground(Color.black);
		btn_exp.setIcon(new ImageIcon("img/btn_exp.png"));
		btn_exp.setPressedIcon(new ImageIcon("img/btn_exp_pressed.png"));
		btn_exp.setRolloverIcon(new ImageIcon("img/btn_exp_roll.png"));
		btn_exp.setBorder(null);
		btn_exp.setBorderPainted(false);
		btn_exp.addActionListener(this);
		add(btn_exp);

		btn_dividir = new JButton();
		btn_dividir.setBounds(200,130,40,40);
		btn_dividir.setBackground(Color.black);
		btn_dividir.setIcon(new ImageIcon("img/btn_division.png"));
		btn_dividir.setPressedIcon(new ImageIcon("img/btn_division_pressed.png"));
		btn_dividir.setRolloverIcon(new ImageIcon("img/btn_division_roll.png"));
		btn_dividir.setBorder(null);
		btn_dividir.setBorderPainted(false);
		btn_dividir.addActionListener(this);
		add(btn_dividir);

		btn_multi = new JButton();
		btn_multi.setBounds(200,190,40,40);
		btn_multi.setBackground(Color.black);
		btn_multi.setIcon(new ImageIcon("img/btn_multi.png"));
		btn_multi.setPressedIcon(new ImageIcon("img/btn_multi_pressed.png"));
		btn_multi.setRolloverIcon(new ImageIcon("img/btn_multi_roll.png"));
		btn_multi.setBorder(null);
		btn_multi.setBorderPainted(false);
		btn_multi.addActionListener(this);
		add(btn_multi);

		btn_resta = new JButton();
		btn_resta.setBounds(200,235,40,40);
		btn_resta.setBackground(Color.black);
		btn_resta.setIcon(new ImageIcon("img/btn_resta.png"));
		btn_resta.setPressedIcon(new ImageIcon("img/btn_resta_pressed.png"));
		btn_resta.setRolloverIcon(new ImageIcon("img/btn_resta_roll.png"));
		btn_resta.setBorder(null);
		btn_resta.setBorderPainted(false);
		btn_resta.addActionListener(this);
		add(btn_resta);

		btn_suma = new JButton();
		btn_suma.setBounds(200,280,40,40);
		btn_suma.setBackground(Color.black);
		btn_suma.setIcon(new ImageIcon("img/btn_suma.png"));
		btn_suma.setPressedIcon(new ImageIcon("img/btn_suma_pressed.png"));
		btn_suma.setRolloverIcon(new ImageIcon("img/btn_suma_roll.png"));
		btn_suma.setBorder(null);
		btn_suma.setBorderPainted(false);
		btn_suma.addActionListener(this);
		add(btn_suma);

		btn_igual = new JButton();
		btn_igual.setBounds(200,335,40,40);
		btn_igual.setBackground(Color.black);
		btn_igual.setIcon(new ImageIcon("img/btn_igual.png"));
		btn_igual.setPressedIcon(new ImageIcon("img/btn_igual_pressed.png"));
		btn_igual.setBorder(null);
		btn_igual.setBorderPainted(false);
		btn_igual.addActionListener(this);
		add(btn_igual);

		btn7 = new JButton();
		btn7.setBounds(10,190,40,40);
		btn7.setBackground(Color.black);
		btn7.setIcon(new ImageIcon("img/7.png"));
		btn7.setPressedIcon(new ImageIcon("img/7_pressed.png"));
		btn7.setRolloverIcon(new ImageIcon("img/7_roll.png"));
		btn7.setBorder(null);
		btn7.setBorderPainted(false);
		btn7.addActionListener(this);
		add(btn7);

		btn8 = new JButton();
		btn8.setBounds(70,190,40,40);
		btn8.setBackground(Color.black);
		btn8.setIcon(new ImageIcon("img/8.png"));
		btn8.setPressedIcon(new ImageIcon("img/8_pressed.png"));
		btn8.setRolloverIcon(new ImageIcon("img/8_roll.png"));
		btn8.setBorder(null);
		btn8.setBorderPainted(false);
		btn8.addActionListener(this);
		add(btn8);

		btn9 = new JButton();
		btn9.setBounds(140,190,40,40);
		btn9.setBackground(Color.black);
		btn9.setIcon(new ImageIcon("img/9.png"));
		btn9.setPressedIcon(new ImageIcon("img/9_pressed.png"));
		btn9.setRolloverIcon(new ImageIcon("img/9_roll.png"));
		btn9.setBorder(null);
		btn9.setBorderPainted(false);
		btn9.addActionListener(this);
		add(btn9);

		btn4 = new JButton();
		btn4.setBounds(10,235,40,40);
		btn4.setBackground(Color.black);
		btn4.setIcon(new ImageIcon("img/4.png"));
		btn4.setPressedIcon(new ImageIcon("img/4_pressed.png"));
		btn4.setRolloverIcon(new ImageIcon("img/4_roll.png"));
		btn4.setBorder(null);
		btn4.setBorderPainted(false);
		btn4.addActionListener(this);
		add(btn4);

		btn5 = new JButton();
		btn5.setBounds(70,235,40,40);
		btn5.setBackground(Color.black);
		btn5.setIcon(new ImageIcon("img/5.png"));
		btn5.setPressedIcon(new ImageIcon("img/5_pressed.png"));
		btn5.setRolloverIcon(new ImageIcon("img/5_roll.png"));
		btn5.setBorder(null);
		btn5.setBorderPainted(false);
		btn5.addActionListener(this);
		add(btn5);

		btn6 = new JButton();
		btn6.setBounds(140,235,40,40);
		btn6.setBackground(Color.black);
		btn6.setIcon(new ImageIcon("img/6.png"));
		btn6.setPressedIcon(new ImageIcon("img/6_pressed.png"));
		btn6.setRolloverIcon(new ImageIcon("img/6_roll.png"));
		btn6.setBorder(null);
		btn6.setBorderPainted(false);
		btn6.addActionListener(this);
		add(btn6);

		btn1 = new JButton();
		btn1.setBounds(10,280,40,40);
		btn1.setBackground(Color.black);
		btn1.setIcon(new ImageIcon("img/1.png"));
		btn1.setPressedIcon(new ImageIcon("img/1_pressed.png"));
		btn1.setRolloverIcon(new ImageIcon("img/1_roll.png"));
		btn1.setBorder(null);
		btn1.setBorderPainted(false);
		btn1.addActionListener(this);
		add(btn1);

		btn2 = new JButton();
		btn2.setBounds(70,280,40,40);
		btn2.setBackground(Color.black);
		btn2.setIcon(new ImageIcon("img/2.png"));
		btn2.setPressedIcon(new ImageIcon("img/2_pressed.png"));
		btn2.setRolloverIcon(new ImageIcon("img/2_roll.png"));
		btn2.setBorder(null);
		btn2.setBorderPainted(false);
		btn2.addActionListener(this);
		add(btn2);

		btn3 = new JButton();
		btn3.setBounds(140,280,40,40);
		btn3.setBackground(Color.black);
		btn3.setIcon(new ImageIcon("img/3.png"));
		btn3.setPressedIcon(new ImageIcon("img/3_pressed.png"));
		btn3.setRolloverIcon(new ImageIcon("img/3_roll.png"));
		btn3.setBorder(null);
		btn3.setBorderPainted(false);
		btn3.addActionListener(this);
		add(btn3);

		btn0 = new JButton();
		btn0.setBounds(140,335,40,40);
		btn0.setBackground(Color.black);
		btn0.setIcon(new ImageIcon("img/0.png"));
		btn0.setPressedIcon(new ImageIcon("img/0_pressed.png"));
		btn0.setRolloverIcon(new ImageIcon("img/0_roll.png"));
		btn0.setBorder(null);
		btn0.setBorderPainted(false);
		btn0.addActionListener(this);
		add(btn0);

		btn_punto = new JButton();
		btn_punto.setBounds(70,335,40,40);
		btn_punto.setBackground(Color.black);
		btn_punto.setIcon(new ImageIcon("img/punto.png"));
		btn_punto.setPressedIcon(new ImageIcon("img/punto_pressed.png"));
		btn_punto.setRolloverIcon(new ImageIcon("img/punto_roll.png"));
		btn_punto.setBorder(null);
		btn_punto.setBorderPainted(false);
		btn_punto.addActionListener(this);
		add(btn_punto);

		btn_claro = new JButton();
		btn_claro.setBounds(10,335,40,40);
		btn_claro.setBackground(Color.black);
		btn_claro.setIcon(new ImageIcon("img/claro.png"));
		btn_claro.setPressedIcon(new ImageIcon("img/claro.png"));
		btn_claro.setRolloverIcon(new ImageIcon("img/claro_roll.png"));
		btn_claro.setBorder(null);
		btn_claro.setBorderPainted(false);
		btn_claro.addActionListener(this);
		add(btn_claro);

		btn_oscuro = new JButton();
		btn_oscuro.setBounds(10,335,40,40);
		btn_oscuro.setBackground(Color.white);
		btn_oscuro.setIcon(new ImageIcon("img/oscuro.png"));
		btn_oscuro.setPressedIcon(new ImageIcon("img/oscuro.png"));
		btn_oscuro.setRolloverIcon(new ImageIcon("img/oscuro_roll.png"));
		btn_oscuro.setBorder(null);
		btn_oscuro.setBorderPainted(false);
		btn_oscuro.addActionListener(this);
		btn_oscuro.setEnabled(false);
		add(btn_oscuro);

	}

	public void actionPerformed(ActionEvent click){
		if(click.getSource() == btn_claro){
			Claro();
		}
		if(click.getSource() == btn_oscuro){
			Oscuro();
		}

		if(click.getSource() == btn0){
			label_calculos1.setText(label_calculos1.getText().toString() + "0");
			todo += "0";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn1){
			label_calculos1.setText(label_calculos1.getText().toString() + "1");
			todo += "1";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn2){
			label_calculos1.setText(label_calculos1.getText().toString() + "2");
			todo += "2";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn3){
			label_calculos1.setText(label_calculos1.getText().toString() + "3");
			todo += "3";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn4){
			label_calculos1.setText(label_calculos1.getText().toString() + "4");
			todo += "4";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn5){
			label_calculos1.setText(label_calculos1.getText().toString() + "5");
			todo += "5";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn6){
			label_calculos1.setText(label_calculos1.getText().toString() + "6");
			todo += "6";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn7){
			label_calculos1.setText(label_calculos1.getText().toString() + "7");
			todo += "7";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn8){
			label_calculos1.setText(label_calculos1.getText().toString() + "8");
			todo += "8";
			label_calculos.setText(todo);
		} else if(click.getSource() == btn9){
			label_calculos1.setText(label_calculos1.getText().toString() + "9");
			todo += "9";
			label_calculos.setText(todo);
		}
		if(click.getSource() == btn_suma){
			if(!label_calculos1.getText().equals("")){
				valor1 = label_calculos1.getText();
				simbolos = "+";
				label_calculos1.setText("");
				todo += "+";
				label_calculos.setText(todo);
			}
		} else if(click.getSource() == btn_resta){
			if(!label_calculos1.getText().equals("")){
				valor1 = label_calculos1.getText();
				simbolos = "-";
				label_calculos1.setText("");
				todo += "-";
				label_calculos.setText(todo);
			}
		} else if(click.getSource() == btn_dividir){
			if(!label_calculos1.getText().equals("")){
				valor1 = label_calculos1.getText();
				simbolos = "/";
				label_calculos1.setText("");
				todo += "/";
				label_calculos.setText(todo);
			}
		} else if(click.getSource() == btn_multi){
			if(!label_calculos1.getText().equals("")){
				valor1 = label_calculos1.getText();
				simbolos = "*";
				label_calculos1.setText("");
				todo += "*";
				label_calculos.setText(todo);
			}
		} else if(click.getSource() == btn_punto){
			contenido = label_calculos1.getText();
			if(contenido.length() <= 0){
				label_calculos1.setText("0.");
				todo += "0.";
				label_calculos.setText(todo);
			} else {
				if(label_calculos1.getText().contains(".")){

				} else {
					label_calculos1.setText(label_calculos1.getText() + ".");
					todo += ".";
					label_calculos.setText(todo);
					punto = false;
				}
			}
		} else if(click.getSource() == btn_exp){
			if(!label_calculos1.getText().equals("")){
				valor1 = label_calculos1.getText();
				simbolos = "^";
				label_calculos1.setText("");
				todo += "^";
				label_calculos.setText(todo);
			}
		} else if(click.getSource() == btn_ciento){
			if(!label_calculos1.getText().equals("")){
				valor1 = label_calculos1.getText();
				simbolos = "%";
				label_calculos1.setText("");
				todo += "%";
				label_calculos.setText(todo);
			}
		}
		if(click.getSource() == btn_igual){
			String resultado_total;
			valor2 = label_calculos1.getText();
			if(!valor2.equals("")){
				resultado_total = operaciones(valor1, valor2, simbolos);
				label_calculos1.setText(resultado_total);
				label_resultado.setText(resultado_total);
			}
	    }

		if(click.getSource() == btn_clear){
			label_calculos.setText("");
			label_resultado.setText("");
			label_calculos1.setText("");
			todo = "";
		}
		if(click.getSource() == btn_min){
			this.setExtendedState(ICONIFIED);
		}
		if(click.getSource() == btn_exit){
			System.exit(0);
		}
	}

	public static String operaciones(String valor1, String valor2, String simbolos){
		Double resultadocalc = 0.0;
		// Double es1 = 100.0, es2 = 0.0;
		String respuesta;

		if(simbolos.equals("+")){
			resultadocalc = Double.parseDouble(valor1) + Double.parseDouble(valor2);
		} else if(simbolos.equals("-")){
			resultadocalc = Double.parseDouble(valor1) - Double.parseDouble(valor2);
		} else if(simbolos.equals("*")){
			resultadocalc = Double.parseDouble(valor1) * Double.parseDouble(valor2);
		} else if(simbolos.equals("/")){
			resultadocalc = Double.parseDouble(valor1) / Double.parseDouble(valor2);
		} else if(simbolos.equals("^")){
			resultadocalc = Math.pow(Double.parseDouble(valor1), Double.parseDouble(valor2));
		} else if(simbolos.equals("%")){
			resultadocalc = (Double.parseDouble(valor1) * Double.parseDouble(valor1));
		}
		respuesta = String.valueOf(resultadocalc);
		return respuesta;
	}

	public void Oscuro(){
		btn_oscuro.setEnabled(false);
		btn_oscuro.setVisible(false);
		btn_claro.setEnabled(true);
		btn_claro.setVisible(true);

		getContentPane().setBackground(Color.black);
		panel.setBackground(Color.black);
		label_algo.setForeground(Color.white);

		btn0.setBackground(Color.black);
		btn0.setIcon(new ImageIcon("img/0.png"));
		btn0.setPressedIcon(new ImageIcon("img/0_pressed.png"));
		btn0.setRolloverIcon(new ImageIcon("img/0_roll.png"));

		btn1.setBackground(Color.black);
		btn1.setIcon(new ImageIcon("img/1.png"));
		btn1.setPressedIcon(new ImageIcon("img/1_pressed.png"));
		btn1.setRolloverIcon(new ImageIcon("img/1_roll.png"));

		btn2.setBackground(Color.black);
		btn2.setIcon(new ImageIcon("img/2.png"));
		btn2.setPressedIcon(new ImageIcon("img/2_pressed.png"));
		btn2.setRolloverIcon(new ImageIcon("img/2_roll.png"));

		btn3.setBackground(Color.black);
		btn3.setIcon(new ImageIcon("img/3.png"));
		btn3.setPressedIcon(new ImageIcon("img/3_pressed.png"));
		btn3.setRolloverIcon(new ImageIcon("img/3_roll.png"));

		btn4.setBackground(Color.black);
		btn4.setIcon(new ImageIcon("img/4.png"));
		btn4.setPressedIcon(new ImageIcon("img/4_pressed.png"));
		btn4.setRolloverIcon(new ImageIcon("img/4_roll.png"));

		btn5.setBackground(Color.black);
		btn5.setIcon(new ImageIcon("img/5.png"));
		btn5.setPressedIcon(new ImageIcon("img/5_pressed.png"));
		btn5.setRolloverIcon(new ImageIcon("img/5_roll.png"));

		btn6.setBackground(Color.black);
		btn6.setIcon(new ImageIcon("img/6.png"));
		btn6.setPressedIcon(new ImageIcon("img/6_pressed.png"));
		btn6.setRolloverIcon(new ImageIcon("img/6_roll.png"));

		btn7.setBackground(Color.black);
		btn7.setIcon(new ImageIcon("img/7.png"));
		btn7.setPressedIcon(new ImageIcon("img/7_pressed.png"));
		btn7.setRolloverIcon(new ImageIcon("img/7_roll.png"));

		btn8.setBackground(Color.black);
		btn8.setIcon(new ImageIcon("img/8.png"));
		btn8.setPressedIcon(new ImageIcon("img/8_pressed.png"));
		btn8.setRolloverIcon(new ImageIcon("img/8_roll.png"));

		btn9.setBackground(Color.black);
		btn9.setIcon(new ImageIcon("img/9.png"));
		btn9.setPressedIcon(new ImageIcon("img/9_pressed.png"));
		btn9.setRolloverIcon(new ImageIcon("img/9_roll.png"));

		btn_punto.setBackground(Color.black);
		btn_punto.setIcon(new ImageIcon("img/punto.png"));
		btn_punto.setPressedIcon(new ImageIcon("img/punto_pressed.png"));
		btn_punto.setRolloverIcon(new ImageIcon("img/punto_roll.png"));

		btn_dividir.setBackground(Color.black);
		btn_dividir.setIcon(new ImageIcon("img/btn_division.png"));
		btn_dividir.setPressedIcon(new ImageIcon("img/btn_division_pressed.png"));
		btn_dividir.setRolloverIcon(new ImageIcon("img/btn_division_roll.png"));

		btn_multi.setBackground(Color.black);
		btn_multi.setIcon(new ImageIcon("img/btn_multi.png"));
		btn_multi.setPressedIcon(new ImageIcon("img/btn_multi_pressed.png"));
		btn_multi.setRolloverIcon(new ImageIcon("img/btn_multi_roll.png"));

		btn_resta.setBackground(Color.black);
		btn_resta.setIcon(new ImageIcon("img/btn_resta.png"));
		btn_resta.setPressedIcon(new ImageIcon("img/btn_resta_pressed.png"));
		btn_resta.setRolloverIcon(new ImageIcon("img/btn_resta_roll.png"));

		btn_suma.setBackground(Color.black);
		btn_suma.setIcon(new ImageIcon("img/btn_suma.png"));
		btn_suma.setPressedIcon(new ImageIcon("img/btn_suma_pressed.png"));
		btn_suma.setRolloverIcon(new ImageIcon("img/btn_suma_roll.png"));

		btn_clear.setBackground(Color.black);
		btn_clear.setIcon(new ImageIcon("img/btn_clear.png"));
		btn_clear.setPressedIcon(new ImageIcon("img/btn_clear_pressed.png"));
		btn_clear.setRolloverIcon(new ImageIcon("img/btn_clear_roll.png"));

		btn_exp.setBackground(Color.black);
		btn_exp.setIcon(new ImageIcon("img/btn_exp.png"));
		btn_exp.setPressedIcon(new ImageIcon("img/btn_exp_pressed.png"));
		btn_exp.setRolloverIcon(new ImageIcon("img/btn_exp_roll.png"));

		btn_ciento.setBackground(Color.black);
		btn_ciento.setIcon(new ImageIcon("img/btn_ciento.png"));
		btn_ciento.setPressedIcon(new ImageIcon("img/btn_ciento_pressed.png"));
		btn_ciento.setRolloverIcon(new ImageIcon("img/btn_ciento_roll.png"));

		label_calculos.setForeground(Color.white);
		label_calculos1.setForeground(Color.black);
		label_resultado.setForeground(Color.white);

		btn_igual.setBackground(Color.black);
		btn_igual.setIcon(new ImageIcon("img/btn_igual.png"));
		btn_igual.setPressedIcon(new ImageIcon("img/btn_igual_pressed.png"));

	}

	public void Claro(){
		btn_claro.setEnabled(false);
		btn_claro.setVisible(false);
		btn_oscuro.setEnabled(true);
		btn_oscuro.setVisible(true);

		getContentPane().setBackground(Color.white);
		panel.setBackground(Color.white);
		label_algo.setForeground(Color.black);

		btn0.setBackground(Color.white);
		btn0.setIcon(new ImageIcon("img/0_oscuro.png"));
		btn0.setPressedIcon(new ImageIcon("img/0_oscuro_pressed.png"));
		btn0.setRolloverIcon(new ImageIcon("img/0_oscuro_roll.png"));

		btn1.setBackground(Color.white);
		btn1.setIcon(new ImageIcon("img/1_oscuro.png"));
		btn1.setPressedIcon(new ImageIcon("img/1_oscuro_pressed.png"));
		btn1.setRolloverIcon(new ImageIcon("img/1_oscuro_roll.png"));

		btn2.setBackground(Color.white);
		btn2.setIcon(new ImageIcon("img/2_oscuro.png"));
		btn2.setPressedIcon(new ImageIcon("img/2_oscuro_pressed.png"));
		btn2.setRolloverIcon(new ImageIcon("img/2_oscuro_roll.png"));

		btn3.setBackground(Color.white);
		btn3.setIcon(new ImageIcon("img/3_oscuro.png"));
		btn3.setPressedIcon(new ImageIcon("img/3_oscuro_pressed.png"));
		btn3.setRolloverIcon(new ImageIcon("img/3_oscuro_roll.png"));

		btn4.setBackground(Color.white);
		btn4.setIcon(new ImageIcon("img/4_oscuro.png"));
		btn4.setPressedIcon(new ImageIcon("img/4_oscuro_pressed.png"));
		btn4.setRolloverIcon(new ImageIcon("img/4_oscuro_roll.png"));

		btn5.setBackground(Color.white);
		btn5.setIcon(new ImageIcon("img/5_oscuro.png"));
		btn5.setPressedIcon(new ImageIcon("img/5_oscuro_pressed.png"));
		btn5.setRolloverIcon(new ImageIcon("img/5_oscuro_roll.png"));

		btn6.setBackground(Color.white);
		btn6.setIcon(new ImageIcon("img/6_oscuro.png"));
		btn6.setPressedIcon(new ImageIcon("img/6_oscuro_pressed.png"));
		btn6.setRolloverIcon(new ImageIcon("img/6_oscuro_roll.png"));

		btn7.setBackground(Color.white);
		btn7.setIcon(new ImageIcon("img/7_oscuro.png"));
		btn7.setPressedIcon(new ImageIcon("img/7_oscuro_pressed.png"));
		btn7.setRolloverIcon(new ImageIcon("img/7_oscuro_roll.png"));

		btn8.setBackground(Color.white);
		btn8.setIcon(new ImageIcon("img/8_oscuro.png"));
		btn8.setPressedIcon(new ImageIcon("img/8_oscuro_pressed.png"));
		btn8.setRolloverIcon(new ImageIcon("img/8_oscuro_roll.png"));

		btn9.setBackground(Color.white);
		btn9.setIcon(new ImageIcon("img/9_oscuro.png"));
		btn9.setPressedIcon(new ImageIcon("img/9_oscuro_pressed.png"));
		btn9.setRolloverIcon(new ImageIcon("img/9_oscuro_roll.png"));

		btn_punto.setBackground(Color.white);
		btn_punto.setIcon(new ImageIcon("img/punto_oscuro.png"));
		btn_punto.setPressedIcon(new ImageIcon("img/punto_oscuro_pressed.png"));
		btn_punto.setRolloverIcon(new ImageIcon("img/punto_oscuro_roll.png"));

		btn_dividir.setBackground(Color.white);
		btn_dividir.setIcon(new ImageIcon("img/btn_division_oscuro.png"));
		btn_dividir.setPressedIcon(new ImageIcon("img/btn_division_oscuro_pressed.png"));
		btn_dividir.setRolloverIcon(new ImageIcon("img/btn_division_oscuro_roll.png"));

		btn_multi.setBackground(Color.white);
		btn_multi.setIcon(new ImageIcon("img/btn_oscuro_multi.png"));
		btn_multi.setPressedIcon(new ImageIcon("img/btn_multi_oscuro_pressed.png"));
		btn_multi.setRolloverIcon(new ImageIcon("img/btn_multi_oscuro_roll.png"));

		btn_resta.setBackground(Color.white);
		btn_resta.setIcon(new ImageIcon("img/btn_resta_oscuro.png"));
		btn_resta.setPressedIcon(new ImageIcon("img/btn_resta_oscuro_pressed.png"));
		btn_resta.setRolloverIcon(new ImageIcon("img/btn_resta_oscuro_roll.png"));

		btn_suma.setBackground(Color.white);
		btn_suma.setIcon(new ImageIcon("img/btn_suma_oscuro.png"));
		btn_suma.setPressedIcon(new ImageIcon("img/btn_suma_oscuro_pressed.png"));
		btn_suma.setRolloverIcon(new ImageIcon("img/btn_suma_oscuro_roll.png"));

		btn_clear.setBackground(Color.white);
		btn_clear.setIcon(new ImageIcon("img/btn_clear_oscuro.png"));
		btn_clear.setPressedIcon(new ImageIcon("img/btn_clear_oscuro_pressed.png"));
		btn_clear.setRolloverIcon(new ImageIcon("img/btn_clear_oscuro_roll.png"));

		btn_exp.setBackground(Color.white);
		btn_exp.setIcon(new ImageIcon("img/btn_exp_oscuro.png"));
		btn_exp.setPressedIcon(new ImageIcon("img/btn_exp_oscuro_pressed.png"));
		btn_exp.setRolloverIcon(new ImageIcon("img/btn_exp_oscuro_roll.png"));

		btn_ciento.setBackground(Color.white);
		btn_ciento.setIcon(new ImageIcon("img/btn_ciento_oscuro.png"));
		btn_ciento.setPressedIcon(new ImageIcon("img/btn_ciento_oscuro_pressed.png"));
		btn_ciento.setRolloverIcon(new ImageIcon("img/btn_ciento_oscuro_roll.png"));

		label_calculos.setForeground(Color.black);
		label_calculos1.setForeground(Color.white);
		label_resultado.setForeground(Color.black);

		btn_igual.setBackground(Color.white);
		btn_igual.setIcon(new ImageIcon("img/btn_igual_oscuro.png"));
		btn_igual.setPressedIcon(new ImageIcon("img/btn_igual_oscuro_pressed.png"));
	}

	public static void main(String args[]){
		Panel interfaz = new Panel();
		interfaz.setBounds(0,0,250,390);
		interfaz.setVisible(true);
		interfaz.setResizable(false);
		interfaz.setLocationRelativeTo(null);
	}
}