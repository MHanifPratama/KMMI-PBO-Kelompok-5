/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalexercise;

/**
 *
 * @author USER
 */
public abstract class Employee {
    protected String name = "";
    protected String afm  = "";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAfm() {
        return afm;
    }
    public void setAfm(String afm) {
        this.afm = afm;
    }
    abstract int payment();
}
