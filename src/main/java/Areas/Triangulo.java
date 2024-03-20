package Areas;

public class Triangulo {

    private double base; //BASE DEL TRIANGULO
    private double altura; //ALTURA DEL TRIANGULO

    private double area; //ALMACENA EL RESULTADO DEL AREA

    //CONSTRUCTOR
    public Triangulo (String base, String altura){
        //RECIBE LA BASE
        this.base=Double.parseDouble(base);
        //RECIBE ALTURA
        this.altura=Double.parseDouble(altura);

        area=(this.base*this.altura)/2;
    }

    //================================================================
    //METODO GETTER
    public String CalculaArea (){
        return "El área del Triángulo de base "+base+", y altura "+altura+", es: "+area;
    }

}
