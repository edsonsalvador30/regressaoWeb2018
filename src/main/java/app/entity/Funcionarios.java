package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FUNCIONARIOS
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIOS\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"cpf" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Funcionarios")
public class Funcionarios implements Serializable {

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
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "cpf", nullable = false, unique = true, insertable=true, updatable=true)
  
  private java.lang.String cpf;

  /**
  * @generated
  */
  @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idade;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "nascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date nascimento;

  /**
  * @generated
  */
  @Column(name = "cargo", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cargo;

  /**
   * Construtor
   * @generated
   */
  public Funcionarios(){
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
  public Funcionarios setId(java.lang.String id){
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
  public Funcionarios setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Funcionarios setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }

  /**
   * Obtém idade
   * return idade
   * @generated
   */
  
  public java.lang.Integer getIdade(){
    return this.idade;
  }

  /**
   * Define idade
   * @param idade idade
   * @generated
   */
  public Funcionarios setIdade(java.lang.Integer idade){
    this.idade = idade;
    return this;
  }

  /**
   * Obtém nascimento
   * return nascimento
   * @generated
   */
  
  public java.util.Date getNascimento(){
    return this.nascimento;
  }

  /**
   * Define nascimento
   * @param nascimento nascimento
   * @generated
   */
  public Funcionarios setNascimento(java.util.Date nascimento){
    this.nascimento = nascimento;
    return this;
  }

  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  
  public java.lang.String getCargo(){
    return this.cargo;
  }

  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public Funcionarios setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Funcionarios object = (Funcionarios)obj;
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
