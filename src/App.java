public class App{
    public static void main( String[] args ){ 
        
        ProductosAlimentarios listaProductosAlimentarios1[] = new ProductosAlimentarios[5];
        listaProductosAlimentarios1[0] = new ProductosAlimentarios();
        listaProductosAlimentarios1[1] = new Bebidas(200.0,10,'n');
        listaProductosAlimentarios1[2] = new Refrigerados(140.0,20);
        listaProductosAlimentarios1[3] = new Bebidas(120.0,10,'I');
        listaProductosAlimentarios1[4] = new Refrigerados(110.0,7);   
        PrecioTotal solucion1 = new PrecioTotal(listaProductosAlimentarios1);
        solucion1.mostrarTotal();    
        System.out.println("-----------------------------------------------------");
        ProductosAlimentarios listaProductosAlimentarios2[] = new ProductosAlimentarios[10];
        listaProductosAlimentarios2[0] = new ProductosAlimentarios();
        listaProductosAlimentarios2[1] = new ProductosAlimentarios(120.0,35,'C');
        listaProductosAlimentarios2[2] = new Bebidas();
        listaProductosAlimentarios2[3] = new Refrigerados();
        listaProductosAlimentarios2[4] = new Bebidas(230.0,70);
        listaProductosAlimentarios2[5] = new Refrigerados(40.2,50,4);
        listaProductosAlimentarios2[6] = new Refrigerados(130.2,150,9);
        listaProductosAlimentarios2[7] = new Bebidas(103.3,77,'N');
        listaProductosAlimentarios2[8] = new Refrigerados(143.2,190,12);
        listaProductosAlimentarios2[9] = new Refrigerados(87.2,450,21);
        PrecioTotal solucion2 = new PrecioTotal(listaProductosAlimentarios2);
        solucion2.mostrarTotal();
       
    }
}