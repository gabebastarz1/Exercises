/*2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que
gere um número real aleatório entre 0 e 100. Esse número deve ser armazenado em uma variável do
tipo double chamada numeroAleatorio. Por fim, exiba o valor dessa variável na saída padrão.
 */
public class Ex02 {
  public static void main(String[] args){
    double numeroAleatorio = Math.random() * 100;
    System.out.println("O numero gerado foi: " + numeroAleatorio);
  }
}
//Gabriel Bastarz Martins Ramos