package fundamentos;

public class UsoStatic {

    public static void main(String[] args) {

        ContadorStatic contadorStatic1 = new ContadorStatic();
        ContadorStatic contadorStatic2 = new ContadorStatic();

        System.out.println("Quantidade de ContadorStatic criados " + ContadorStatic.getInstanciasCriadas());
        System.out.println(contadorStatic1.metodoQualquer());

    }


}
