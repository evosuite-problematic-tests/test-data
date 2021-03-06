/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 15:16:54 GMT 2019
 */

package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HarmonicFitter_ESTest extends HarmonicFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HarmonicFitter harmonicFitter0 = new HarmonicFitter((DifferentiableMultivariateVectorOptimizer) null);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        harmonicFitter0.fit(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.CurveFitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HarmonicFitter harmonicFitter0 = new HarmonicFitter((DifferentiableMultivariateVectorOptimizer) null);
      // Undeclared exception!
      try { 
        harmonicFitter0.fit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.0, 0.0, 0.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.0, 542.586, 542.586);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPointArray0[1];
      weightedObservedPointArray0[3] = weightedObservedPointArray0[0];
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1262.0, (-2863.53528564264), 1262.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1262.0, 1262.0, 0.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(1.0E-12, (-567.35), 1917.6224922195);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-2863.53528564264), 2804.3, 6.283185307179586);
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(1.0E-12, 6.283185307179586, (-384.1017969917847));
      weightedObservedPointArray0[4] = weightedObservedPoint4;
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint(6.283185307179586, 1.0, 0.0);
      weightedObservedPointArray0[5] = weightedObservedPoint5;
      WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(2804.3, 1799.3936, 0.0);
      weightedObservedPointArray0[6] = weightedObservedPoint6;
      WeightedObservedPoint weightedObservedPoint7 = new WeightedObservedPoint(0.0, 0.0, 1917.6224922195);
      weightedObservedPointArray0[7] = weightedObservedPoint7;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {1150.8621446056422, 0.001108568790468507, 1.5678280728287373}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(9.536008031, 9.536008031, 9.536008031);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(9.372459011427242, 9.372459011427242, 9.536008031);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(8.455995965938897, 8.455995965938897, 8.395586064445697);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(9.536008031, 8.395586064445697, 9.536008031);
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(8.455995965938897, 10.378830007621497, 9.536008031);
      weightedObservedPointArray0[4] = weightedObservedPoint4;
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint(10.378830007621497, 10.183612303433442, 10.378830007621497);
      weightedObservedPointArray0[5] = weightedObservedPoint5;
      WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(8.455995965938897, 10.23850347586449, 8.455995965938897);
      weightedObservedPointArray0[6] = weightedObservedPoint6;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {0.9916219715879002, 3.1681353818321614, (-0.3503570969295483)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(9.536008031, 9.536008031, 9.536008031);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(9.372459011427242, 9.372459011427242, 9.536008031);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(8.455995965938897, 8.455995965938897, 8.395586064445697);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(9.536008031, 8.395586064445697, 9.536008031);
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(8.455995965938897, 10.378830007621497, 9.536008031);
      weightedObservedPointArray0[4] = weightedObservedPoint4;
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint(10.378830007621497, 9.017628107716908E39, 10.378830007621497);
      weightedObservedPointArray0[5] = weightedObservedPoint5;
      WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(8.455995965938897, 10.23850347586449, 8.455995965938897);
      weightedObservedPointArray0[6] = weightedObservedPoint6;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        harmonicFitter_ParameterGuesser0.guess();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }
}
