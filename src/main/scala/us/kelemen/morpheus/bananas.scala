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

  def Depth(): Int = {
    // recurse the list
      0
  }

  def Top(): T = {
    return items.head
  }

  def Pop(): T = {
    val head = items.head
    items = items.tail
    return head
  }

  def Push(item: T) = {
     items = List(item, items)
  }
}