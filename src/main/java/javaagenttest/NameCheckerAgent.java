/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaagenttest;

import java.lang.instrument.Instrumentation;

/**
 *
 * @author hkropp
 */
public class NameCheckerAgent {

    public static final String AUTHORIZATION_AGENT_PARAM = "testagent";

    public static void premain(String agentArgs, Instrumentation inst) {
        if (agentArgs != null && AUTHORIZATION_AGENT_PARAM.equalsIgnoreCase(agentArgs.trim())) {
            inst.addTransformer(new CheckNameTransformer());
        }
    }

    static public boolean check(String name) throws Exception {
        System.out.println("NameCheckerAgent.check : "+ name);
        if(name.equals("Dr.No"))
            throw new Exception("Wrong Name! "+ name);
        return true;
    }

}
