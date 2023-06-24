public class SQLFactory {
    public static void main(String[] args) {
         Cliente cliente1 = new Cliente();
         Motorista motorista1 = new Motorista();
         Viagem viagem1 = new Viagem();
         Veiculo veiculo1 = new Veiculo();

         cliente1.nome = "Juliano";
         cliente1.cpf = "055.999.999-00";

         motorista1.nome = "Fabrício";
         motorista1.cnh = "5533777777";
         motorista1.id_veiculo = 1;

         viagem1.cidade_origem = "Sinop";
         viagem1.cidade_final = "União do Sul";
         viagem1.nome_produto_carga = "Milho";

         viagem1.id_cliente = 1;
         viagem1.id_veiculo = 1;

         veiculo1.marca_veiculo = "DAF";
         veiculo1.modelo_veiculo = "DAF FX";
         veiculo1.placa_veiculo = "CX0JD17";
         veiculo1.carga_maxima = 40.000;

         veiculo1.id_motorista = 1;

       
        //  try {
        //     Database.inserirRegistro(cliente1);
         
        //     Database.inserirRegistro(motorista1);

        //     Database.inserirRegistro(viagem1);

        //     Database.inserirRegistro(veiculo1);

        //     System.out.println("\nDados inseridos com sucesso!\n");

        //  } catch (Exception e) {
        //     System.out.println("\nNao foi possivel inserir os dados");
        //  }
       
        cliente1.printCliente();
         
         

    }
}
