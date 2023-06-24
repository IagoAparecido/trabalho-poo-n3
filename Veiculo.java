public class Veiculo  extends SQLClass {

       @Key
       
     String modelo_veiculo;
     double carga_maxima;
     String placa_veiculo;
     String marca_veiculo;
     int id_motorista;

     Veiculo(){
        this.setTableName("VEICULO");                
    }
}
