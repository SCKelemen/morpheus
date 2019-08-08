package us.kelemen.morpheus

import matryoshka._
import matryoshka.implicits._


sealed trait Expression {}
case class IndexExpr(left: Expression, right: Expression) extends Expression
case class CallExpr(expr: Expression, next: Expr[]) extends Expression
case class UnaryExpr(ident: String, expr: Expression) extends Expression 
case class BinaryExpr(left: Expression, ident: String, right: Expression) extends Expression
case class ParenExpr(expr: Expression) extends Expression
case class LiteralExpr(value: Literal) extends Expression



sealed trait Literal {}
case class StrLit(value: String) extends Literal
case class IntLit(value: Int) extends Literal
case class Ident(value: String) extends Literal




