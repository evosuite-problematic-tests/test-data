/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 14:19:38 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussNewtonOptimizer_ESTest extends GaussNewtonOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer((ConvergenceChecker<PointVectorValuePair>) null);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.doOptimize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplePointChecker<PointVectorValuePair> simplePointChecker0 = new SimplePointChecker<PointVectorValuePair>(504.0354, 504.0354);
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(simplePointChecker0);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", e);
      }
  }
}
