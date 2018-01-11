package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LOJASESTADO
 * @generated
 */
@Entity
@Table(name = "\"LOJASESTADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.lojasEstado")
public class lojasEstado implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_lojas", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private lojas lojas;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_estado", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Estado estado;

  /**
   * Construtor
   * @generated
   */
  public lojasEstado(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public lojasEstado setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém lojas
   * return lojas
   * @generated
   */
  
  public lojas getLojas(){
    return this.lojas;
  }

  /**
   * Define lojas
   * @param lojas lojas
   * @generated
   */
  public lojasEstado setLojas(lojas lojas){
    this.lojas = lojas;
    return this;
  }

  /**
   * Obtém estado
   * return estado
   * @generated
   */
  
  public Estado getEstado(){
    return this.estado;
  }

  /**
   * Define estado
   * @param estado estado
   * @generated
   */
  public lojasEstado setEstado(Estado estado){
    this.estado = estado;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    lojasEstado object = (lojasEstado)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
