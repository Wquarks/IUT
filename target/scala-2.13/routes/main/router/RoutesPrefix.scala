// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/William/Desktop/play/play-java-seed/conf/routes
// @DATE:Thu May 07 15:59:00 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
