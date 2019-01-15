/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 09:56:01 GMT 2019
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehensionLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Block block0 = new Block();
      ObjectProperty objectProperty0 = new ObjectProperty();
      block0.addChildToBack(objectProperty0);
      astRoot0.addChild(block0);
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "uB", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      ElementGet elementGet0 = new ElementGet(1);
      astRoot0.addChildToFront(elementGet0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "u", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Block block0 = new Block(12, 8);
      ContinueStatement continueStatement0 = new ContinueStatement(12, 5);
      Name name0 = new Name();
      continueStatement0.setLabel(name0);
      block0.addStatement(continueStatement0);
      astRoot0.addChild(block0);
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "+u", config0, (ErrorReporter) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Block block0 = new Block();
      NumberLiteral numberLiteral0 = new NumberLiteral((double) 1);
      block0.addChildrenToFront(numberLiteral0);
      astRoot0.addChild(block0);
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      Node node0 = IRFactory.transformTree(astRoot0, "uB", config0, (ErrorReporter) null);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(502);
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(138, 13);
      astRoot0.addChildToBack(parenthesizedExpression0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "0Mvk<_2", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ThrowStatement throwStatement0 = new ThrowStatement(astRoot0);
      astRoot0.addChildBefore(throwStatement0, (com.google.javascript.jscomp.mozilla.rhino.Node) null);
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, false, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "$]e", config0, (ErrorReporter) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(516);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, false, false);
      NewExpression newExpression0 = new NewExpression(3, 1);
      astRoot0.addChild(newExpression0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "0Mvk<_2", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, false, false);
      AstRoot astRoot0 = new AstRoot();
      StringLiteral stringLiteral0 = new StringLiteral();
      astRoot0.addChildToFront(stringLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "Mvk<*4_2", config0, toolErrorReporter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      WithStatement withStatement0 = new WithStatement(17);
      astRoot0.addChildrenToFront(withStatement0);
      Config config0 = new Config(treeSet0, treeSet0, false, false, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "$0", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(5);
      astRoot0.addChildrenToFront(arrayComprehensionLoop0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "uB", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(488);
      ForLoop forLoop0 = new ForLoop(2, 7);
      astRoot0.addChildToFront(forLoop0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "0Mvk<_2", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      astRoot0.addChildrenToFront(conditionalExpression0);
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, false, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "0Mvk<_2", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot((-324));
      Locale locale0 = Locale.ENGLISH;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      astRoot0.setType((-324));
      Config config0 = new Config(set0, set0, true, false, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "]1PqE", config0, (ErrorReporter) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -324
         //
         verifyException("com.google.javascript.jscomp.mozilla.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(488);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true, true);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(14, 19, token_CommentType0, "@`9DmDe:Xr*");
      astRoot0.addComment(comment0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, "v", config0, toolErrorReporter0);
      assertEquals((-1), node0.getLineno());
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(488);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true, true);
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(14, 19, token_CommentType0, "@`9DmDe:Xr*");
      astRoot0.addComment(comment0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, "0Mvk<_2", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
      assertEquals((-1), node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(488);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true, true);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(14, 19, token_CommentType0, "@`9DmDe:Xr*");
      astRoot0.setJsDocNode(comment0);
      astRoot0.addComment(comment0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, "0Mvk<_2", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Block block0 = new Block(12, 8);
      ContinueStatement continueStatement0 = new ContinueStatement(148, 5);
      block0.addStatement(continueStatement0);
      astRoot0.addChild(block0);
      Config config0 = new Config(treeSet0, treeSet0, false, false, false);
      Node node0 = IRFactory.transformTree(astRoot0, "+u", config0, (ErrorReporter) null);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(19, name0);
      astRoot0.addChildrenToFront(functionNode0);
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "$0", config0, (ErrorReporter) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      FunctionNode functionNode0 = new FunctionNode(19, (Name) null);
      astRoot0.addChildrenToFront(functionNode0);
      Config config0 = new Config(treeSet0, treeSet0, true, true, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "$0", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true, true);
      FunctionCall functionCall0 = new FunctionCall(17);
      astRoot0.addChild(functionCall0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "0Mk<_2", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }
}
