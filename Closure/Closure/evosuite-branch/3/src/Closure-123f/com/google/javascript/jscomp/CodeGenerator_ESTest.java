/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:48:39 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.Compiler;
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
      String string0 = codeGenerator0.regexpEscape("\"TB|tX15{&jG-ew+*3\"");
      assertEquals("/\"TB|tX15{&jG-ew+*3\"/", string0);
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
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("TB|tX15{&jG-ew+*3");
      assertEquals("\"TB|tX15{&jG-ew+*3\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("w{+a 2f]\r[Sc2P");
      assertEquals("/w{+a 2f]\\r[Sc\\u007f2P/", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString("", 135, 0);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newNumber(7.516192768E8);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false);
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
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber(",Uj_7TX, aOWu");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("9");
      assertEquals(9.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("I");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("600");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("00");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.BEFORE_DANGLING_ELSE;
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString(85, "IN_FOR_INIT_CLAUSE");
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, true, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      Node node0 = Node.newNumber(Double.NaN);
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
  public void test16()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      codeGenerator0.addList((Node) null, false, codeGenerator_Context0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newNumber((double) (-1932));
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
  public void test18()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString(7, "-c!id&5*{");
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
  public void test20()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("() {\n\t[native code]\n}\n");
      assertEquals("\"() {\\n\\t[native code]\\n}\\n\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("k'dr");
      assertEquals("\"k'dr\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape("|5=D!kb", charsetEncoder0);
      assertEquals("/|5=D!kb/", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape("o>#@Lt4@I2h<#h`");
      assertEquals("/o>#@Lt4@I2h<#h`/", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("\n");
      assertEquals("/\\n/", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("dY]>/2r$=");
      assertEquals("\"dY]>/2r$=\"", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("|5=D!kb");
      assertEquals("\"|5\\x3dD!kb\"", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString(",n&_TX, aOWu");
      assertEquals("\",n\\x26_T\\u007fX, aOWu\"", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape(",n&_TX, aOWu");
      assertEquals("/,n&_T\\u007fX, aOWu/", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("o>#@Lt4@I2h<#h`");
      assertEquals("\"o\\x3e#@Lt4@I2h\\x3c#h`\"", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("XzcJi@./(^Mw(->0");
      assertEquals("\"XzcJi@.\\u007f/(^Mw(->0\"", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("pilo9</scriptruxb");
      assertEquals("\"pilo9\\x3c/scriptruxb\"", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("/pilO9<!--[_?)RuXB/");
      assertEquals("\"/pilO9\\x3c!--[_?)RuXB/\"", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("\u001B[39m");
      assertEquals("\"\\u001b[39m\"", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape(",Uj_7TX, aOWu");
      assertEquals(",Uj_7TX, aOWu", string0);
  }
}