/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:58:33 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape("^*>", charsetEncoder0);
      assertEquals("/^*>/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.tagAsStrict();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      Node node0 = Node.newString(0, "", 1012, (-287));
      // Undeclared exception!
      try { 
        codeGenerator0.addAllSiblings(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("Z]>GTMty~ ?");
      assertEquals("/Z]>GTMty~\\u007f ?/", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addList((Node) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      Node node0 = Node.newString("debugger");
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("IiV:F");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber(" \u00A0\u00AD\u0604\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("1475");
      assertEquals(1475.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString("Unknown class name", 7, (-4402));
      node0.setType(85);
      // Undeclared exception!
      try { 
        codeGenerator0.addArrayList(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newNumber((-1.0));
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape(") {\n", (CharsetEncoder) null);
      assertEquals("/) {\\n/", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("F^S<r'x\"2>z", (CharsetEncoder) null);
      assertEquals("/F^S<r'x\"2>z/", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("J&-3&{");
      assertEquals("/J&-3&{/", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape("]<Zj=t<N4&/");
      assertEquals("/]<Zj=t<N4&//", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("=1zb;O)NeDwl4Ph,");
      assertEquals("/=1zb;O)NeDwl4Ph,/", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("]<Zj=t<N4&/");
      assertEquals("\"]\\x3cZj\\x3dt\\x3cN4\\x26/\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape(">F^S<!-->z");
      assertEquals("/>F^S\\x3c!--\\x3ez/", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("F^S<!--7\"4T>(z");
      assertEquals("\"F^S\\x3c!--7\\\"4T\\x3e(z\"", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape(">F^S<!->z");
      assertEquals("/>F^S<!->z/", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("f^s</scriptt>(z", (CharsetEncoder) null);
      assertEquals("/f^s\\x3c/scriptt>(z/", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape(" \u00A0\u00AD\u0604\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB");
      assertEquals(" \\u00a0\\u00ad\\u0604\\u06dd\\u070f\\u1680\\u180e\\u200f\\u202f\\u2064\\u206f\\u3000\\uf8ff\\ufeff\\ufff9\\ufffb", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("F^S<r'x\"2>z");
      assertEquals("F^S<r'x\"2>z", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\u0000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61");
      assertEquals("\\u0000\\u05be\\u05d0\\u05f3\\u0600\\u0750\\u0e00\\u1e00\\u2100\\ufb50\\ufe70\\uff61", string0);
  }
}
