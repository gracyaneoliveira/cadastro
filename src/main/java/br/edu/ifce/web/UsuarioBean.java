package br.edu.ifce.web;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.edu.ifce.dao.UsuarioDAO;
import br.edu.ifce.entity.Usuario;
import br.edu.ifce.exception.DAOException;

@ManagedBean
@ViewScoped
public class UsuarioBean {

	private Usuario usuario;
	private List<Usuario> usuarios;
	
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void grid(){
		usuario = null;
		usuarios = null;
	}
	
	public Usuario getUsuario() {
		if(usuario == null){
			usuario = new Usuario();
		}
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Usuario> getUsuarios() {
		if(usuarios == null){
			try {
				usuarios = usuarioDAO.list();
			} catch (DAOException e) {
				FacesContext.getCurrentInstance().addMessage(null, (new FacesMessage("Erro ao obter a lista")));
			}
		}
		return usuarios;
	}
	
	public void salvar(){
		if(usuario.getIdUsuario() == null){
			try {
				usuarioDAO.add(usuario);
			} catch (DAOException e) {
				FacesContext.getCurrentInstance().addMessage(null, (new FacesMessage("Erro ao adicionar")));
			}
		}else{
			try {
				usuarioDAO.update(usuario);
			} catch (DAOException e) {
				FacesContext.getCurrentInstance().addMessage(null, (new FacesMessage("Erro ao atualizar")));
			}
		}
		grid();
	}
	
	public void excluir(){
		if(usuario != null){
			try {
				usuarioDAO.remove(usuario);
			} catch (DAOException e) {
				FacesContext.getCurrentInstance().addMessage(null, (new FacesMessage("Erro ao excluir")));
			}
		}
		grid();
	}

}
