/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;

/**
 *
 * @author pogliani.mattia
 */
public class utente implements Runnable {

    private boolean soddisfatto = false;
    private boolean stop = false;
    private Kebabbaro kebabbaro;

    public utente(Kebabbaro kebabbaro) {
        this.kebabbaro = kebabbaro;
    }

    @Override
    public void run() {
        while (!stop) {
            while (!soddisfatto) {
                kebabbaro.sfornaKebab();
            }
        }
    }

    public void termina() {
        stop = true;
    }

}
