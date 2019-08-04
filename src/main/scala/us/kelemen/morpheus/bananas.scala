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
sealed trait Token { val token: String}
sealed trait Keyword extends  Token {}

case class Comment(value: String) extends  Token { val token = "//"}


case class Type() extends Keyword { val token = "type"}
case class Switch() extends Keyword { val token = "switch"}
case class Return() extends Keyword { val token = "return"}
case class True() extends Keyword { val token = "true"}
case class False() extends Keyword { val token = "false"}
case class If() extends  Keyword { val token = "if"}
case class Else() extends  Keyword { val token = "else"}
case class Func() extends  Keyword { val token = "func"}
case class Let() extends  Keyword { val token = "let"}