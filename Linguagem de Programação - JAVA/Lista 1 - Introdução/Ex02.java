/* 2 - Crie um programa utilizando a linguagem de programação Java. Esse programa deve exibir os
dois primeiros argumentos de linha de comando. O código fonte desse programa deve ser
armazenado em um arquivo chamado Argumentos.java */

public class Ex02 {
  public static void main(String[] args){
    if(args.length >= 2){
      System.out.println("Primeiro Argumento: " + args[0]);
      System.out.println("Segundo Argumento: " + args[1]);
    } else {
      System.out.println("É preciso ter pelo menos 2 argumentos para executar o projeto");
    }
  }
}
//Gabriel Bastarz Martins Ramos
