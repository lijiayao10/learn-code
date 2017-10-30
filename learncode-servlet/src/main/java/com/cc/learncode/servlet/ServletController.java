/*
 * @author caojiayao 2017年4月10日 下午7:48:26
 */
package com.cc.learncode.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <P>
 * 
 * @author caojiayao
 * @version $Id: ServletController.java, v 0.1 2017年4月10日 下午7:48:26 caojiayao
 *          Exp $
 */
@RestController
public class ServletController {

    private static final Logger logger = LoggerFactory.getLogger(ServletController.class);

    @ResponseBody
    @RequestMapping("/home")
    public String home(@RequestParam("str") String str) {
        logger.info("call");
        return str + "中文aaaa";
    }
}
