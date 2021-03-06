/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 11:35:06 GMT 2018
 */

package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.TokenStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TokenStream_ESTest extends TokenStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TokenStream tokenStream0 = new TokenStream();
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("fQV");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("byte");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("W't_3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(" ^g_)T");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("boolean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("QGstk00b");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("transient");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("(q|.W6`!(x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("0P4yTi>x%C~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("+eOJC3%Lf,BA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("{f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("^n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("in");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("2o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("do");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Pni");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("i[W");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("nyQ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("tXy");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("v&p");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("f\r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("for");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("iFt");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("thr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("v%r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("hort");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ctch");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("d@,&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("e6jK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("f!_X");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("goto");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ipot");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("j5TL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("k Pl");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("long");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("m|S6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("n8oa");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("oble");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("p36-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("qq_#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("rAH}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("shot");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ttoe");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("ugB;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("void");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("with");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("x{h+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("c;De");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("cf_r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("eCFe");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("e|xm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("tt`o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("stati");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("![bpN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("qbc7'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("<3d;6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("break");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("defau");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("degai");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("kshot");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("while");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("@eji ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Nfk}F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("false");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("' m'W");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("finar");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("short");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("[~qOU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("pyr[s");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("BLsfz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("const");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("eInds");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("float");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("mport");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("native");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("qbpc7'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("vcB|5e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("super");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("delete");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(")f={-i");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("3gFVk9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("throws");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("*i;l!t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("cj&, ;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("skupjr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("JlN]^r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("import");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("-nK9.,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("double");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("fpDGUe");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Oq1n;{");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("\rZXkE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("9s4{I");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("static");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("=us\"tD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("Lv]%[i");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("switch");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("export");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("typeof");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("return");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("3e-(;y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("package");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("default");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("finally");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("_r#e-:N");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("exDS)or");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("6WrZ.F-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("anT*Xv\"N");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("continue");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("def#ault");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("function");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("volatile");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("interface");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("p8d^m:;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword(";2UC&)9yU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("implements");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      boolean boolean0 = TokenStream.isKeyword("instanceof");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("boolean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("+ }}8Ea_xP 44");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("*%\"<o:K{9ek5zhl");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("r3$lpqgN~VuLnv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      boolean boolean0 = TokenStream.isJSIdentifier("fY!rK?vOjR~N3");
      assertFalse(boolean0);
  }
}
