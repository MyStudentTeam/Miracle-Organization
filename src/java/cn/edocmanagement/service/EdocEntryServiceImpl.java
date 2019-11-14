package cn.edocmanagement.service;

import cn.edocmanagement.mapper.EdocEntryMapper;
import cn.edocmanagement.pojo.EdocEntry;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EdocEntryServiceImpl {
    @Resource
    private EdocEntryMapper edocEntryMapper;

    //查询所有
    public List<EdocEntry> edoclist(Integer categoryId) {
        return edocEntryMapper.edoclist(categoryId);
    }

    //添加
    public boolean addEdoc(EdocEntry edocEntry) {
        if (edocEntryMapper.addEdoc(edocEntry) > 0) {
            return true;
        }
        return false;
    }

    //修改
    public boolean UpdateEDoc(EdocEntry edocEntry) {
        if (edocEntryMapper.UpdateEDoc(edocEntry) > 0) {
            return true;
        }
        return false;
    }

    //删除
    public boolean deleteEDoc(Integer id) {
        if (edocEntryMapper.deleteEDoc(id) > 0) {
            return true;
        }
        return false;
    }
}
