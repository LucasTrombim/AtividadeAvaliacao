
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Main {

    /**
     11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%
12) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
aproveitamento, usando a fórmula:
MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno,
suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a
mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        float valor = input.nextFloat();
        System.out.println("Qual a forma de pagamento."
                +"(D)Dinheiro"
                +"(C)Cartão"
                +"(Q)Cheque");
        char decisao = input.next().charAt(0);
        if ((decisao=='D')||(decisao=='Q')){
            float calculo1;
            float calculo2;
            calculo1=(float) (valor*0.1);
            calculo2=(valor-calculo1);
            System.out.println("Você pagará com 10% de desconto: "+calculo2);
            
        }else if (decisao=='C'){
            System.out.println("Quantas vezes irá pagar?"
                    +"(V)Á vista"
                    +"(2)2 vezes"
                    +"(3)3 vezes");
        char decisao2 = input.next().charAt(0);
         
            if (decisao2 == 'V'){
                float calculo1;
            float calculo2;
            calculo1=(float) (valor*0.15);
            calculo2=(valor-calculo1);
             System.out.println("Você terá um desconto de 15%,e irá pagar: "+calculo2);
            }
                
                
            
                
        
        
        
    }
        
    }
    
}
