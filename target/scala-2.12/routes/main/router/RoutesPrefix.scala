
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/newWorkingVersion/Project3/conf/routes
// @DATE:Thu Apr 19 14:43:59 IST 2018


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
