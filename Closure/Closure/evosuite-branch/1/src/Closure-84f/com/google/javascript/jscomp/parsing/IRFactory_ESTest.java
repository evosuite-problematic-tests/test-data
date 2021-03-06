/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 09:47:01 GMT 2018
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true);
      ObjectProperty objectProperty0 = new ObjectProperty(0);
      astRoot0.addChildToFront(objectProperty0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "WS", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      DoLoop doLoop0 = new DoLoop(4, 20);
      astRoot0.addChildToFront(doLoop0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(22, 22);
      astRoot0.addChildToBack(expressionStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "8", (Config) null, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      ForInLoop forInLoop0 = new ForInLoop(5, 19);
      astRoot0.addChild(forInLoop0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "YJ", (Config) null, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, true);
      ObjectProperty objectProperty0 = new ObjectProperty(8);
      objectProperty0.setOperator(0);
      astRoot0.addChildToFront(objectProperty0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(2, 5, token_CommentType0, "");
      Token.CommentType token_CommentType1 = Token.CommentType.JSDOC;
      comment0.setCommentType(token_CommentType1);
      astRoot0.addComment(comment0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(2, 5, token_CommentType0, "");
      astRoot0.addComment(comment0);
      Node node0 = IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
      assertEquals(132, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      Config config0 = new Config(set0, set0, false, false);
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK;
      Comment comment0 = new Comment(12, (-1198), token_CommentType0, ")NJ(W^[-'Ov");
      astRoot0.setJsDocNode(comment0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "i%,_", config0, errorCollector0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(4003);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      ReturnStatement returnStatement0 = new ReturnStatement();
      astRoot0.addChildrenToFront(returnStatement0);
      Config config0 = new Config(treeSet0, treeSet0, false, true);
      Node node0 = IRFactory.transformTree(astRoot0, "-_aP", config0, (ErrorReporter) null);
      assertEquals(132, node0.getType());
      assertTrue(node0.hasOneChild());
      assertEquals((-1), node0.getLineno());
  }
}
