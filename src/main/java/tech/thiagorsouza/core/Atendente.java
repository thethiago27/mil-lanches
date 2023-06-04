package tech.thiagorsouza.core;

public class Atendente {

  private final String nome;
  private final String cpf;
  private int meta;

  public Atendente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.meta = 100;
  }

  public int setMeta(int meta) {
    return this.meta = meta;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }
}
