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
	private String descricao;
	private Integer potencia;

	@OneToMany(mappedBy = "modelo")
	private List<Automovel> automovel = new ArrayList<>();
	
	@OneToMany 
	@JoinTable( name="marca_modelo",
				joinColumns = @JoinColumn(name="id"),
				inverseJoinColumns = @JoinColumn(name="id")
				)
	private Marca marca;
	
	public Modelo() {
		
	}

	public Modelo(Integer idmodelo, String descricao, Integer potencia) {
		this.id = idmodelo;
		this.descricao = descricao;
		this.potencia = this.potencia;	
	}

	public void adicionarAutomovel(Automovel a) {
		this.automovel.add(a);
		m.getmodelo().add(this);
	}
	
	public void removeAutomovel(Automovel a) {
		this.automovel.remove(a);
		c.getmodelo().remove(this);
	}
		
	public Integer getIdmodelo() {
		return id;
	}

	public void setIdmodelo(Integer idmodelo) {
		this.id = idmodelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Marca getmarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getpotencia() {
		return potencia;
	}

	public void setPotenciaInteger potencia) {
		this.potencia = potencia;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<Automoveis> automoveis) {
		this.automoveis = automoveis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((potencia == null) ? 0 : potencia.hashCode());
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
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Modelo [id=" + id + ", descricao=" + descricao + ", marca=" + marca + "]";
	}
		
}
