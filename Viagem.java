public class Viagem  extends SQLClass{

     @Key

    int id;

    String cidade_origem;
    String cidade_final;
    String nome_produto_carga;

    Viagem(){
        this.setTableName("VIAGEM");
    }  
    
     public void printViagem(){
        System.out.println(
           "\n--------------DADOS CLIENTE--------------\n"+
           "\nCidade de origem: "+this.cidade_origem +
            "\nCidade destino: "+this.cidade_final+ 
            "\nProduto transportado: "+this.nome_produto_carga+ 
            "\n\n---------------------------------\n"
        );
    }
    
}
