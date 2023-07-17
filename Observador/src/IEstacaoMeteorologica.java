
public interface IEstacaoMeteorologica {

    //adicionar
    public void adicionar(Observer observer);

    //remover
    public void remover(Observer observer);

    //notificar
    public void notificacao();
}