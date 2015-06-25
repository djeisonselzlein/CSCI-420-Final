package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

  public ForCommand (Identifier i, Expression e1, Expression e2, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    ID = i;
    E1 = e1;
    E2 = e2;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  public Expression E1;
  public Expression E2;
  public Identifier ID;
  public Command C;
}
