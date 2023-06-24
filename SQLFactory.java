public class SQLFactory {
    public static void main(String[] args) {
         Cliente cliente1 = new Cliente();
         Motorista motorista1 = new Motorista();
         Viagem viagem1 = new Viagem();
         Veiculo veiculo1 = new Veiculo();

         cliente1.id = 1;
         cliente1.nome = "Ricardo";
         cliente1.cpf = "555.222.123-44";

         motorista1.nome = "Fabrício";
         motorista1.cnh = "5533777777";

         viagem1.cidade_origem = "Sinop";
         viagem1.cidade_final = "União do Sul";
         viagem1.nome_produto_carga = "Milho";
 
         veiculo1.marca_veiculo = "DAF";
         veiculo1.modelo_veiculo = "DAF FX";
         veiculo1.placa_veiculo = "CX0JD17";
         veiculo1.carga_maxima = 40.000;

        //Para inserir dados:

        try {
            
        // Database.inserirRegistro(cliente1);
        // Database.inserirRegistro(motorista1);
        // Database.inserirRegistro(viagem1);
        // Database.inserirRegistro(veiculo1);

        //---------------------------------------//

        //Para atualizar os dados:
         
        // Database.atualizarRegistro(cliente1);
        // Database.atualizarRegistro(motorista1);
        // Database.atualizarRegistro(viagem1);
        // Database.atualizarRegistro(veiculo1);

        //---------------------------------------//

        //Para deletar os dados: 

        // Database.deletarRegistro(cliente1);
        // Database.deletarRegistro(motorista1);
        // Database.deletarRegistro(viagem1);
        // Database.deletarRegistro(veiculo1);

        //---------------------------------------//

        //Para puxar os dados:

        // Database.abrirID(cliente1, 1);
        // cliente1.printCliente();

        // Database.abrirID(motorista1, 1);
        // cliente1.printMotorista();

        // Database.abrirID(viagem1, 1);
        // cliente1.printViagem();

        // Database.abrirID(veiculo1, 1);
        // cliente1.printVeiculo();


        System.out.println("\nQuery realizada com sucesso\n");
       
    } catch (Exception e) {
      System.out.println("\nErro, tente novamente!\n");
    }
    }
}
