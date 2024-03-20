package Areas;

public class Rectangulo {

    private double base; //BASE DEL RECTANGULO
    private double altura; //ALTURA DEL RECTANGULO

    private double area; //ALMACENA EL RESULTADO DEL AREA

    //CONSTRUCTOR
    public Rectangulo (String base, String altura){
        //RECIBE LA BASE
        this.base=Double.parseDouble(base);
        //RECIBE ALTURA
        this.altura=Double.parseDouble(altura);

        area=(this.base*this.altura);
    }

    //================================================================
    //METODO GETTER
    public String CalculaArea (){
        return "El área del Rectángulo de base "+base+", y altura "+altura+", es: "+area;
    }

}

