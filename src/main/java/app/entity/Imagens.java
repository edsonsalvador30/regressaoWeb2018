package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela IMAGENS
 * @generated
 */
@Entity
@Table(name = "\"IMAGENS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Imagens")
public class Imagens implements Serializable {

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
  @Column(name = "imagem_bd", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] imagem_bd;

  /**
  * @generated
  */
  @Column(name = "arquivo_bd", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] arquivo_bd;

  /**
  * @generated
  */
  @Column(name = "imagem_drop", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAN1b8LhHu4zrBpK7KM_vquypEyfLc5NsdW7KUYoiBw5xn")
  
  private java.lang.String imagem_drop;

  /**
  * @generated
  */
  @Column(name = "arquivo_drop", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAN1b8LhHu4zrBpK7KM_vquypEyfLc5NsdW7KUYoiBw5xn")
  
  private java.lang.String arquivo_drop;

  /**
  * @generated
  */
  @Column(name = "imagem2_bd", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] imagem2_bd;

  /**
  * @generated
  */
  @Column(name = "arquivo2_bd", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] arquivo2_bd;

  /**
  * @generated
  */
  @Column(name = "imagem2_drop", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAN1b8LhHu4zrBpK7KM_vquypEyfLc5NsdW7KUYoiBw5xn")
  
  private java.lang.String imagem2_drop;

  /**
  * @generated
  */
  @Column(name = "arquivo2_drop", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="KxYtE8bo5BAAAAAAAAAAN1b8LhHu4zrBpK7KM_vquypEyfLc5NsdW7KUYoiBw5xn")
  
  private java.lang.String arquivo2_drop;

  /**
   * Construtor
   * @generated
   */
  public Imagens(){
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
  public Imagens setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém imagem_bd
   * return imagem_bd
   * @generated
   */
  
  public byte[] getImagem_bd(){
    return this.imagem_bd;
  }

  /**
   * Define imagem_bd
   * @param imagem_bd imagem_bd
   * @generated
   */
  public Imagens setImagem_bd(byte[] imagem_bd){
    this.imagem_bd = imagem_bd;
    return this;
  }

  /**
   * Obtém arquivo_bd
   * return arquivo_bd
   * @generated
   */
  
  public byte[] getArquivo_bd(){
    return this.arquivo_bd;
  }

  /**
   * Define arquivo_bd
   * @param arquivo_bd arquivo_bd
   * @generated
   */
  public Imagens setArquivo_bd(byte[] arquivo_bd){
    this.arquivo_bd = arquivo_bd;
    return this;
  }

  /**
   * Obtém imagem_drop
   * return imagem_drop
   * @generated
   */
  
  public java.lang.String getImagem_drop(){
    return this.imagem_drop;
  }

  /**
   * Define imagem_drop
   * @param imagem_drop imagem_drop
   * @generated
   */
  public Imagens setImagem_drop(java.lang.String imagem_drop){
    this.imagem_drop = imagem_drop;
    return this;
  }

  /**
   * Obtém arquivo_drop
   * return arquivo_drop
   * @generated
   */
  
  public java.lang.String getArquivo_drop(){
    return this.arquivo_drop;
  }

  /**
   * Define arquivo_drop
   * @param arquivo_drop arquivo_drop
   * @generated
   */
  public Imagens setArquivo_drop(java.lang.String arquivo_drop){
    this.arquivo_drop = arquivo_drop;
    return this;
  }

  /**
   * Obtém imagem2_bd
   * return imagem2_bd
   * @generated
   */
  
  public byte[] getImagem2_bd(){
    return this.imagem2_bd;
  }

  /**
   * Define imagem2_bd
   * @param imagem2_bd imagem2_bd
   * @generated
   */
  public Imagens setImagem2_bd(byte[] imagem2_bd){
    this.imagem2_bd = imagem2_bd;
    return this;
  }

  /**
   * Obtém arquivo2_bd
   * return arquivo2_bd
   * @generated
   */
  
  public byte[] getArquivo2_bd(){
    return this.arquivo2_bd;
  }

  /**
   * Define arquivo2_bd
   * @param arquivo2_bd arquivo2_bd
   * @generated
   */
  public Imagens setArquivo2_bd(byte[] arquivo2_bd){
    this.arquivo2_bd = arquivo2_bd;
    return this;
  }

  /**
   * Obtém imagem2_drop
   * return imagem2_drop
   * @generated
   */
  
  public java.lang.String getImagem2_drop(){
    return this.imagem2_drop;
  }

  /**
   * Define imagem2_drop
   * @param imagem2_drop imagem2_drop
   * @generated
   */
  public Imagens setImagem2_drop(java.lang.String imagem2_drop){
    this.imagem2_drop = imagem2_drop;
    return this;
  }

  /**
   * Obtém arquivo2_drop
   * return arquivo2_drop
   * @generated
   */
  
  public java.lang.String getArquivo2_drop(){
    return this.arquivo2_drop;
  }

  /**
   * Define arquivo2_drop
   * @param arquivo2_drop arquivo2_drop
   * @generated
   */
  public Imagens setArquivo2_drop(java.lang.String arquivo2_drop){
    this.arquivo2_drop = arquivo2_drop;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Imagens object = (Imagens)obj;
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
