package bytebank;

public class AutenticaUtil {
	private String senha;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentica(String senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
}
