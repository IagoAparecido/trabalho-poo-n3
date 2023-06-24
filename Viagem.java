public class Viagem  extends SQLClass{

     @Key
    int id;

    String cidade_origem;
    String cidade_final;
    String nome_produto_carga;

    int id_veiculo;
    int id_cliente;
///Vooood
    Viagem(){
        this.setTableName("VIAGEM");
    }   
    
}
