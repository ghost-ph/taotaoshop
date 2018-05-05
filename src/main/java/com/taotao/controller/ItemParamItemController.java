package com.taotao.controller;

import com.taotao.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luxiaoxiao on 2018/4/21
 */
@Controller
public class ItemParamItemController {

    @Autowired
    private ItemParamItemService itemParamItemService;

    @RequestMapping("/showitem/{itemId}")
    public String ShowItemParam(@PathVariable Long itemId, Model model){
        String string = itemParamItemService.getItemParamByItemId(itemId);
        model.addAttribute("itemParam",string);
        return "item";
    }

}
