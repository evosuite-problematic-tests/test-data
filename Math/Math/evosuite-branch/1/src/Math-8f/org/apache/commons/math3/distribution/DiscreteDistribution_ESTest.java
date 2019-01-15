/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:22:03 GMT 2018
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      discreteDistribution0.reseedRandomGenerator(1577);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte) (-107));
      Double double0 = new Double((byte) (-107));
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) null, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -107 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      double double1 = discreteDistribution0.probability(double0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>((Double) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(1574);
      Double double0 = new Double(2091.02306681021);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>(linkedList0);
      Integer integer1 = new Integer(2001);
      double double1 = discreteDistribution0.probability(integer1);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      List<Pair<Double, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(1577);
      assertEquals(1577, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(0.5);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      try { 
        discreteDistribution0.sample((-383));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-383)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }
}
