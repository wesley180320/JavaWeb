package model;

public class javaBeans {

	private String idCon;
	private String nome;
	private String fone;
	private String email;
	
	public javaBeans(){}
	
	public javaBeans(String idCon, String nome, String fone, String email) {
		super();
		this.idCon = idCon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	public String getIdCon() {
		return idCon;
	}

	public void setIdCon(String idCon) {
		this.idCon = idCon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
