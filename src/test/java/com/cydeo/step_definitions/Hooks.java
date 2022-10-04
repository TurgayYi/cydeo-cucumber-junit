package com.cydeo.step_definitions;

/*
In this class we will be able to pass pre & post conditions to
each scenario and each step
 */

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before//import from io.cucumber.java not from junit
    public void setupScenario(){

        System.out.println("===Setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario(){
        System.out.println("===Closing browser using cucumber @After");
        System.out.println("===Scenario ended /Take screenshot if failed");
    }

   @BeforeStep
   public void setupStep(){
       System.out.println(------------applying setup using @Beforestep);
   }

   @AfterStep
    public void afterStep(){
       System.out.println("-------- applying tearDown using @AfterStep");
   }



}
