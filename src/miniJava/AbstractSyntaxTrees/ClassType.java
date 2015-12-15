/**
 * miniJava Abstract Syntax Tree classes
 * @author prins
 * @version COMP 520 (v2.2)
 */
package miniJava.AbstractSyntaxTrees;

import miniJava.SyntacticAnalyzer.SourcePosition;

public class ClassType extends Type {
    public ClassType(Identifier cn, SourcePosition posn) {
        super(TypeKind.CLASS, posn);
        className = cn;
    }

    public <A, R> R visit(Visitor<A, R> v, A o) {
        return v.visitClassType(this, o);
    }

    public String toString() {
        return "Class " + className.spelling;
    }

    public Identifier className;
}
