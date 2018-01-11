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
@Repository("lojasEstadoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface lojasEstadoDAO extends JpaRepository<lojasEstado, java.lang.String> {

  /**
   * Obtém a instância de lojasEstado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM lojasEstado entity WHERE entity.id = :id")
  public lojasEstado findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de lojasEstado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM lojasEstado entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select le from lojasEstado le")
  public Page<lojasEstado> list(Pageable pageable);
  


  /**
   * Foreign Key lojas
   * @generated
   */
  @Query("SELECT entity FROM lojasEstado entity WHERE entity.lojas.id = :id")
  public Page<lojasEstado> findlojasEstadosByLojas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key estado
   * @generated
   */
  @Query("SELECT entity FROM lojasEstado entity WHERE entity.estado.id = :id")
  public Page<lojasEstado> findlojasEstadosByEstado(@Param(value="id") java.lang.String id, Pageable pageable);

}
