package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTOS_COMP
 * @generated
 */
@Entity
@IdClass(Produtos_compPK.class)
@Table(name = "\"PRODUTOS_COMP\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"nome" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Produtos_comp")
public class Produtos_comp implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;

  /**
   * @generated
   */
  @Id
  @Column(name = "nome", nullable = false, insertable=true, updatable=true)
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer quantidade;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
   * Construtor
   * @generated
   */
  public Produtos_comp(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Produtos_comp setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Produtos_comp setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém quantidade
   * return quantidade
   * @generated
   */
  
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }

  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public Produtos_comp setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Produtos_comp setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produtos_comp object = (Produtos_comp)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (nome != null ? !nome.equals(object.nome) : object.nome != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((nome == null) ? 0 : nome.hashCode());
    return result;
  }

}
