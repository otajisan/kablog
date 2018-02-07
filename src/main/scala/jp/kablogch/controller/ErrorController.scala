package jp.kablogch.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@EnableAutoConfiguration
@Controller
@RequestMapping(Array("/error"))
class ErrorController @Autowired()() {
  @RequestMapping(value = Array("/error"), method = Array(RequestMethod.GET))
  def data(): String = {
    return "404"
  }
}
