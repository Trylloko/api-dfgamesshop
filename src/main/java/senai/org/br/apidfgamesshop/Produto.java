package senai.org.br.apidfgamesshop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
    private String descricao;
    private float valor;
    private String imagem;
    public Integer getId() {
      return id;
    }
    public void setId(Integer id) {
      this.id = id;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getDescricao() {
      return descricao;
    }
    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }
    public float getValor() {
      return valor;
    }
    public void setValor(float valor) {
      this.valor = valor;
    }
    public String getImagem() {
      return imagem;
    }
    public void setImagem(String imagem) {
      this.imagem = imagem;
    }

    
}
