/*2 - Crie um arquivo chamado Casting.java. Crie uma variável chamada numero1 do tipo long e
inicialize-a com o valor 2147483648L. Depois, crie uma variável chamada numero2 do tipo int e
copie o valor da variável numero1 para a variável numero2. Por fim, exiba, na saída padrão, os
valores dessas duas variáveis. */
public class Ex02 {
  public static void main(String[] args){
    long numero1 = 2147483648l;
    int numero2 = (int) numero1; 
    System.out.printf("%d%n%d",numero1, numero2);
  }
}
//Gabriel Bastarz Martins Ramos