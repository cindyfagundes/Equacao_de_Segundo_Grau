
import java.util.Scanner;

public class RaizDeDelta{

    public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);
    
    //VARIAVEIS
    float a, b, c, delta,sqrtdelta, raiz1, raiz2;
    
        System.out.println("EQUACAO DE SEGUNDO GRAU");
        //ENTRADA
        System.out.println("Digite o primeiro valor da equacao (valor a): ");
        a = entrada.nextFloat();
        System.out.println("Digite o segundo valor (valor b): ");
        b = entrada.nextFloat();
        System.out.println("Digite o terceiro valor (valor c): ");
        c = entrada.nextFloat();
        
        if (a != 0){
           
        delta = (b*b)- (4*a*c);
        sqrtdelta = (float)Math.sqrt(delta);
        
            if (delta>=0){
                raiz1 = ((-1)*b+sqrtdelta)/2*a;
                raiz2 = ((-1)*b - sqrtdelta)/2*a;
                System.out.printf("Raizes: %.2f e %.2f",raiz1,raiz2);
            }
            else {
                delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Raiz 1: %.2f + i.%.2f\n",(-b)/(2*a),(sqrtdelta)/(2*a));
                System.out.printf("Raiz 2: %.2f - i.%.2f\n",(-b)/(2*a),(sqrtdelta)/2*a);
                 }
     
            }
        
            else{
            System.out.println("Operacao invalida! valor 'a' igual zero, nao e uma equacao de segundo grau");    
                }
   
             }
   
          }
