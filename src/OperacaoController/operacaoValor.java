package OperacaoController;

public class operacaoValor {

	public void  operacaoValor(int numero) throws Exception {
		if (numero <= 0) {
			throw new Exception("o valor e menor ou igual a zero");
		}

		if (numero % 2 == 0) {
			System.out.println( " para o numero inserido o seu quadrado e " + numero * numero);
		} else {
			System.out.println( " para o numero inserido o seu valor cubico  e " + numero * numero * numero);
		}

	}

}
