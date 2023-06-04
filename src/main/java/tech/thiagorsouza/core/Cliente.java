package tech.thiagorsouza.core;

import tech.thiagorsouza.utils.DialogMessage;

public class Cliente {

  private String nome;
  private String cpf;

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public Cliente() {
  }

  public void createCliente() {
    this.nome = DialogMessage.showInput("Digite o nome do cliente: ");
    this.cpf = DialogMessage.showInput("Digite o CPF do cliente: ");

  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

}
