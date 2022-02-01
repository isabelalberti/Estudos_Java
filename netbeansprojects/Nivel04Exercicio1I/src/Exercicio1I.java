//<editor-fold defaultstate="collapsed" desc="initial program settings...">

import java.awt.Color;
import java.awt.Font;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Exercicio1I {

	public static void main(String[] args) {
// </editor-fold>
		// Your code starts here :)
		
		
		/*
	Passo 1: Leia três matrizes (A, B e C) de uma dimensão do tipo vetor com cinco elementos cada(tipo real).
	
	Passo 2: Construir uma matriz D
		
	Passo 3: Realizar a junção das três matrizes (A, B e C) na D.
		
	Passo 4: Apresentar os elementos da matriz D. 
		*/
		
		Double[] numsA = new Double[5];
		Double[] numsB = new Double[5];
		Double[] numsC = new Double[5];
		Double[] numsD = new Double[15];
		String mensagem = "";
		
		
		for (int indice = 0; indice < numsA.length; indice++) {
				numsA[indice] = readDouble("Digite o " + (indice + 1) + "º número de A");
				numsD [indice] = numsA [indice];
				mensagem += numsD[indice] + ", ";
		}
		
		for (int indice = 0; indice < numsB.length; indice++) {
				numsB[indice] = readDouble("Digite o " + (indice + 1) + "º número de B");
				numsD [indice] = numsB [indice];
				mensagem += numsD[indice] + ", ";

		}
		
		for (int indice = 0; indice < numsC.length; indice++) {
				numsC[indice] = readDouble("Digite o " + (indice + 1) + "º número de C");
				
		}
		
		Integer contC = 0;
		
		for (int indice = 10; indice < numsD.length; indice++) {
			numsD [indice] = numsC [contC];
			mensagem += numsD[indice] + ", ";
					
		contC++;
					
		}

		write("Os valores da matriz D são: " + mensagem);
		
		// Your code ends here :(
//<editor-fold defaultstate="collapsed" desc="final program settings...">
	}
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static Integer calculateSizeOfLongestLine(Object messageToUser) {
		String[] slicesOfMessage = messageToUser.toString().split("\n");
		Integer bigger = 0;

		for (Integer index = 0; index < slicesOfMessage.length; index++) {
			if (slicesOfMessage[index].length() > bigger) {
				bigger = slicesOfMessage[index].length();
			}
		}

		return bigger;
	}

	public static String drawBorderLines(Object messageToUser, Integer sidePaddingSize) {
		String border = "+";
		Integer spaces = calculateSizeOfLongestLine(messageToUser) + (2 * sidePaddingSize);
		for (Integer count = 0; count < spaces; count++) {
			border += "-";
		}
		border += "+";
		return border;
	}

	public static void write(Object messageToUser) {
		String border = drawBorderLines(messageToUser, 2);
		String[] slicesOfMessage = messageToUser.toString().split("\n");

		String finalMessage = "\n" + border + "\n";
		for (int count = 0; count < slicesOfMessage.length; count++) {
			finalMessage += "|  " + (String.format("%-" + (border.length() - 6) + "s", slicesOfMessage[count])) + "  |\n";
		}
		finalMessage += border + "\n";

		System.out.println(finalMessage);
	}

	public static String readString(Object messageToUser) {
		String readValue = null;

		String border = drawBorderLines(messageToUser, 2);
		String[] slicesOfMessage = messageToUser.toString().split("\n");

		String headerMessage = "\n" + border + "\n";
		for (int count = 0; count < slicesOfMessage.length; count++) {
			headerMessage += "|  " + (String.format("%-" + (border.length() - 6) + "s", slicesOfMessage[count])) + "  |\n";
		}
		System.out.print(headerMessage + "|  ");

		try {
			readValue = scanner.nextLine();
		} catch (Exception e) {
		}

		System.out.println(border + "\n");

		return readValue;
	}

	public static Integer readInteger(Object messageToUser) {
		try {
			return parseInt(readString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Float readFloat(Object messageToUser) {
		try {
			return parseFloat(readString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Double readDouble(Object messageToUser) {
		try {
			return parseDouble(readString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static void writeWindow(Object messageToUser) {
		// <editor-fold defaultstate="collapsed" desc="customizing JOptionPane...">
		//Changing Font new Font(nomeFonte, espessura.valorEspessura, tamanhoCaractere);
		Font fontMonospaced = new Font("Consolas", Font.BOLD, 18);

		//Preparing the text message
		JTextArea textMessage = new JTextArea();
		textMessage.setEditable(false);
		textMessage.setBackground(Color.decode("0x3c3f41"));
		textMessage.setForeground(Color.decode("0xdee4e5"));
		textMessage.setFont(fontMonospaced);
		textMessage.setText(messageToUser.toString());

		//Changing JOptionPane colors
		UIManager.put("OptionPane.background", textMessage.getBackground());
		UIManager.put("Panel.background", textMessage.getBackground());
		UIManager.put("Button.background", Color.decode("0x727A7C"));
		UIManager.put("Button.foreground", textMessage.getForeground());
		UIManager.put("Button.font", fontMonospaced);

		//Changin JOptionPane OK button
		UIManager.put("OptionPane.okButtonText", "Close");
		// </editor-fold>

		JOptionPane.showMessageDialog(null, textMessage, "Write Operation", JOptionPane.PLAIN_MESSAGE);
	}

	public static String readWindowString(Object messageToUser) {
		// <editor-fold defaultstate="collapsed" desc="customizing JOptionPane...">
		//Changing Font new Font(nomeFonte, espessura.valorEspessura, tamanhoCaractere);
		Font fontMonospaced = new Font("Consolas", Font.BOLD, 18);

		//Preparing the text message
		JTextArea textMessage = new JTextArea();
		textMessage.setEditable(false);
		textMessage.setBackground(Color.decode("0x3c3f41"));
		textMessage.setForeground(Color.decode("0xdee4e5"));
		textMessage.setFont(fontMonospaced);
		textMessage.setText(messageToUser.toString());

		//Changing JOptionPane colors
		UIManager.put("OptionPane.background", textMessage.getBackground());
		UIManager.put("Panel.background", textMessage.getBackground());
		UIManager.put("Button.background", Color.decode("0x727A7C"));
		UIManager.put("Button.foreground", textMessage.getForeground());
		UIManager.put("Button.font", fontMonospaced);

		Border inputBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.gray);
		UIManager.put("TextField.background", textMessage.getBackground());
		UIManager.put("TextField.foreground", Color.white);
		UIManager.put("TextField.border", inputBorder);
		UIManager.put("TextField.font", fontMonospaced);

		//Changin JOptionPane OK button
		UIManager.put("OptionPane.okButtonText", "Insert");
		UIManager.put("OptionPane.cancelButtonText", "Cancel");
		// </editor-fold>

		String readValue = null;
		try {
			readValue = JOptionPane.showInputDialog(null, textMessage, "Read Operation", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
		}
		return readValue;
	}

	public static Integer readWindowInteger(Object messageToUser) {
		try {
			return parseInt(readWindowString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Float readWindowFloat(Object messageToUser) {
		try {
			return parseFloat(readWindowString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

	public static Double readWindowDouble(Object messageToUser) {
		try {
			return parseDouble(readWindowString(messageToUser));
		} catch (Exception e) {
			return null;
		}
	}

}
// </editor-fold>
