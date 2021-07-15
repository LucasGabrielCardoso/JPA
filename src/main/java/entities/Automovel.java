package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class Modelo  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String obsevacoe;
	private float preco;
	private Integer kilometragem;
	
	@OneToMany 
	@JoinTable( name="modelo_automovel",
				joinColumns = @JoinColumn(name="id"),
				inverseJoinColumns = @JoinColumn(name="id")
				)
	private Modelo modelo;
	
	public Automovel() {
		
	}

	public Automovel(Integer id,Integer anoFabricacao, Integer anoModelo, String obsevacoe, float preco, Integer kilometragem) {
		this.id = id;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = this.anoModelo;	
		this.obsevacoe = this.obsevacoe;
		this.preco = this.preco;
		this.kilometragem = this.kilometragem;
	}

	public Integer getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Integer getObsevacoe() {
		return obsevacoe;
	}

	public void setObsevacoe(String obsevacoe) {
		this.obsevacoe = obsevacoe;
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Marca getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModeloInteger anoModelo) {
		this.anoModelo = anoModelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((obsevacoe == null) ? 0 : obsevacoe.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((kilometragem == null) ? 0 : kilometragem.hashCode());
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
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.descricao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automovel [id=" + id + ", anoFabricacao=" + anoFabricacao + "]";
	}
		
}
