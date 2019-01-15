/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 15:09:17 GMT 2019
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListPopulation_ESTest extends ListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(153, 1.0);
      elitisticListPopulation0.nextGeneration();
      assertEquals(153, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(153, 1.0);
      elitisticListPopulation0.toString();
      assertEquals(153, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2406, 0.0);
      elitisticListPopulation0.spliterator();
      assertEquals(2406, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(2572, 0.0);
      elitisticListPopulation0.getPopulationSize();
      assertEquals(2572, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 1, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      linkedList0.add((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(9, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.setChromosomes(list0);
      assertEquals(9, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setChromosomes((List<Chromosome>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.addLast((Chromosome) null);
      linkedList0.add((Chromosome) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setChromosomes(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(9, 0.0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.addChromosomes(list0);
      assertEquals(9, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.addChromosome((Chromosome) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.addChromosomes(list0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.addChromosome((Chromosome) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(9, 0.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.getFittestChromosome();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(88, 0.0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setPopulationLimit((-114));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      elitisticListPopulation0.setPopulationLimit(28);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.setPopulationLimit(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }
}
