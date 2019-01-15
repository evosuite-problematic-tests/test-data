/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 14:50:07 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(1006.615788257);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
      discreteDistribution0.reseedRandomGenerator((-5069L));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte)92);
      Double double0 = new Double((-3100.8));
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,100.8 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(1.2050611538762142);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      double double1 = discreteDistribution0.probability(double0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(951.0);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(951.0);
      Pair<Double, Double> pair0 = new Pair<Double, Double>((Double) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Double double0 = new Double(628.1561656);
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      Long long0 = new Long(342L);
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>(linkedList0);
      Long long1 = new Long(3702L);
      double double1 = discreteDistribution0.probability(long1);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(1.2050611538762142);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      List<Pair<Double, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(1.2050611538762142);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(1001);
      assertEquals(1001, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(9.183480622172801E148);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.add(pair1);
      linkedList0.offerFirst(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
      Object object0 = discreteDistribution0.sample();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a((-1L));
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((double) (-1L));
      Double double0 = new Double(1389.1959);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(well1024a0, linkedList0);
      try { 
        discreteDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }
}