/* Generated By:JJTree: Do not edit this line. ASTTreatExpr.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTTreatExpr extends SimpleNode {
  public ASTTreatExpr(int id) {
    super(id);
  }

  public ASTTreatExpr(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}