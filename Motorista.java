public class Motorista extends SQLClass{
    
       @Key

    String nome;
    String cnh;
    int id_veiculo;


    Motorista(){
        this.setTableName("MOTORISTA");                
    }
}
