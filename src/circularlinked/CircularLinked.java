/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinked;

import java.util.Random;

/**
 *
 * @author esref
 */
public class CircularLinked {

    public static void main(String[] args) {
        CircularLList list = new CircularLList();
        Random generator = new Random();

        list.find(1);

        for (int i = 0; i <= 10; i++) {
            list.add(generator.nextInt(100) + 1);          
        }

        list.printList();
    }

}
