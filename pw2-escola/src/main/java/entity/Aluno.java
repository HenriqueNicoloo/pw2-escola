package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "ALUNO")
public class Aluno {

	@Column (name = "IDALUNO")
	private int IdAluno;
	
	@Column (name = "NOME_ALUNO")
	private String Nome_Aluno;
	
	@Column (name = "CELULAR_ALUNO")
	private String Celular_Aluno;
	
	@Column (name = "CPF_ALUNO")
	private String Cpf_Aluno;
	
	@JoinColumn (name = "ID_CURSO")
	@ManyToOne
	private int Id_Curso;
}
