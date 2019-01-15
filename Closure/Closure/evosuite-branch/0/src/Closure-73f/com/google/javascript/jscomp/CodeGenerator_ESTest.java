/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 05:22:27 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
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
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      // Undeclared exception!
      try { 
        codeGenerator0.add("");
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
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = new Node('U', 'U', 'U');
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
  public void test02()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("n~q!ca_]]>v:jG #_g", '\u0094', "n~q!ca_]]>v:jG #_g", "n~q!ca_]]>v:jG #_g", "n~q!ca_]]>v:jG #_g", (CharsetEncoder) null);
      assertEquals("\u0094n~q!ca\\u007f_]]\\>v:jG #_g\u0094", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
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
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("9(0&1A$5<!--2ua");
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
  public void test05()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(34, nodeArray0);
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
  public void test06()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString(0, "}D<ZR`gx\"j", 0, 0);
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
  public void test07()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addList((Node) null, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.forName("default");
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("9");
      assertEquals(9.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("\t");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("swiMlhm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("Bad GETELEM: expected 2 chilren but got %s");
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
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("\"com.google.javascript.jscomp.ConcreteType$ConcreteUniqueType\"", charsetEncoder0);
      assertEquals("'\"com.google.javascript.jscomp.ConcreteType$ConcreteUniqueType\"'", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = CodeGenerator.jsString("arF0p]nl',4V(M?o|i", (CharsetEncoder) null);
      assertEquals("\"arF0p]nl',4V(M?o|i\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("JS var assignments:\n", 'd', "JS var assignments:\n", "L.#-", "JS var assignments:\n", (CharsetEncoder) null);
      assertEquals("dJS var assignments:\\nd", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("vN!fi6s<1\"NbP$W$Ih");
      assertEquals("\"vN!f\\u007fi6s<1\\\"NbP$W$Ih\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("'");
      assertEquals("\"'\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("3>'~1Hs");
      assertEquals("/3>'~1Hs/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("<!-->Kp", 'J', (String) null, "1\"nbp$w", "\t", charsetEncoder0);
      assertEquals("J<\\!--\\>KpJ", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("q(|;&XNIU0_->(", 'P', "", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor", "-i:kC'B", charsetEncoder0);
      assertEquals("Pq(|;&XNIU0_->(P", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("n;~q?ca]>v:jG#^Mg9", charsetEncoder0);
      assertEquals("\"n;~q?ca]>v:jG#^Mg9\"", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.regexpEscape("|p</script#x/h+:", charsetEncoder0);
      assertEquals("/|p<\\/script#x/h+:/", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\u0084n;~q?ca]>v:jG#^Mg9\u0084");
      assertEquals("\\u0084n;~q?ca\\u007f]>v:jG#^Mg9\\u0084", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("++");
      assertEquals("++", string0);
  }
}
