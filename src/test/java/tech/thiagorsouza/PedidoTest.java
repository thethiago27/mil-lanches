package tech.thiagorsouza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.thiagorsouza.core.Cliente;
import tech.thiagorsouza.core.Pedido;

public class PedidoTest {

  private Pedido pedido;
  private Cliente cliente;

  @BeforeEach
  public void setUp() {
    cliente = new Cliente("Thiago", "123456789");
    pedido = new Pedido(cliente);
  }

  @Test
  public void testAdicionarProduto() {
    pedido.adicionarProduto();
    Assertions.assertEquals(1, pedido.getProdutos().size());
  }

  @Test
  public void testGetValorTotal() {
    pedido.adicionarProduto();
    Assertions.assertEquals(10.0, pedido.getValorTotal());
  }

  @Test
  public void testGetValorTotalComMaisDeUmProduto() {
    pedido.adicionarProduto();
    pedido.adicionarProduto();
    Assertions.assertEquals(20.0, pedido.getValorTotal());
  }

}