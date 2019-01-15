/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 16:27:47 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = new Node(0);
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody(node0);
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
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(4, 4, 4);
      String string0 = compiler0.toSource(node0);
      assertEquals("return", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("7]]>*_w=J1");
      assertEquals("/7]]\\x3e*_w=J1/", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addList((Node) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString("7_]>H_w=J1");
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
  public void test06()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("2U3Q");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("2");
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("/\n/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("0232");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("21");
      assertEquals(21.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString("57_]X>=H_w=J1");
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
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
  public void test13()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = Node.newString("N{+Q/Jk6<!--5a^$7q'");
      Node node1 = new Node(51, node0, node0, node0);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node1, true, codeGenerator_Context0);
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
      Node node0 = new Node(10, 10, 10);
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
  public void test16()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = new Node(0);
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
  public void test18()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("\"TJ2");
      assertEquals("/\"TJ2/", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("&S");
      assertEquals("/&S/", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape("]GzSZSy[z9^'", charsetEncoder0);
      assertEquals("/]GzSZSy[z9^'/", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("q}JgJ=C>1ce^AI");
      assertEquals("\"q}JgJ\\x3dC\\x3e1ce^AI\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape("q}JgJ=C>1ce^AI", charsetEncoder0);
      assertEquals("/q}JgJ=C>1ce^AI/", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape(">:Th[eQVA|LmqL<27i", charsetEncoder0);
      assertEquals("/>:Th[eQVA|LmqL<27i/", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("7_]>H_w=J1");
      assertEquals("/7_]>H_w=J1/", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Logger logger0 = Logger.getLogger(":oL1OU5XH<@*");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("^ddo<!--ME ;z");
      assertEquals("\"^ddo\\x3c!--ME ;z\"", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Logger logger0 = Logger.getLogger(":oL1OU5XH<@*");
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape(":oL1OU5XH<@*", (CharsetEncoder) null);
      assertEquals("/:oL1OU5XH<@*/", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("^dd</script");
      assertEquals("/^dd\\x3c/script/", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape(":oL1OUXHxn<!--", charsetEncoder0);
      assertEquals("/:oL1OUXHxn\\x3c!--/", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000");
      assertEquals("\"\\u0001\\x00\\u00a0\\x00\\x00\\x00\\x00\\x00\\x00\\t\\n\\x0B\\f\\r\\x00\\x00\\u2028\\u2029\\x00\\x00\\x00\\x00\\x00\\u202f\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00 \\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\u3000\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\u0085\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200a\\x00\\x00\\x00\\x00\\x00\\u205f\\u1680\\x00\\x00\\u180e\\x00\\x00\\x00\"", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("N+Q/Jk6<!--5a^$q'");
      assertEquals("N+Q/Jk6<!--5a^$q'", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\u0000\u00AD\u0600\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u206A\u3000v\uFEFF\uFFF9\uFFFA");
      assertEquals("\\u0000\\u007f\\u00ad\\u0600\\u06dd\\u070f\\u1680\\u180e\\u2000\\u2028\\u205f\\u206a\\u3000v\\ufeff\\ufff9\\ufffa", string0);
  }
}