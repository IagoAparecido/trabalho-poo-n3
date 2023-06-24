public class Cliente extends SQLClass {

    @Key
    int id;

    String nome;
    String cpf;

    Cliente(){
        this.setTableName("CLIENTE");
    }   
    
    public void printCliente(){
        System.out.println(
           "\n--------------DADOS CLIENTE--------------\n"+
           "\nNome: "+this.nome +
            "\nCPF: "+this.cpf+ 
            "\n\n---------------------------------\n"
        );
    }
}
