/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 11:00:37 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.Node;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NameAnalyzer_ESTest extends NameAnalyzer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
      MockFile mockFile0 = new MockFile("vOa", "vOa");
      SourceFile sourceFile0 = SourceFile.fromFile((File) mockFile0);
      CompilerInput compilerInput0 = new CompilerInput(sourceFile0, true);
      Node node0 = compilerInput0.getAstRoot(compiler0);
      nameAnalyzer0.process(node0, node0);
      String string0 = nameAnalyzer0.getHtmlReport();
      assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "win=dow");
      nameAnalyzer0.process(node0, node0);
      assertFalse(node0.wasEmptyNode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
      Node node0 = Node.newString("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>", 4, 4);
      Node node1 = new Node(4, node0, node0, 1581, 42);
      nameAnalyzer0.process(node1, node1);
      assertEquals(57, Node.REFLECTED_OBJECT);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "window");
      nameAnalyzer0.process(node0, node0);
      assertFalse(node0.isTrue());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.NameAnalyzer$FindDeclarationsAndSetters");
      nameAnalyzer0.process(node0, node0);
      assertEquals(51, Node.STATIC_SOURCE_FILE);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("G(3[OoUyR);9?J-");
      nameAnalyzer0.process(node0, node0);
      nameAnalyzer0.process(node0, node0);
      assertFalse(node0.isName());
  }
}