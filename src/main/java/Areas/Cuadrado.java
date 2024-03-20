package Areas;

public class Cuadrado {

    private double lado; //BASE DEL TRIANGULO
    private double altura; //ALTURA DEL TRIANGULO

    private double area; //ALMACENA EL RESULTADO DEL AREA DEL CUADRADO

    //CONSTRUCTOR
    public Cuadrado (String lado){
        //RECIBE LA BASE
        this.lado=Double.parseDouble(lado);

        area=Math.pow(this.lado,2.0);
    }

    //================================================================
    //METODO GETTER
    public String CalculaArea (){
        return "El área del Cuadrado la lado "+lado+", es: "+area;
    }

}
