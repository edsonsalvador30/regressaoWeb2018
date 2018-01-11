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
@Repository("EstadoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EstadoDAO extends JpaRepository<Estado, java.lang.String> {

  /**
   * Obtém a instância de Estado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Estado entity WHERE entity.id = :id")
  public Estado findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Estado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Estado entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Cidade entity WHERE entity.estado.id = :id")
  public Page<Cidade> findCidade(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM lojasEstado entity WHERE entity.estado.id = :id")
  public Page<lojasEstado> findLojasEstado(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.lojas FROM lojasEstado entity WHERE entity.estado.id = :id")
  public Page<lojas> listLojas(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM lojasEstado entity WHERE entity.estado.id = :instanceId AND entity.lojas.id = :relationId")
  public int deleteLojas(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key pais
   * @generated
   */
  @Query("SELECT entity FROM Estado entity WHERE entity.pais.id = :id")
  public Page<Estado> findEstadosByPais(@Param(value="id") java.lang.String id, Pageable pageable);

}
