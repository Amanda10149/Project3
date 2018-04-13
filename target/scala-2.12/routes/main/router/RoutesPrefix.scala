
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/Project/conf/routes
// @DATE:Fri Apr 13 11:05:54 IST 2018


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
