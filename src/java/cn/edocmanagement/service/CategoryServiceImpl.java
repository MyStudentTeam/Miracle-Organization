package cn.edocmanagement.service;

import cn.edocmanagement.mapper.EdocCategoryMapper;
import cn.edocmanagement.mapper.EdocEntryMapper;
import cn.edocmanagement.pojo.EdocCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl {
    @Resource
    private EdocCategoryMapper edocCategoryMapper;

    //查询所有
    public List<EdocCategory> edoceCategorylist() {
        return edocCategoryMapper.edoceCategorylist();
    }
}
