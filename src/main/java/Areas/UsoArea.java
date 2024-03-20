package Areas;

import javax.swing.JOptionPane;
public class UsoArea {

    public static void main (String[] args){

        // INICIALIZAMOS LA VARIABLE
        int area=0;

        //CHEQUEA QUE LA OPCION SEA VALIDA SINO LA REPITE
        do {
            String SeleccionaArea = JOptionPane.showInputDialog("Elige una opción: \n1. Area Cuadrado \n2. Area Rectángulo \n3. Area Triángulo\n\nEl resultado sale por consola");

            //CONVIERTE EL STRING A INT PARA USAR EL switch a IR A LA CLASE CORRECTA
            area = Integer.parseInt(SeleccionaArea);

        } while (area >= 4); //CHEQUEA QUE LA OPCION SEA VALIDA

        // CALCULO DE AREA
        switch (area) {
            // AREA CUADRADO
            case 1:
                //BASE
                String lado = JOptionPane.showInputDialog("Introduce el lado en cm, por favor.");
                Cuadrado AreaCuadrado = new Cuadrado(lado);
                System.out.println(AreaCuadrado.CalculaArea());
                break;
            // AREA RECTANGULO
            case 2:
                //BASE
                String base = JOptionPane.showInputDialog("Introduce la base en cm, por favor.");
                //ALTURA
                String altura = JOptionPane.showInputDialog("Introduce la altura en cm, por favor.");
                //LLAMO AL METODO CONTRUCTOR TRIANGULO
                Rectangulo AreaRectangulo = new Rectangulo(base, altura);
                System.out.println(AreaRectangulo.CalculaArea());
                break;
            // AREA TRIANGULO
            case 3:
                //BASE
                base = JOptionPane.showInputDialog("Introduce la base en cm, por favor.");
                //ALTURA
                altura = JOptionPane.showInputDialog("Introduce la altura en cm, por favor.");
                //LLAMO AL METODO CONTRUCTOR TRIANGULO
                Triangulo AreaTriangulo = new Triangulo(base, altura);
                System.out.println(AreaTriangulo.CalculaArea());
                break;
        }
    }
}
