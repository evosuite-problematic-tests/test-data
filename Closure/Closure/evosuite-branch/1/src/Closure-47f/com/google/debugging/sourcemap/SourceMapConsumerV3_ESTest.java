/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 08:24:23 GMT 2018
 */

package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.debugging.sourcemap.SourceMapConsumerV3;
import com.google.debugging.sourcemap.proto.Mapping;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.JSONObject;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SourceMapConsumerV3_ESTest extends SourceMapConsumerV3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SourceMapConsumerV3.DefaultSourceMapSupplier sourceMapConsumerV3_DefaultSourceMapSupplier0 = new SourceMapConsumerV3.DefaultSourceMapSupplier();
      String string0 = sourceMapConsumerV3_DefaultSourceMapSupplier0.getSourceMap("File entry is missing or empty");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      try { 
        sourceMapConsumerV3_0.parse("g*1ro:{?QA:!L");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // JSON parse exception: org.evosuite.runtime.mock.java.lang.MockThrowable: A JSONObject text must begin with '{' at character 1
         //
         verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      // Undeclared exception!
      try { 
        sourceMapConsumerV3_0.parse((JSONObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      // Undeclared exception!
      try { 
        sourceMapConsumerV3_0.getOriginalSources();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      Mapping.OriginalMapping mapping_OriginalMapping0 = sourceMapConsumerV3_0.getMappingForLine(0, (-1720));
      assertNull(mapping_OriginalMapping0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      // Undeclared exception!
      try { 
        sourceMapConsumerV3_0.getMappingForLine(59, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SourceMapConsumerV3 sourceMapConsumerV3_0 = new SourceMapConsumerV3();
      // Undeclared exception!
      try { 
        sourceMapConsumerV3_0.getReverseMapping("", 26, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.debugging.sourcemap.SourceMapConsumerV3", e);
      }
  }
}
