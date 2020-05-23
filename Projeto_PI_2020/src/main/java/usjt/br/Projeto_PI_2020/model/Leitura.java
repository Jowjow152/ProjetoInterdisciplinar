package usjt.br.Projeto_PI_2020.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_leitura")
public class Leitura implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Float temperatura;
	private Integer luz;
	private LocalDateTime tempo;

	public Long getId() {
		return id;
	}

	public Float getTemperatura() {
		return temperatura;
	}

	public Integer getLuz() {
		return luz;
	}

	public LocalDateTime getTempo() {
		return tempo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}

	public void setLuz(Integer luz) {
		this.luz = luz;
	}

	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "Leitura [temperatura=" + temperatura + ", luz=" + luz + ", tempo=" + tempo + "]";
	}
	
	

}
