
package Calçado;


public class Calçado {
    
    int q;
    int comprar;
    int livro;
    int p;
    int v;
    
    
    void nome (String nome){
        System.out.println("Produto: "+nome);        
    }
    void valor (int valor){
        System.out.println("Valor: "+valor);
        v = valor;
    }
    void quantidade (int quant){
        System.out.println("Quantidade: "+quant);
        q = quant;
    }
    
    void comprar (int produto){
       
        if (produto <= q){
           System.out.println("Você comprou: "+produto+" produtos");
           p = produto;
        }
        else{
            System.out.println ("Você não pode comprar");
            this.livro -= livro;
        }
        
    }
    boolean vender (int vender){
       
       if (vender <= this.p){
           
           System.out.println ("Você vendeu: "+vender+" produtos");
           vender =- vender;
           return true;
       }
       else{
           System.out.println ("Você não pode vender");
           return false;
       }
}
    void aumento (int a){
        a += v;
        System.out.println("O valor com imposto é: "+a);
    }
}
