package tech.thiagorsouza;

import tech.thiagorsouza.core.Cliente;
import tech.thiagorsouza.core.Pedido;
import tech.thiagorsouza.utils.DialogMessage;

import javax.swing.*;

public class App {
  private static final String WELCOME_MESSAGE = "Bem-vindo ao sistema de pedidos!";
  private static final String ADD_ANOTHER_PRODUCT_MESSAGE = "Deseja adicionar mais um produto?";
  private static final String ENTER_ATTENDANT_NAME_MESSAGE = "Digite o nome do atendente:";
  private static final String ENTER_ATTENDANT_GOAL_MESSAGE = "Digite a meta do atendente:";
  private static final String ENTER_ORDER_EVALUATION_MESSAGE = "Digite a avaliação do pedido:";
  private static final String ORDER_SUMMARY_MESSAGE = "Resumo do pedido";

  public static void main(String[] args) {
    DialogMessage.showMessage(WELCOME_MESSAGE);

    Cliente cliente = new Cliente();
    cliente.createCliente();

    Pedido pedido = new Pedido(cliente);

    boolean adicionarProduto;
    do {
      pedido.adicionarProduto();
      int resposta = JOptionPane.showConfirmDialog(null, ADD_ANOTHER_PRODUCT_MESSAGE);
      adicionarProduto = (resposta == JOptionPane.YES_OPTION);
    } while (adicionarProduto);

    String nomeAtendente = JOptionPane.showInputDialog(null, ENTER_ATTENDANT_NAME_MESSAGE);
    String metaAtendente = JOptionPane.showInputDialog(null, ENTER_ATTENDANT_GOAL_MESSAGE);

    JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!" +
        "\n\nAgora, digite a avaliação do pedido:");

    try {
      String avaliacao = JOptionPane.showInputDialog(ENTER_ORDER_EVALUATION_MESSAGE);
      int avaliacaoInt = Integer.parseInt(avaliacao);
      pedido.setAvaliacao(avaliacaoInt);
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Avaliação inválida. O valor deve ser um número inteiro.");
      System.exit(1);
    }

    JOptionPane.showMessageDialog(null, ORDER_SUMMARY_MESSAGE +
        "\n\nNome do cliente: " + cliente.getNome() +
        "\nCPF do cliente: " + cliente.getCpf() +
        "\n\nAvaliação do pedido: " + pedido.getAvaliacao() +
        "\n\nValor total do pedido: " + pedido.getValorTotal()
    );
  }
}