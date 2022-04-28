package bytebank;

public class Testa {
	public static void main(String[] args) {
		
		ControlaBonificacao controle = new ControlaBonificacao();
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000.0);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(1000.0);
		
		controle.registra(g1);
		controle.registra(ev1);
		
		System.out.println(controle.getSoma());
	}
}
