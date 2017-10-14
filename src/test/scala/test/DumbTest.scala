package test

import org.scalatest.FunSuite

class DumbTest extends FunSuite {
  test("Returns expected length") {
    val o = new Dumb("aa")
    assert(o.length == 2)
  }
}