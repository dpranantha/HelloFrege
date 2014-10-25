/*
  Source code is in UTF-8 encoding. The following symbols may appear, among others:
  α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ ς σ τ υ φ χ ψ ω « • ¦ »  ﬁ ﬂ ƒ
  If you can't read this, you're out of luck.
  This code was generated with the frege compiler version 3.21.500-g88270a0 from
  /projects/git/HelloFrege/src/main/frege/HelloFrege.fr Do not edit this file!
  Instead, edit the source file and recompile.
*/


import frege.prelude.Maybe;
import frege.java.Lang;
import frege.control.Semigroupoid;
import frege.Prelude;
import frege.control.Category;
import frege.data.List;
import frege.data.Char;
import frege.data.Monoid;
import frege.java.IO;
import frege.java.util.Regex;
import frege.java.Util;
import frege.prelude.Floating;
import frege.test.QuickCheckArbitrary;
import frege.prelude.PreludeList;
import frege.prelude.PreludeBase;
import frege.prelude.PreludeArrays;
import frege.prelude.PreludeIO;
import frege.prelude.PreludeText;
import frege.prelude.PreludeMonad;
import frege.system.Random;
import frege.test.QuickCheck;
import frege.test.QuickCheckProperty;
import frege.test.QuickCheckGen;
import frege.test.QuickCheckException;
import frege.test.QuickCheckModifiers;
import frege.test.QuickCheckTest;
import frege.test.QuickCheckState;
import frege.test.QuickCheckText;

