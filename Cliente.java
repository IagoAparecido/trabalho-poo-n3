public class Cliente extends SQLClass {

    @Key
    // int id;

    String nome;
    String cpf;

    Cliente(){
        this.setTableName("CLIENTE");
    }   
    
    public void printCliente(){
        System.out.println(
           
            this.nome + ", " +
            this.cpf
        );
    }
}
