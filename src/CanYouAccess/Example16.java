/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanYouAccess;

/**
 *
 * @author Supaada-q214
 */
class Container {

    // inner class
    private class Continent {

        public void print() {
            System.out.println("This is an inner class");
        }
    }
    // method to give access to the private inner class' method

    void printContinent() {
        Continent continent = new Continent();
        continent.print();
    }
}

class Example16 {

    public static void main(String[] args) {
        Container container = new Container();
        container.printContinent();
    }
}
