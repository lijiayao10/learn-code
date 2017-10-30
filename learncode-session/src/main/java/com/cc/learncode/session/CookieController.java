/*
 * @author caojiayao 2017年9月8日 下午1:59:48
 */
package com.cc.learncode.session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p><p>
 * <P><p>
 * 
 * @author caojiayao
 * @version $Id: CookieController.java, v 0.1 2017年9月8日 下午1:59:48 caojiayao Exp
 *          $
 */
@Controller
public class CookieController {

    @RequestMapping("cookie")
    @ResponseBody
    public String cookie(@RequestParam("browser") String browser, HttpServletRequest request) {

        request.getSession().setAttribute(browser, "test");

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + " : " + cookie.getValue());
            }
        }

        return null;
    }

    @RequestMapping("get")
    @ResponseBody
    public String get(@RequestParam("browser") String browser, HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + " : " + cookie.getValue());
            }
        }

        return (String) request.getSession().getAttribute(browser);
    }
}
