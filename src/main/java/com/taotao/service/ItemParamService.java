package com.taotao.service;

import com.taotao.commom.pojo.TaotaoResult;
import com.taotao.pojo.TbItemParam;

/**
 * Created by luxiaoxiao on 2018/4/20
 */
public interface ItemParamService {
    TaotaoResult getItemParamByCid (long cid);
    TaotaoResult insertItemParam(TbItemParam tbItemParam);
}
