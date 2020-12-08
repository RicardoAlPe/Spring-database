package com.example.demo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "persona")
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_persona; 
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	public char[] getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
