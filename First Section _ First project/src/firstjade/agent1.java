/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjade;
/**
 * ************* Over view of Agent and it's lifeCycle ************
 * 
 * Life cycle of Agent consist of 3 processes :
 * 
 * 1/ create Agent -> setUp()
 * 
 * 2/ behaviour of Agent -> you create class of bahavoir from class extends from jade.core.behaviours.Behaviour
 * any behaviour of Agent consist of 2 Methods :
 * 1- action() -> contain all service code that agent provide.
 * 2- done() -> called when action of Agent done.
 * 
 * 3/takeDown() -> that kill the agent
 */


/**
 * To make this class as one of Agents .. extend from jade.core.Agent
 *  jade.core.Agent is abstract class that has 1 abstract function called setUp()
 * setUp() function is used as Constructor when you create Agent
 * 
 * there is another 
 */
public class agent1 extends jade.core.Agent{
    @Override
    public void setup(){
        /**
         * to get all Agent properities .. use this.getAID() "get Agent ID"
         */
        /**
         * To return global name of Agent that called from Agents from outside of Container 
         * of from other platform use getAID().getName().
         */
        System.out.println(this.getAID().getName());
        /**
         * to get Agent local name to deal with other Agents from the same Container
         * use getAID().getlocalName()
         */
        System.out.println(this.getAID().getLocalName());
        System.out.println("Agent 1 Start");
        
    }
    
    
    /**
     * Method called when we use .toDelete() in setUp() method.
     */
    @Override
    public void takeDown(){
        System.out.println("Dead");
    
    }
}
