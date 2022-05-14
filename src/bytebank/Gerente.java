package bytebank;

public class Gerente extends Funcionario implements Autenticavel{
	
	private String login;
		
	private AutenticaUtil autenticaUtil;
	
	public Gerente() {
		this.autenticaUtil = new AutenticaUtil();
	}	
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public void setSenha(String senha) {
		this.autenticaUtil.setSenha(senha);
	}
	
	@Override
	public boolean autentica(String senha) {
		return this.autenticaUtil.autentica(senha);
	}
}
