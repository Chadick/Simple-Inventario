import java.util.Scanner;

public class SimpleInventario {


    public static void agregarArticulo(String articulo) {
        if (articulo.length() > 4) {
            System.out.printf("articuloAgregadoExitosamente");
        } else {
            System.out.printf("noSePermiteEsteArticulo");
        }
    }


    public static void removerArticulo(int id) {
        if (id > 0) {
        }
    }

    public static String obtenerPrecioArticulo(String articulo,double precio) {
        double formula=(Math.random()*5000)+100;
        if (articulo.startsWith("mar") && precio>=0){
            return "articulo "+articulo+" tiene un valor  de  RD$ "+formula;
        }else if (articulo.startsWith("tab")||precio>=12000){
              return "articulo"+articulo+"tiene un valor que sobrepasa los RD$ 12,000"+ formula;
        }else{
            return "ninguno de los escenarios pudo aplicar";
        }
    }

    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo existente " + articuloExistente);

    }

    public static void main(String[] args) {
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
            return ("errorDeOperacion");
        }

    }
}

