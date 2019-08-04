package us.kelemen.morpheus

import scalaz.\/

class db {

}

case class ProfF[T](
                     name: String,
                     year: Int,
                     students: List[T]
                   )





case class Prof[Fix[_]](value: Fix[Prof[Fix]])
case class IdProf[Fix[_], IdType](id: IdType, value:  Fix[IdProf[Fix, IdType]])


case class Fix[F[_]](unfix: F[Fix[F]])
case class Cofree[F[_], A](head: A, tail: F[Cofree[F,A]])
case class Free[F[_], A](resume: A \/ F[Free[F,A]])


case class Functor[F](item: F)

class f {
  def readNode(id: Int): Int = {
    1
  }
}


class SpaceLaser {
  def Scan(): Unit = {
    
  }
}