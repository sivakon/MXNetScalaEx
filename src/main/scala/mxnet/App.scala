package mxnet

/**
  * @author Sivaram Konanki
  * @note Download opencv@2 on MacOS
  *
  * 1. https://mxnet.apache.org/install/scala_setup.html for Scala setup
  * 2. http://mxnet.incubator.apache.org/tutorials/scala/mxnet_scala_on_intellij.html for IntelliJ Setup
  */

object App extends App {
  import org.apache.mxnet._

  private val a = NDArray.zeros(2, 3)
  println("Testing MXNet by generating 2 * 3 NDArray....")
  println("Shape is: ")
  println(a.shape)
  a.toArray foreach println
}
