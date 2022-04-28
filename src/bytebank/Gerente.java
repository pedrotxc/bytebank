package bytebank;

public class Gerente extends Funcionario{
	private String login;
	private String senha;
	
	public boolean autentica(String senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean autentica(String senha, String login) {
		if(this.senha == senha && this.login == login) {
			return true;
		} else {
			return false;
		}
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
