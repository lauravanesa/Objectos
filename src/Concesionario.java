public class Concesionario {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        llenarVehiculo(miVehiculo, "rojo", 1000,2021,"nissan",false );
        imprimirDatosVehiculo(miVehiculo);



        Vehiculo miSegundoVehiculo = new Vehiculo();
        llenarVehiculo(miSegundoVehiculo,"verde", 1600,2023,"ford",true );
        imprimirDatosVehiculo(miSegundoVehiculo);


    }

    public static void llenarVehiculo(Vehiculo vehiculo, String color, double cilindraje,
                                      int modelo, String marca, boolean encendido){

        vehiculo.setColor(color);
        vehiculo.setCilindraje(cilindraje);
        vehiculo.setModelo(modelo);
        vehiculo.setMarca(marca);
        vehiculo.setEncendido(encendido);



        }
        public static void imprimirDatosVehiculo(Vehiculo vehiculo){
            System.out.println("--------------");
            System.out.println("color: "+vehiculo.getColor());
            System.out.println("cilingraje: "+vehiculo.getCilindraje());
            System.out.println("modelo:" +vehiculo.getModelo());
            System.out.println("marca:"+vehiculo.getMarca());
            System.out.println("encendido: "+vehiculo.isEncendido());
            System.out.println("--------------");
        }

        }






