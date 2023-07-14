public class InicializacaoRapidaSingleton {

    private static final InicializacaoRapidaSingleton instance = new InicializacaoRapidaSingleton();

    //Construtor privado para evitar as aplicações clientes de usar o construtor
    private InicializacaoRapidaSingleton(){}

    public static InicializacaoRapidaSingleton getInstance(){
        return instance;
    }
}



}
