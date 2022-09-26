package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "CURSO")

public class Curso {
	@Id
	@GeneratedValue
	@Column (name = "IDCURSO")
	private int IdCurso;
	
	@Column (name = "NOME_CURSO")
	private String Nome_Curso;
	
	@Column (name = "MODALIDADE")
	private String Modalidade;
	
	@Column (name = "CARGA_HORARIA")
	private int Carga_Horaria;
}
