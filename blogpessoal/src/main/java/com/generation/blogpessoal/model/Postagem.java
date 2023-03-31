package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 5, max = 100, message = "O título deve conter entre 5 e 100 caracteres.")
	private String titulo;
	
	@NotBlank(message = "Campo obrigatório.")
	@Size(min = 10, max = 1000, message = "O texto deve conter entre 10 e 1000 caracteres.")
	private String texto;
	
	private String foto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
<<<<<<< HEAD
	@JsonIgnoreProperties("postagens")
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Tema tema;
=======
	@JsonIgnoreProperties("usuario")
	private Usuario usuario;
>>>>>>> bbdfeab106f1c5fcf5242f33a8983d16130632e6

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
