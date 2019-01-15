/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 05:00:27 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.ProcessTweaks;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightweightMessageFormatter_ESTest extends LightweightMessageFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.LINE;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0, sourceExcerptProvider_SourceExcerpt0);
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make(compiler0.MOTION_ITERATIONS_ERROR, stringArray0);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals("ERROR - Exceeded max number of code motion iterations: null\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Node node0 = new Node(11, 4132, 11);
      DiagnosticType diagnosticType0 = ProcessTweaks.UNKNOWN_TWEAK_WARNING;
      JSError jSError0 = JSError.make("gPs=/$D7nS='qf&M", node0, diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("gPs=/$D7nS='qf&M:4132: WARNING - no tweak registered with ID {0}\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Node node0 = new Node(11, 4132, 11);
      Node node1 = new Node(0, node0, node0, node0);
      DiagnosticType diagnosticType0 = ProcessTweaks.UNKNOWN_TWEAK_WARNING;
      JSError jSError0 = JSError.make("gPs=/$D7nS='qf&M", node1, diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("gPs=/$D7nS='qf&M: WARNING - no tweak registered with ID {0}\n", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(0, 1, "^\n");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  0| ^", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion((-1033), (-1033), "");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(0, 0, "g<ui;");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertEquals("  0| g<ui;", string0);
      assertNotNull(string0);
  }
}
