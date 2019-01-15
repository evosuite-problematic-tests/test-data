/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:27:08 GMT 2018
 */

package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.OngoingInjecter;
import org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeBasedCandidateFilter_ESTest extends TypeBasedCandidateFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
      TypeBasedCandidateFilter typeBasedCandidateFilter0 = new TypeBasedCandidateFilter(finalMockCandidateFilter0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Field> linkedList1 = new LinkedList<Field>();
      OngoingInjecter ongoingInjecter0 = typeBasedCandidateFilter0.filterCandidate(linkedList0, (Field) null, linkedList1, (Object) null);
      assertNotNull(ongoingInjecter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
      TypeBasedCandidateFilter typeBasedCandidateFilter0 = new TypeBasedCandidateFilter(finalMockCandidateFilter0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      // Undeclared exception!
      try { 
        typeBasedCandidateFilter0.filterCandidate(linkedList0, (Field) null, (List<Field>) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter", e);
      }
  }
}