@SuppressWarnings("unused")
@frege.runtime.Meta.FregePackage(
  source="/projects/git/HelloFrege/src/main/frege/HelloFrege.fr", time=1414261391978L,
  ops={
    @frege.runtime.Meta.Operator(name="%", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name="!~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name="!:", kind=1, prec=13),
    @frege.runtime.Meta.Operator(name="!!", kind=0, prec=1),
    @frege.runtime.Meta.Operator(name="!=", kind=2, prec=10),
    @frege.runtime.Meta.Operator(name="!==", kind=2, prec=10),
    @frege.runtime.Meta.Operator(name="$!", kind=1, prec=16),
    @frege.runtime.Meta.Operator(name="$", kind=1, prec=16),
    @frege.runtime.Meta.Operator(name="+", kind=0, prec=4),
    @frege.runtime.Meta.Operator(name="*", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name="&&", kind=1, prec=11),
    @frege.runtime.Meta.Operator(name="**", kind=1, prec=2),
    @frege.runtime.Meta.Operator(name="*>", kind=0, prec=13),
    @frege.runtime.Meta.Operator(name="++", kind=1, prec=4),
    @frege.runtime.Meta.Operator(name=".&.", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name=".&&.", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name="/=", kind=2, prec=10),
    @frege.runtime.Meta.Operator(name="/", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name=".||.", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name="/~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name=":", kind=1, prec=13),
    @frege.runtime.Meta.Operator(name="<*", kind=0, prec=13),
    @frege.runtime.Meta.Operator(name="<", kind=2, prec=8),
    @frege.runtime.Meta.Operator(name=":=", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name="<$>", kind=0, prec=13),
    @frege.runtime.Meta.Operator(name="<*>", kind=0, prec=13),
    @frege.runtime.Meta.Operator(name="<+>", kind=1, prec=4),
    @frege.runtime.Meta.Operator(name="<=>", kind=2, prec=9),
    @frege.runtime.Meta.Operator(name="<=", kind=2, prec=8),
    @frege.runtime.Meta.Operator(name="<<", kind=0, prec=5),
    @frege.runtime.Meta.Operator(name="<.", kind=2, prec=16),
    @frege.runtime.Meta.Operator(name="<<<", kind=1, prec=16),
    @frege.runtime.Meta.Operator(name="<=<", kind=1, prec=14),
    @frege.runtime.Meta.Operator(name="<~", kind=1, prec=1),
    @frege.runtime.Meta.Operator(name="<|>", kind=0, prec=14),
    @frege.runtime.Meta.Operator(name="<>", kind=1, prec=4),
    @frege.runtime.Meta.Operator(name="==", kind=2, prec=10),
    @frege.runtime.Meta.Operator(name="=<<", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name="===", kind=2, prec=10),
    @frege.runtime.Meta.Operator(name="==>", kind=1, prec=16),
    @frege.runtime.Meta.Operator(name="compare", kind=2, prec=9),
    @frege.runtime.Meta.Operator(name="@", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name=">>", kind=0, prec=14),
    @frege.runtime.Meta.Operator(name=">", kind=2, prec=8),
    @frege.runtime.Meta.Operator(name="=~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name="=~~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name=">=", kind=2, prec=8),
    @frege.runtime.Meta.Operator(name="><", kind=1, prec=16),
    @frege.runtime.Meta.Operator(name=">=>", kind=1, prec=14),
    @frege.runtime.Meta.Operator(name="??", kind=1, prec=2),
    @frege.runtime.Meta.Operator(name=">>=", kind=0, prec=14),
    @frege.runtime.Meta.Operator(name=">>>", kind=1, prec=16),
    @frege.runtime.Meta.Operator(name="?~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name="bshl", kind=0, prec=5),
    @frege.runtime.Meta.Operator(name="^", kind=1, prec=2),
    @frege.runtime.Meta.Operator(name="\\\\", kind=2, prec=3),
    @frege.runtime.Meta.Operator(name="band", kind=0, prec=6),
    @frege.runtime.Meta.Operator(name="^^", kind=1, prec=12),
    @frege.runtime.Meta.Operator(name="bor", kind=0, prec=7),
    @frege.runtime.Meta.Operator(name="bxor", kind=0, prec=7),
    @frege.runtime.Meta.Operator(name="bshr", kind=0, prec=5),
    @frege.runtime.Meta.Operator(name="catch", kind=0, prec=15),
    @frege.runtime.Meta.Operator(name="rem", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name="mod", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name="elem", kind=2, prec=8),
    @frege.runtime.Meta.Operator(name="div", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name="either", kind=0, prec=15),
    @frege.runtime.Meta.Operator(name="fmap", kind=0, prec=13),
    @frege.runtime.Meta.Operator(name="finally", kind=0, prec=15),
    @frege.runtime.Meta.Operator(name="mappend", kind=1, prec=4),
    @frege.runtime.Meta.Operator(name="on", kind=0, prec=16),
    @frege.runtime.Meta.Operator(name="notElem", kind=2, prec=8),
    @frege.runtime.Meta.Operator(name="mplus", kind=1, prec=4),
    @frege.runtime.Meta.Operator(name="oder", kind=1, prec=12),
    @frege.runtime.Meta.Operator(name="quot", kind=0, prec=3),
    @frege.runtime.Meta.Operator(name="~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name="ushr", kind=0, prec=5),
    @frege.runtime.Meta.Operator(name="und", kind=1, prec=11),
    @frege.runtime.Meta.Operator(name="seq", kind=1, prec=15),
    @frege.runtime.Meta.Operator(name="||", kind=1, prec=12),
    @frege.runtime.Meta.Operator(name="~~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name="~>", kind=0, prec=1),
    @frege.runtime.Meta.Operator(name="~~~", kind=2, prec=2),
    @frege.runtime.Meta.Operator(name="•", kind=1, prec=1)
  },
  imps={
    "frege.prelude.PreludeList", "frege.Prelude", "frege.prelude.PreludeBase",
    "frege.prelude.PreludeArrays", "frege.prelude.PreludeIO", "frege.prelude.PreludeText",
    "frege.prelude.PreludeMonad", "frege.java.util.Regex", "frege.test.QuickCheck"
  },
  nmss={
    "PreludeList", "Prelude", "PreludeBase", "PreludeArrays", "PreludeIO", "PreludeText",
    "PreludeMonad", "Regexp", "QuickCheck"
  },
  symas={}, symcs={}, symis={}, symts={},
  symvs={
    @frege.runtime.Meta.SymV(
      offset=25, name=@frege.runtime.Meta.QName(pack="HelloFrege", base="greeting"), stri="s",
      sig=0, depth=0, rkind=49
    ),
    @frege.runtime.Meta.SymV(
      offset=118, name=@frege.runtime.Meta.QName(pack="HelloFrege", base="main"), stri="s(u)",
      sig=2, depth=1, rkind=49
    ),
    @frege.runtime.Meta.SymV(
      offset=75, name=@frege.runtime.Meta.QName(pack="HelloFrege", base="testLength"), stri="s",
      sig=3, depth=0, rkind=49
    )
  },
  symls={},
  taus={
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={@frege.runtime.Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="StringJ")}
    ),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={@frege.runtime.Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="Char")}
    ),
    @frege.runtime.Meta.Tau(kind=0, suba=0, subb=1),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={@frege.runtime.Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="[]")}
    ),
    @frege.runtime.Meta.Tau(kind=0, suba=3, subb=2),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={@frege.runtime.Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="ST")}
    ),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={
        @frege.runtime.Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="RealWorld")
      }
    ),
    @frege.runtime.Meta.Tau(kind=0, suba=5, subb=6),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={@frege.runtime.Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="()")}
    ),
    @frege.runtime.Meta.Tau(kind=0, suba=7, subb=8),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={@frege.runtime.Meta.QName(kind=0, pack="frege.test.QuickCheckGen", base="Gen")}
    ),
    @frege.runtime.Meta.Tau(
      kind=2, suba=0,
      tcon={
        @frege.runtime.Meta.QName(kind=0, pack="frege.test.QuickCheckProperty", base="Prop")
      }
    ),
    @frege.runtime.Meta.Tau(kind=0, suba=10, subb=11)
  },
  rhos={
    @frege.runtime.Meta.Rho(rhofun=false, rhotau=2),
    @frege.runtime.Meta.Rho(rhofun=false, rhotau=4),
    @frege.runtime.Meta.Rho(rhofun=false, rhotau=9), @frege.runtime.Meta.Rho(sigma=1, rhotau=2),
    @frege.runtime.Meta.Rho(rhofun=false, rhotau=12)
  },
  sigmas={
    @frege.runtime.Meta.Sigma(rho=0), @frege.runtime.Meta.Sigma(rho=1),
    @frege.runtime.Meta.Sigma(rho=3), @frege.runtime.Meta.Sigma(rho=4)
  },
  exprs={@frege.runtime.Meta.Expr()}, kinds={@frege.runtime.Meta.Kind(kind=0)}
)

