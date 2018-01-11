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
@Repository("lojasDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface lojasDAO extends JpaRepository<lojas, java.lang.String> {

  /**
   * Obtém a instância de lojas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM lojas entity WHERE entity.id = :id")
  public lojas findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de lojas utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM lojas entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM lojasEstado entity WHERE entity.lojas.id = :id")
  public Page<lojasEstado> findLojasEstado(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.estado FROM lojasEstado entity WHERE entity.lojas.id = :id")
  public Page<Estado> listEstado(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM lojasEstado entity WHERE entity.lojas.id = :instanceId AND entity.estado.id = :relationId")
  public int deleteEstado(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
