public class Veiculo  extends SQLClass {

       @Key
    
     int id;
       
     String modelo_veiculo;
     double carga_maxima;
     String placa_veiculo;
     String marca_veiculo;

     Veiculo(){
        this.setTableName("VEICULO");                
    }

     public void printVeiculo(){
        System.out.println(
           "\n--------------DADOS CLIENTE--------------\n"+
           "\nModelo: "+this.modelo_veiculo +
            "\nCarga maxima: "+this.carga_maxima+ 
            "\nPlaca do veiculo: "+this.placa_veiculo+ 
            "\nMarca do veiculo: "+this.marca_veiculo+ 
            "\n\n---------------------------------\n"
        );
    }

    
}