final public class HelloFrege {
final public static Ĳ ĳ = new Ĳ();
final public static java.lang.String greeting = "Hello Frege";
final public static frege.runtime.Lambda testLength = 
  QuickCheckProperty.once(
        QuickCheckProperty.ITestable_Bool.it,
        new frege.runtime.Delayed() {
          final public java.lang.Object eval() {
            return PreludeBase.TStringJ.length(HelloFrege.greeting) == 11;
          }
        }
      )
;
final public static frege.runtime.Lambda _main(final frege.runtime.Lazy arg$1) {
  return Prelude.println(PreludeText.IShow_String.it, HelloFrege.greeting);
}
@frege.runtime.Meta.FunctionPointers(
  qnames={@frege.runtime.Meta.QName(pack="HelloFrege", base="main")}, jnames={"_mainƒf1a0454"}
)
public static class Ĳ  {
  public Ĳ() {}
  final public static class _mainƒf1a0454 extends frege.runtime.Fun1<frege.runtime.Lambda>  {
    public _mainƒf1a0454() {}
    final public frege.runtime.Lambda eval(final java.lang.Object arg$1) {
      return HelloFrege._main(frege.runtime.Delayed.delayed(arg$1));
    }
    final public static _mainƒf1a0454 inst = new _mainƒf1a0454();
  }
}
public static void main(final java.lang.String[] argv) {
  final long t1 = java.lang.System.nanoTime();
  java.lang.Integer xit = frege.runtime.Runtime.runMain(
    frege.prelude.PreludeBase.TST.performUnsafe(
      Ĳ._mainƒf1a0454.inst.apply(frege.prelude.PreludeBase._toList(argv)).<frege.runtime.Lambda>forced()));
  final long t2 = java.lang.System.nanoTime();
  frege.runtime.Runtime.stderr.get().println(
    "runtime " + ((((t2 - t1) + 500000) / 1000000) / 1e3) + " wallclock seconds.");
  if (xit != null) java.lang.System.exit(xit);
}
}
