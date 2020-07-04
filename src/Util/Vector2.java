/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author William
 */
public class Vector2 {

    public float x, y;

    public Vector2() {
        x = 0;
        y = 0;
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Vector que devuelve la posicion y negativa
     *
     * @return
     *
     */
    static public Vector2 up() {
        return new Vector2(0, -1);
    }

    /**
     * Vector que devuelve la posicion y positiva
     *
     * @return
     *
     */
    static public Vector2 down() {
        return new Vector2(0, 1);
    }

    /**
     * Vector que devuelve la posicion x negativa
     *
     * @return
     *
     */
    static public Vector2 left() {
        return new Vector2(-1, 0);
    }

    /**
     * Vector que devuelve la posicion x positiva
     *
     * @return
     *
     */
    static public Vector2 right() {
        return new Vector2(1, 0);
    }
    
        /**
     * Vector que devuelve la posicion x y y en el origen
     *
     * @return
     *
     */
    static public Vector2 zero() {
        return new Vector2(0, 0);
    }    

}
