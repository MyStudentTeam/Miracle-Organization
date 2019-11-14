package cn.edocmanagement.mapper;

import cn.edocmanagement.pojo.EdocCategory;

import java.util.List;

public interface EdocCategoryMapper {

    /**
     * 查询所有分类信息
     * @return 分类列表
     */
    public List<EdocCategory> edoceCategorylist();
}
