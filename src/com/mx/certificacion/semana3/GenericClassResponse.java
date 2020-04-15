/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana3;

/**
 *
 * @author Supaada-q214
 */
public class GenericClassResponse<E, T> {

    private E poElemento;
    private T psException;
    private ResponseBody poResponse;

    public E getPoElemento() {
        return poElemento;
    }

    public void setPoElemento(E poElemento) {
        this.poElemento = poElemento;
    }

    public T getPsException() {
        return psException;
    }

    public void setPsException(T psException) {
        this.psException = psException;
    }

    public ResponseBody getPoResponse() {
        return poResponse;
    }

    public void setPoResponse(ResponseBody poResponse) {
        this.poResponse = poResponse;
    }

}
