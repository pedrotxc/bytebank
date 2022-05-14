package bytebank;

public class Administrador  extends Funcionario implements Autenticavel{
		
	private AutenticaUtil autenticaUtil;
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticaUtil.autentica(senha);
	}

	@Override
	public void setSenha(String senha) {
		this.autenticaUtil.setSenha(senha);
	}
}
