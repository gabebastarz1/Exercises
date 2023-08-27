/*7 – Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo. 
  a. "Bom dia"
  b. 3
  c. 235.13
  d. true
  e. -135
  f. 256.23F
  g. 'A'
  h. 6463275245745L 
  Obs: faça os testes necessários com um programa escrito em Java para identificar os tipos.
 */
public class Ex07 {
  public static void main(String[] args){
    String a = "Bom dia";
    byte b = 3;
    double c = 235.13;
    boolean d = true;
    int e = -135;
    float f = 256.23f;
    char g = 'A';
    long h = 6463275245745l;
    System.out.printf("%s%n%d%n%.2f%n%b%n%d%n%.2f%n%c%n%d",a,b,c,d,e,f,g,h);
  }
}
//Gabriel Bastarz Martins Ramos