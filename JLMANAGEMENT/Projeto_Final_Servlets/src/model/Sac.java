/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author leand
 */
public class Sac {

    private String nomeTec;
    private String contatoTec;
    private String descProblema;
    private Date dataProblema;

    public Sac(String nomeTec, String contatoTec, String descProblema, Date dataProblema) {
        this.nomeTec = nomeTec;
        this.contatoTec = contatoTec;
        this.descProblema = descProblema;
        this.dataProblema = dataProblema;
    }

    public String getNomeTec() {
        return nomeTec;
    }

    public String getContatoTec() {
        return contatoTec;
    }

    public String getDescProblema() {
        return descProblema;
    }

    public Date getDataProblema() {
        return dataProblema;
    }

    public void setDescProblema(String descProblema) {
        this.descProblema = descProblema;
    }

}
