/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 08:59:36 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.ProcessDefines;
import com.google.javascript.jscomp.ProcessTweaks;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightweightMessageFormatter_ESTest extends LightweightMessageFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatLine("tweak getter function JSC_TWEAK_WRONG_GETTER_TYPE_WARNING used for tweak registered using JSC_TWEAK_WRONG_GETTER_TYPE_WARNING", (-1));
      assertEquals("tweak getter function JSC_TWEAK_WRONG_GETTER_TYPE_WARNING used for tweak registered using JSC_TWEAK_WRONG_GETTER_TYPE_WARNING", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0);
      // Undeclared exception!
      try { 
        lightweightMessageFormatter0.formatError((JSError) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.LightweightMessageFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      DiagnosticType diagnosticType0 = ProcessTweaks.TWEAK_WRONG_GETTER_TYPE_WARNING;
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("WARNING - tweak getter function null used for tweak registered using null\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = ProcessDefines.UNKNOWN_DEFINE_WARNING;
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make("assign_mul", 1316, 1316, checkLevel0, diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("assign_mul:1316: WARNING - unknown @define variable null\n", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      DiagnosticType diagnosticType0 = TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH;
      String[] stringArray0 = new String[10];
      JSError jSError0 = JSError.make("JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH", (-6), (-6), diagnosticType0.level, diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH: WARNING - mismatch of the null property type and the type of the property it overrides from superclass null\noriginal: null\noverride: null\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Node node0 = Node.newString("@");
      DiagnosticType diagnosticType0 = Compiler.MISSING_ENTRY_ERROR;
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make("x3S4Jr\")`2Dm^+ei{6$", node0, diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals("x3S4Jr\")`2Dm^+ei{6$: ERROR - required entry point \"null\" never provided\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion((-2289), (-2289), "^\n");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  -2289| ^", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(121, 121, "");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(0, 0, "#s*I!,");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  0| #s*I!,", string0);
  }
}
