package com.august.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AUGUST
 * @description TODO
 * @date 2020/10/26 11:37
 */
@Controller
public class PageController {
    @RequestMapping("index")
    public String toIndex(){
        return "index";
    }
}
