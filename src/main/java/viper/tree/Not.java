/*
MIT License

Copyright (c) 2016-2019 Andrés Castellanos

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package viper.tree;

import java.io.PrintStream;
import java.util.HashMap;

import viper.misc.CgenSupport;
import viper.misc.Counter;
import viper.misc.SemantErrors;
import viper.misc.SymbolTable;
import viper.misc.Type;


/** Represents a not expression. */
public final class Not extends Expression {

  /** not argument */
  private final Expression e;

  /**
   * Creates a new not expression.
   *
   * @param line node line number
   * @param col node column number
   * @param e not argument.
   */
  public Not(int line, int col, Expression e) {
    super(line, col);
    this.e = e;
  }

  /** {@inheritDoc} */
  @Override
  public void semant(SymbolTable O, HashMap<String, Function> M) {
    // WRITE YOUR CODE HERE
  }

  /** {@inheritDoc} */
  @Override
  public void code(Counter locals, SymbolTable O, PrintStream p) {
    // WRITE YOUR CODE HERE
  }

  /** {@inheritDoc} */
  @Override
  public void dump(PrintStream p, int pad) {
    p.println(pad(pad) + "!");
    e.dump(p, pad + 2);
    p.println(pad(pad) + ":" + getType());
  }

}
