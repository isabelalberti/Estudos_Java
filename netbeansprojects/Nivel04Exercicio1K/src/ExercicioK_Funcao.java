
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author Isabe, 17 de mai de 2021, 22:16:19
 * Last update: -
 */// </editor-fold>
public class ExercicioK_Funcao {
	public static void main(String[] args) {
	
// Passo 1: criar 2 arrays A e B
	
	Integer tamanho = 8;
	Integer[] arrayA = new Integer[tamanho];
	Integer[] arrayB = new Integer[tamanho];
	
		
// Passo 2: ler valores para o array A desde que sejam positivos
	
//	 Integer testes = read("Digite um valor");
//	 System.out.println(testes);
	
		for (int indice = 0; indice < arrayA.length; indice++) {
			arrayA[indice] = readPositive("Digite o " + (indice +1) + "º valor");

//	Passo 3: atribuir valores para o array B baseados no A de forma que se tornem negativos

			arrayB[indice] = arrayA[indice] *-1;
}
		
// Passo 4: exibir os valores do array B
			
		for (int indice = 0; indice < arrayA.length; indice++) {
				System.out.println("["+ indice +"]: " + arrayB[indice]);
				
		}
		
	}

// funções/métodos
//Regra: public static [tipo de retorno - void ou o tipo da var] [ nome da função ] ( [parametros - opicional] )
	
	public static Integer read(String mensagem){
	Scanner scanner = new Scanner (System.in);
	System.out.println(mensagem);
	Integer valor = scanner.nextInt();
	return valor;
}
	public static Integer readPositive(String mensagem) {
		Integer valorLido = -1;
		
		while (valorLido < 0) {
			valorLido = read(mensagem);
			
			if(valorLido < 0) {
				System.out.println("Erro! Valor Inválido!");
			}
			
		}
				
		return valorLido;
		
	}
	
}//class

