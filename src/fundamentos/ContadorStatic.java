package fundamentos;

public class ContadorStatic {

    public static int instanciasCriadas = 0;

    public ContadorStatic() {
        instanciasCriadas ++;
    }

    public static int getInstanciasCriadas() {
        //metodoQualquer();
        // para acessar metodo nao static de um metodo static
        // devemos instanciar
        ContadorStatic ct = new ContadorStatic();
        ct.metodoQualquer();
        return instanciasCriadas;
    }

    public int metodoQualquer (){
        // metodo n�o estatico pode acessar metodo estatico
        System.out.println("Metodo n�o acessivel por metodos statics");
        return getInstanciasCriadas();

    }
}
