/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 09:41:00 GMT 2018
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.XmlDotQuery;
import com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Config config0 = new Config(set0, set0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      PropertyGet propertyGet0 = new PropertyGet(32);
      astRoot0.addChildrenToBack(propertyGet0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config config0 = new Config(set0, set0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery(4, 0);
      astRoot0.addChildrenToBack(xmlDotQuery0);
      Node node0 = IRFactory.transformTree(astRoot0, "", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config config0 = new Config(set0, set0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      ObjectProperty objectProperty0 = new ObjectProperty();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK;
      Comment comment0 = new Comment(17, 110, token_CommentType0, "cinese (Cina)");
      objectProperty0.setJsDocNode(comment0);
      astRoot0.addChildrenToBack(objectProperty0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "error reporter", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config config0 = new Config(set0, set0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, ".Kr", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ContinueStatement continueStatement0 = new ContinueStatement(7, 26);
      astRoot0.addChildToFront(continueStatement0);
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      Config config0 = new Config(treeSet0, treeSet0, true, true, false);
      Node node0 = IRFactory.transformTree(astRoot0, ") must not be negative", config0, (ErrorReporter) null);
      assertEquals(132, node0.getType());
      assertTrue(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config config0 = new Config(set0, set0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      InfixExpression infixExpression0 = new InfixExpression(15, astRoot0, astRoot0, 0);
      astRoot0.addChildrenToBack(infixExpression0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "error reporter", config0, toolErrorReporter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Locale locale0 = Locale.CHINA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Config config0 = new Config(set0, set0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery(4, 0);
      xmlDotQuery0.setType(25);
      astRoot0.addChildrenToBack(xmlDotQuery0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
