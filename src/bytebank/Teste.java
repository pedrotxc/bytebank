package bytebank;

public class Teste {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente("111", "123");
		cc.depositar(120.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculaImposto = new CalculadorDeImposto();
		
		calculaImposto.registra(cc);
		calculaImposto.registra(seguro);
		System.out.println(calculaImposto.getTotalImposto());
	}
}
