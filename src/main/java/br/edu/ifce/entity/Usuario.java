
package br.edu.ifce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="me_usuario")
@NamedQueries( {
@NamedQuery(name="Usuario", query="select u from Usuario u"),
@NamedQuery(name="usuarioByCdEmail", query="select u from Usuario u Where u.cdEmail = ?1"),
@NamedQuery(name="usuarioByCdUsuario", query="select u from Usuario u Where u.cdUsuario = ?1")})
public class Usuario implements IGenericEntity<Usuario> {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer idUsuario;
	
	@Column(name="cdus", length=80, nullable=false)
	private String cdUsuario;
	
	@Column(name="cdem", length=80)
	private String cdEmail;
	
	@Column(name="cdsx", length=1)
	private String cdSexo;
	
	@Column(name="lgat")
	private Boolean lgAtivo;
	
	public Usuario() {
		this(null, null);
	}
	
	public Usuario(Integer idUsuario){
		this(idUsuario, null);
	}
	
	public Usuario(Integer idUsuario, String cdUsuario){
		this.idUsuario = idUsuario;
		this.cdUsuario = cdUsuario;
		this.lgAtivo = true;
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getCdEmail() {
		return cdEmail;
	}

	public void setCdEmail(String cdEmail) {
		this.cdEmail = cdEmail;
	}

	public String getCdSexo() {
		return cdSexo;
	}

	public void setCdSexo(String cdSexo) {
		this.cdSexo = cdSexo;
	}

	public Boolean getLgAtivo() {
		return lgAtivo;
	}

	public void setLgAtivo(Boolean lgAtivo) {
		this.lgAtivo = lgAtivo;
	}

	@Override
	public String toString() {
		return cdUsuario;
	}
}
