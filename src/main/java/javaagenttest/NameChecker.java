/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaagenttest;

/**
 *
 * @author hkropp
 */
public class NameChecker {

    public NameChecker(String name) {
        this.check(name);
    }
    
    public boolean check(String name) {
        System.out.println("AgentTestMain.check allowed: "+ name);
        return true;
    }
    
}
