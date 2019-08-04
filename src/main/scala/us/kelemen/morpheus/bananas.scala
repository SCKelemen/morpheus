package us.kelemen.morpheus

import matryoshka._
import matryoshka.implicits._

class bananas {

}


//  catamorph (f a ) -> a  | anamorph a -> (f a)

/// morph types


// folds -> tears down a structure
/*

catamorph
prepromorph
paramorph
zygomorph


 */

// unfolds -> builds a structure
/*

anamorph
postpromorph
apomorph
g apomorph

 */

case class List[T](head: T, tail: List[T])

class Stack[T](list: List[T]) {
  var items: List[T] = list
  var count: Int = 0

  def Depth(): Int = {
    count
  }

  def Top(): T = {
    return items.head
  }

  def Pop(): T = {
    val head = items.head

    items = items.tail
    count -= 1

    return head
  }

  def Push(item: T) = {
    items = List(item, items)
    count += 1
  }
}


class Queue[T](list: List[T] ) {
  var items: List[T] = list
  var count: Int = 0

  def Enqueue(item: T) = {
    items = List(item, items)
    count +=1

  }

  def Dequeue(item: T) = {

  }

}



case class Branch() extends Expression



sealed trait Expression {}

sealed trait Statement {}


sealed trait TokenKind { val token: String}
sealed trait Keyword extends  TokenKind {}

case class EOF() extends TokenKind { val token = ""}

case class Identity() extends TokenKind { val token = ""}
case class Integer()  extends TokenKind { val  token = ""}

case class LBrack() extends TokenKind { val token = "["}
case class RBrack() extends TokenKind { val token = "]"}
case class LBrace() extends TokenKind { val token = "{"}
case class RBrace() extends TokenKind { val token = "}"}
case class LParen() extends TokenKind { val token = "("}
case class RParen() extends TokenKind { val token = ")"}
case class LChev()  extends TokenKind { val token = "<"}
case class RChev()  extends TokenKind { val token = ">"}

case class Dot()    extends TokenKind { val token = "."}
case class Comma()  extends TokenKind { val token = ","}
case class Semi()   extends TokenKind { val token = ";"}
case class Colon()  extends TokenKind { val token = ":"}

case class Eql()    extends TokenKind { val token = "=="}
case class Neql()   extends TokenKind { val token = "!="}
case class Assign() extends TokenKind { val token = "="}

case class Pipe() extends TokenKind { val token = "|"}
case class Bang() extends TokenKind { val token = "!"}
case class Amp()  extends TokenKind { val token = "&"}

case class Neg()  extends TokenKind { val token = "-"}
case class Sum()  extends TokenKind { val token = "+"}
case class Mul()  extends TokenKind { val token = "*"}
case class Quo()  extends TokenKind { val token = "/"}

case class Type() extends Keyword { val token = "type"}
case class Switch() extends Keyword { val token = "switch"}
case class Return() extends Keyword { val token = "return"}
case class True() extends Keyword { val token = "true"}
case class False() extends Keyword { val token = "false"}
case class If() extends  Keyword { val token = "if"}
case class Else() extends  Keyword { val token = "else"}
case class Func() extends  Keyword { val token = "func"}
case class Let() extends  Keyword { val token = "let"}


case class Token(kind: TokenKind, value: String)


