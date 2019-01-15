/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 12:58:29 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodePrinter;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodePrinter_ESTest extends CodePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = Node.newNumber((-121.46802));
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      String string0 = codePrinter_Builder0.build();
      assertEquals("-121.46802", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString(" {");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setLineBreak(true);
      assertSame(codePrinter_Builder0, codePrinter_Builder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = Node.newString(" {");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      Charset charset0 = Charset.defaultCharset();
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputCharset(charset0);
      assertSame(codePrinter_Builder1, codePrinter_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = Node.newString(" {");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setPrettyPrint(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("\" {\"", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newString("=");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      node0.setSourceEncodedPositionForTree((-2173));
      node0.setSourceFileForTesting("=");
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"=\"", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodePrinter codePrinter0 = new CodePrinter();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newString("=");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setLineLengthThreshold((-3465));
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"=\"", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newString("=");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      node0.setSourceFileForTesting("=");
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"=\"", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = Node.newString("=");
      Node node1 = new Node(42, node0, node0, 31, 44);
      node0.useSourceInfoIfMissingFromForTree(node1);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      codePrinter_Builder0.setSourceMapDetailLevel(sourceMap_DetailLevel0);
      codePrinter_Builder0.setSourceMap(sourceMap0);
      node0.setSourceFileForTesting("=");
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"=\"", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newString(44, "lOSLv&Bx|3GS", 44, 878);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setTagAsStrict(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("'use strict';true", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newString(44, "lOSLv&Bx|3GS", 44, 878);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputTypes(true);
      codePrinter_Builder1.setTagAsStrict(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("'use strict';true", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newString("8QEJ");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setLineLengthThreshold(38);
      codePrinter_Builder1.setTagAsStrict(true);
      codePrinter_Builder0.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("'use strict';\"8QEJ\"", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newString(44, "lOSLv&Bx|3GS", 44, 878);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.setSourceMapDetailLevel((SourceMap.DetailLevel) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder((Node) null);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot build without root node being specified
         //
         verifyException("com.google.javascript.jscomp.CodePrinter$Builder", e);
      }
  }
}
