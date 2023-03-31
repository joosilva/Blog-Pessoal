package com.generation.blogpessoal.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

<<<<<<< HEAD
=======
import jakarta.persistence.CascadeType;
>>>>>>> bbdfeab106f1c5fcf5242f33a8983d16130632e6
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
<<<<<<< HEAD
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Campo obrigatório.")
	@Size(min = 5, max = 64, message = "O nome deve conter entre 5 e 64 caracteres.")
	private String nome;
	
	@NotBlank(message = "Campo obrigatório.")
	@Size(min = 3, max = 16, message = "O nickname deve conter entre 3 e 16 caracteres.")
	private String nickname;
	
	@NotBlank(message = "Campo obrigatório.")
	@Email
	private String usuario;
	
	@NotBlank(message = "Campo obrigatório.")
=======
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Campo obrigatório.")
	@Size(min = 10, max = 255, message = "O nome deve conter entre 10 e 255 caracteres.")
	private String nome;
	
	@NotBlank(message = "Campo obrigatório.")
	@Size(min = 5, max = 255, message = "O usuário deve conter entre 5 e 255 caracteres.")
	private String usuario;
	
	
	@NotBlank(message = "Campo obrigatório.")
	@Size(min = 10, max = 255, message = "O email deve conter entre 10 e 255 caracteres.")
	private String email;
	
	@NotBlank(message = "O campo senha é obrigatório.")
>>>>>>> bbdfeab106f1c5fcf5242f33a8983d16130632e6
	@Size(min = 8, max = 16, message = "A senha deve conter entre 8 e 16 caracteres.")
	private String senha;
	
	private String foto;
	
<<<<<<< HEAD
	@OneToMany
=======
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
>>>>>>> bbdfeab106f1c5fcf5242f33a8983d16130632e6
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

<<<<<<< HEAD
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

=======
>>>>>>> bbdfeab106f1c5fcf5242f33a8983d16130632e6
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

<<<<<<< HEAD
=======
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

>>>>>>> bbdfeab106f1c5fcf5242f33a8983d16130632e6
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

}
