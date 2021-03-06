/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 20:43:24 GMT 2019
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KMeansPlusPlusClusterer_ESTest extends KMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      int[] intArray0 = new int[1];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      kMeansPlusPlusClusterer0.cluster(list0, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.add(euclideanIntegerPoint0);
      linkedList0.add(euclideanIntegerPoint0);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList0, 2, 2598);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      int[] intArray0 = new int[1];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.add(euclideanIntegerPoint0);
      linkedList0.add(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      List<Cluster<EuclideanIntegerPoint>> list0 = kMeansPlusPlusClusterer0.cluster(linkedList0, 2, 2);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.add(euclideanIntegerPoint0);
      linkedList0.add(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList0, 2, 3013);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.add(euclideanIntegerPoint0);
      linkedList0.add(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster(linkedList0, 2, 819);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // empty cluster in k-means
         //
         verifyException("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      int[] intArray0 = new int[9];
      intArray0[2] = Integer.MAX_VALUE;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      List<Cluster<EuclideanIntegerPoint>> list1 = kMeansPlusPlusClusterer0.cluster(list0, (-474), 331);
      assertFalse(list1.contains(cluster0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.add((EuclideanIntegerPoint) null);
      // Undeclared exception!
      kMeansPlusPlusClusterer0.cluster(linkedList0, 3985, 175);
  }
}
