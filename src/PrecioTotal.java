public class PrecioTotal{
    // Atributos
    private Double tProductosAlimentarios;
    private Double tBebidas;
    private Double tRefrigerados;
    private ProductosAlimentarios [] listaProductosAlimentarios;
    // Contructores
    public PrecioTotal(){
        this.tProductosAlimentarios = 0.;
        this.tBebidas = 0.;
        this.tRefrigerados = 0.;
    }
    public PrecioTotal(ProductosAlimentarios listaProductosAlimentarios[]){
        this.tProductosAlimentarios = 0.;
        this.tBebidas = 0.;
        this.tRefrigerados = 0.;
        this.listaProductosAlimentarios = listaProductosAlimentarios;
    }
    // Metodo mostrar Total
    public void mostrarTotal(){
        // Codigo calculo de total
        for (ProductosAlimentarios element: listaProductosAlimentarios){
            tProductosAlimentarios+=element.calcularPrecio();
            if (element instanceof Bebidas){
                tBebidas += element.calcularPrecio();
            }else if (element instanceof Refrigerados){
                tRefrigerados += element.calcularPrecio();
            }

        }

        System.out.println("El precio total de los Productos Alimentarios es de " + tProductosAlimentarios);
        System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
        System.out.println("La suma del precio de los Refrigerados es de " + tRefrigerados);
    }
}
class ProductosAlimentarios {
    // Atributos
    private final Double PRECIO_BASE = 80.0;
    private final char TIPO_ALIMENTO = 'N';
    private final Integer PESO_BASE = 5;

    private Double precioBase;
    private char tipoAlimento;
    private Integer peso;
    // Contructores
    public ProductosAlimentarios(){
        this.precioBase = PRECIO_BASE;
        this.tipoAlimento = TIPO_ALIMENTO;
        this.peso = PESO_BASE;

    }
    public ProductosAlimentarios(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = TIPO_ALIMENTO;
    }
   
    public ProductosAlimentarios(Double precioBase, Integer peso, char tipoAlimento){
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = tipoAlimento;
    }

    //metodo no funcional
   /*  public void comprobarTipoAlimento(char tipoAlimento){
    // Condicion validar tipo de alimento N,C
    } */
    public Double calcularPrecio(){
        // Codigo calcular precio final        
        Double adicion = 0.0;

        if(tipoAlimento =='C'){
            adicion += 20;
        }else{
            adicion += 40;
        }

        if (peso>=0 && peso <=9){
            adicion +=6;
        }else if (peso>9 && peso <=16){
            adicion += 8;
        }else if(peso>16){
            adicion +=20;
        }


    return precioBase + adicion;
    }
}
class Bebidas extends ProductosAlimentarios {

    // Atributos
    private final char LUGAR_ORIGEN = 'N';
    private char lugarOrigen;

        // Contructores
    public Bebidas(){        
        super();
        this.lugarOrigen = LUGAR_ORIGEN;
    }
    public Bebidas(Double precioBase, Integer peso){
        super(precioBase, peso);
        lugarOrigen = LUGAR_ORIGEN;
    }
    public Bebidas(Double precioBase, Integer peso, char lugarOrigen){
        super(precioBase, peso);
        this.lugarOrigen = lugarOrigen;
    }
    //metodo no funcional
    /* public void comprobarLugarOrigen(char lugarOrigen){
    // Condicion validar lugar de origen N,I
    } */
    public Double calcularPrecio(){
        // Codigo calcular precio final
        Double adicion =0.;
        if(lugarOrigen == 'I'){
            adicion +=15;
        }else{
            adicion +=5;
        }

        return super.calcularPrecio() + adicion;
    }
   
}
class Refrigerados extends ProductosAlimentarios {       
    // Atributos
    private final Integer TEMPERATURA = 10;
    private Integer temperatura;

    // Contructores
    public Refrigerados(){
        super();
        this.temperatura = TEMPERATURA;
    }
    public Refrigerados(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.temperatura = TEMPERATURA;
    }
    public Refrigerados(Double precioBase, Integer peso, Integer temperatura){
        super(precioBase, peso);
        this.temperatura = temperatura;
    }
    public Double calcularPrecio(){
        // Codigo calcular precio final
        Double adicion =0.;
        if (temperatura>=5 && temperatura<10){
            adicion += 20;
        }else if (temperatura>=10 && temperatura<=15){
            adicion += 18;
        }else if (temperatura<5 || temperatura>15){
            adicion += 5;
        }
        return super.calcularPrecio() + adicion;
    }
   
}
   