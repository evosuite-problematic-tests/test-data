/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 15:33:46 GMT 2019
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.apache.commons.math3.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertEquals(1, population0.getPopulationSize());
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 858, (-275.081));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-275.081)
         //
         verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(2642, 2642);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (2,642)
         //
         verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
      }
  }
}
