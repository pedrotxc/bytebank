package bytebank;

public class SistemaInterno {
	private String senha = "2222";
	
	public void autentica(Autenticavel autenticavel) {
		boolean autenticou = autenticavel.autentica(senha);
		
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}
