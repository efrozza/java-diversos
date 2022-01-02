package debugger;

public class StringUtilities {

    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded;

    public void addChar(StringBuilder sBuilder, char c){

        // Quando usamos o F7 , o intelliJ não debuga classes do JDK, por exemplo o .append do StringBuilder
        // Se usarmos Alt Shift F7 ai forçaremos o debug

        this.sBuilder.append(c);
        charsAdded++;
    }
}
