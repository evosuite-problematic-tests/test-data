/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:55:30 GMT 2018
 */

package org.apache.commons.math3.stat.inference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.stat.inference.MannWhitneyUTest;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MannWhitneyUTest_ESTest extends MannWhitneyUTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.FIXED;
      TiesStrategy tiesStrategy0 = TiesStrategy.RANDOM;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      try { 
        mannWhitneyUTest0.mannWhitneyUTest((double[]) null, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[3];
      double double0 = mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
      assertEquals(0.049534613435626706, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      double[] doubleArray0 = new double[7];
      try { 
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest();
      double[] doubleArray0 = new double[0];
      try { 
        mannWhitneyUTest0.mannWhitneyUTest(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NaNStrategy naNStrategy0 = NaNStrategy.REMOVED;
      TiesStrategy tiesStrategy0 = TiesStrategy.SEQUENTIAL;
      MannWhitneyUTest mannWhitneyUTest0 = new MannWhitneyUTest(naNStrategy0, tiesStrategy0);
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[0];
      try { 
        mannWhitneyUTest0.mannWhitneyU(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.stat.inference.MannWhitneyUTest", e);
      }
  }
}