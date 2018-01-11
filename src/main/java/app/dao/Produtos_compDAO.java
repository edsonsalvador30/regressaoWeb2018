package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("Produtos_compDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Produtos_compDAO extends JpaRepository<Produtos_comp, Produtos_compPK> {

  /**
   * Obtém a instância de Produtos_comp utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param nome
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Produtos_comp entity WHERE entity.id = :id AND entity.nome = :nome")
  public Produtos_comp findOne(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome);

  /**
   * Remove a instância de Produtos_comp utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param nome
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Produtos_comp entity WHERE entity.id = :id AND entity.nome = :nome")
  public void delete(@Param(value="id") java.lang.Integer id, @Param(value="nome") java.lang.String nome);



}
