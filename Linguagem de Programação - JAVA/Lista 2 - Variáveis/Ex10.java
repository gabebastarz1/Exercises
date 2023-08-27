/*10 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa
que declare variáveis para representar os seguintes dados: número do pedido, código do produto,
quantidade e valor total da compra. Inicialize essas variáveis com valores apropriados. Por fim,
exiba os valores armazenados.
 */
public class Ex10 {
  public static void main(String[] args){
    int nPedido = 3;
    int codigoProduto = 22;
    int quant = 2;
    double valor = 16.50;  
    System.out.printf("Número do pedido: %d%n Código do Produto: %d%n Quatidade: %d%n Valor total: %.2f", nPedido,codigoProduto,quant,valor);
  }
}
//Gabriel Bastarz Martins Ramos