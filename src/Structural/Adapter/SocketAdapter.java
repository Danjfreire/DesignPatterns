package Structural.Adapter;

/**
 * Essa é a interface que especifica as funcionalidades do adapter.
 * Neste caso queremos que o nosso Socket também retorne 12v e 3v
 * além dos 120 que retorna por padrão.
 */

public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();

}
