package br.contatos.model;

import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contato {

	private String nome;
	private String telefone;
	private String email;
	private String[] appMensagens;
	private String grupo;

	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date dataNascimento;
	private String estadoNatal;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getAppMensagens() {
		return appMensagens;
	}
	public void setAppMensagens(String[] appMensagens) {
		this.appMensagens = appMensagens;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEstadoNatal() {
		return estadoNatal;
	}
	public void setEstadoNatal(String estadoNatal) {
		this.estadoNatal = estadoNatal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", appMensagens="
				+ Arrays.toString(appMensagens) + ", grupo=" + grupo + ", dataNascimento=" + dataNascimento
				+ ", estado=" + estadoNatal + "]";
	}
	
}
