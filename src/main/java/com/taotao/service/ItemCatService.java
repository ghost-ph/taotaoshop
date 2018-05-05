package com.taotao.service;

import com.taotao.commom.pojo.TreeNode;

import java.util.List;

/**
 * Created by luxiaoxiao on 2018/4/17
 */
public interface ItemCatService {
    public List<TreeNode> getItemCatList(long parentId);
}
