package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class Produtos_compPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.Integer id;
  
  /**
   * @generated
   */
  private java.lang.String nome;
  
  /**
   * Construtor
   * @generated
   */
  public Produtos_compPK(){
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
  public Produtos_compPK setId(java.lang.Integer id){
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
  public Produtos_compPK setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produtos_compPK object = (Produtos_compPK)obj;
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
