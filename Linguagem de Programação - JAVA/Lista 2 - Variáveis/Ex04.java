/* 4 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. Defina os nomes que
achar mais apropriado para essas variáveis. Por fim, exiba os valores dessas variáveis na saída
padrão.
*/
public class Ex04 {
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