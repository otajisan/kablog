package jp.kablogch

import jp.kablogch.service.RootService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}

@EnableAutoConfiguration
@Controller
@RequestMapping(Array("/"))
class RootController @Autowired()(private val rootService: RootService) {
  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def data = rootService.getPage
}
