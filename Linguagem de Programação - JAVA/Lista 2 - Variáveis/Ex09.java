/*9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que
declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser
inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.
 */
public class Ex09 {
  public static void main(String[] args){
    // -------integerTypes--------
    byte b = 19;
    short s = 1571;
    int i = 100000;
    long l = 2147483648l;
    char c = 'K';
// -------floatingPointTypes------
    float f = 3.14f;
    double d = 3.141592653589793;
// -------boolanType-------
    boolean bo = true;

    System.out.printf("%d \n %d \n %d \n %d \n %c \n %.2f \n %f \n %b",b,s,i,l,c,f,d,bo);
  }
}
//Gabriel Bastarz Martins Ramos