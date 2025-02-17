package com.ipartex.entidades;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 50)
	private String nombre;
	
	@NotBlank
	@Size(max = 50)
	@Column(unique = true)
	private String usuarioIpartex;
	
	@NotBlank
	@Email
	@Size(max = 50)
	@Column(unique = true)
	private String email;
	
	@JsonIgnore
	@NotBlank
	@Size(max = 100)
	private String password;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany
	private Collection<Mensaje> mensajes;
}
