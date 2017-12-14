package com.example

import spock.lang.Specification


class WhenUsingRawHtmlHeader extends Specification {
  def setupSpec() {
    reportHeader """setupSpecでreportHeaderメソッドを呼び出しておくことで、
                   |SpecificationのHeaderとして文章を記述できます。@Narrativeで十分な気もしますが。""".stripMargin("|")
    reportHeader "<h2> h2をうめこんで追加することもできます </h2>"
  }

  def "My feature"() {
    expect:
    reportInfo "フィーチャ毎のメモだよ"
    reportInfo "2行目も書けるよ"
  }
}
