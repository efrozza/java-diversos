package exercicios.classe;

public class Data {

    // atributos de classe

    private int dia;
    private int mes;
    private int ano;

    static String msg = "Mensagem de data";

    public Data() {

        // quando criarmos uma data via construtor padrão podemos setar os valores default diretamente
//
//        this.dia = 01;
//        this.mes = 01;
//        this.ano = 1970;

        // ou poderiamos chamar o outro construtor para setar com os valores recebidos
        this(1, 1, 1970);

        // se tivermos outros construtores com outros parametros podemos chamar com this, passando
        // os parametros correspondentes, em tempo de execução a JVM sabe qual construtor chamar

    }

    // uso do parametro como final evita erros de programação
    // como por exemplo podemos fazer dia = dia, que estariamos só mudando
    // o valor do parametro ao inves de setar valor para a variavel this.dia
    // vai nos forçar a lembrar do this
    public Data(final int dia, final int mes, final int ano) {
        //dia = dia;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static String getMsg() {
        return msg;
    }

    // metodos estaticos não acessam this , this referencia a instancia
    public static void setMsg(String msg) {
//        this.dia = 1;
        Data.msg = msg;
    }


}
