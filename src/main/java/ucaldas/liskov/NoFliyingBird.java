/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucaldas.liskov;

/**
 *
 * @author DERLY
 */
public abstract class  NoFliyingBird extends Bird {

    public NoFliyingBird(String eat, String tweet) {
        super(eat, tweet);
    }
    public void walk(){
        System.out.println("Caminando ando");
    };
    
}
