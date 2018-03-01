package com.xd.wyq.food.medicine.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pengwei
 * 2018/3/1.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/","index"})
    public String index(){
        return "index";
    }

}
