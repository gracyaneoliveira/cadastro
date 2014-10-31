/*
 * Copyright 2013-2014 J7 Soluções Inteligentes.
 *
 * by Edivando Alves 
 * Contact: edivando@j7.eti.br
 * 
 */
package br.edu.ifce.dao;

import java.io.Serializable;
import java.util.List;

import br.edu.ifce.exception.DAOException;

/**
 * Interface {@link IGenericDAO} esta centraliza os mï¿½todos default de um repositorio.
 * 
 * @author Edivando Alves
 *
 */
public interface IGenericDAO<T> extends Serializable{
        
    /**
     * Mï¿½todo generico para adicionar qualquer entidade.
     * @param entity T 
     * @return T - a propria entidade, porï¿½m com o id(pk) setado.
     * @throws DAOException
     */
    public T add(T entity) throws DAOException;
    
    public List<T> add(List<T> list) throws DAOException;
    
    /**
     * Mï¿½todo genï¿½rico para remover qualquer entidade a partir do id da mesma.
     * @param id Integer - pk da entidade
     * @return boolean - true caso positï¿½vo
     * @throws DAOException
     */
    public boolean remove(Integer id) throws DAOException;
    
    /**
     * Mï¿½todo genï¿½rico para remover uma entidade recebendo ela mesma como paramentro.
     * 
     * @param entity T
     * @return boolean - true caso positï¿½vo
     * @throws DAOException
     */
    public boolean remove(T entity) throws DAOException;
        
    /**
     * Mï¿½todo genï¿½rico para atualizar uma entidade, recebendo uma entidade T.
     * 
     * @param entity
     * @return
     * @throws DAOException
     */
    public T update(T entity) throws DAOException;
    
    /**
     * Obtem uma entidade a partir do id( pk ),
     * 
     * @param id - Integer
     * @return T
     * @throws DAOException
     */
    public T find(Integer id) throws DAOException;

    /**
     * Mï¿½todo genï¿½rico que {@link List} retorna uma lista de todos os atributos de uma entidade.
     * 
     * @return {@link List} of T
     * @throws DAOException
     */
    public List<T> list() throws DAOException;

}