public class Motorista extends SQLClass{
    
    @Key
    int id;

    String nome;
    String cnh;

    Motorista(){
        this.setTableName("MOTORISTA");                
    }

    public void printMotorista(){
        System.out.println(
           "\n--------------DADOS MOTORISTA--------------\n"+
           "\nNome: "+this.nome +
            "\nCNH: "+this.cnh+ 
            "\n\n---------------------------------\n"
        );
    }
}

