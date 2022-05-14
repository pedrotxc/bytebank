package bytebank;

public class Cliente implements Autenticavel{
	private String nome;
	private String cpf;
	private String profissao;
	
	private AutenticaUtil autenticaUtil;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
