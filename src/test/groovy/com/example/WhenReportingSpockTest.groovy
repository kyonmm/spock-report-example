package com.example

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Unroll


@Narrative("Specification全体を説明するアノテーションとして@Narrativeが使えます。")
class WhenReportingSpockTest extends Specification {

  def "Success Feature Multiply"() {

    when:"テスト対象に対する操作をします"
    def result = Math.multiplyExact(x, y)
    then:"テスト対象を検査します"
    result == z

    where:
    x | y | z
    2 | 2 | 4
    3 | 2 | 6
  }

  @Unroll
  def "UnrollつきSuccess Feature Max(#x , #y => #z)"() {

    when:"テスト対象に対する操作をします"
    def result = Math.max(x, y)
    then:"テスト対象を検査します"
    result == z

    where:
    x | y | z
    1 | 2 | 2
    3 | 1 | 3
  }

  def "Fail Feature Abs"() {

    when:"テスト対象に対する操作をします"
    def result = Math.abs(x)
    then:"テスト対象を検査します"
    result == y

    where:
    x | y
    1 | 1
    -3 | -3
    -1 | -1
  }

  @Unroll
  def "UnrollつきFail Feature Min(#x , #y => #z)"() {

    when:"テスト対象に対する操作をします"
    def result = Math.min(x, y)
    then:"テスト対象を検査します"
    result == z

    where:
    x | y | z
    1 | 2 | 2
    3 | 1 | 3
    3 | 1 | 1
  }

}
