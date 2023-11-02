import java.util.Scanner;

public class SimpleInventario {

   static String[] articulos = new String[5];

    public static void agregarArticulo() {
       for (int conteo=0; conteo<articulos.length; conteo++){
           articulos[conteo] = obtenerNombreArticulo();
       }
    }


    public static void removerArticulo(int id) {
        if (id > 0) {
        }
    }

    public static double obtenerPrecioArticulo() {
        double precio=(Math.random()*5000)+100;
        if (precio>0){
            return precio;
        }
       else {
            return -1;
        }
    }

    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo existente " + articuloExistente);
        System.out.println("articulo regristrado:"  );
        for (int conteo=0;conteo<articulos.length;conteo++){
            System.out.println(articulos[conteo]);
        }

    }

    public static void main(String[] args) {
        agregarArticulo();
        imprimirInventario();
    }

    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el nombre del articulo ");
        String nombre = scanner.next();
        if (nombre.length() > 3) {
            System.out.println("usted ha ingresado el articulo " + nombre);
            return nombre;
        } else {
            return "errorDeOperacion";
        }

    }

    public static void modificarArticulo(){
       String nombre=obtenerNombreArticulo();
       Double precio=obtenerPrecioArticulo();
        if (nombre.startsWith("A")|| nombre.startsWith("D")){
          obtenerPrecioArticulo();
            if (precio>150 && precio<=250){
                precio += (precio*0.02); // precio = precio + (precio *0.02)
                System.out.printf(nombre + " " + precio);
            }else if (precio>250 && precio<=500){
                precio += (precio*0.08); //precio = precio + (precio *0.08)
                System.out.printf(nombre + " " + precio);
            }else {
                precio += (precio*0.12); // precio = precio + (precio *0.12)
                System.out.printf(nombre + " " + precio);
            }
        }else if (nombre.startsWith("C")||nombre.startsWith("M")){
            precio -= (precio*0.20); //precio = precio - (precio *0.20)
            System.out.printf(nombre + " " + precio);
        }

    }




}

