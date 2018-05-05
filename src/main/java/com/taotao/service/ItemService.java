package com.taotao.service;

import com.taotao.commom.pojo.EUDataGridResult;
import com.taotao.commom.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;

/**
 * Created by luxiaoxiao on 2018/4/13
 */
public interface ItemService {
    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);
    TaotaoResult createItem(TbItem item, String desc,String itemParam)throws Exception;
}
