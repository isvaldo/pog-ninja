import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Nosso alfabeto
		String caracteres = "abcdefghijklmnopqrstuvwxyz";

		// Instancia classe Random
		Random random = new Random();

		// Tamanho da palavra aleatório entre 1 e 10
		int tamanhoPalavra = random.nextInt(10) + 1;

		// Onde ira armazenar a palavra
		char[] palavra = new char[tamanhoPalavra];

		// Incrementa caracter a caracter aleatóriamente
		for (int i = 0; i < tamanhoPalavra; i++) {

			// Gera uma caracter aleatório de 0 a tamanho da quantidade de caracteres - 1
			int caracterRandom = random.nextInt(caracteres.length());

			// Palavra na posição de i receber um caracter na posição aleatória
			palavra[i] = caracteres.charAt(caracterRandom);
		}

		// Exibe a palavra aleatória
		System.out.println(palavra);

	}

}
