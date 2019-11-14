package cn.edocmanagement.mapper;

import cn.edocmanagement.pojo.EdocEntry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EdocEntryMapper {
    //查询所有
    public List<EdocEntry> edoclist(@Param("categoryId") Integer categoryId);

    //添加
    public Integer addEdoc(EdocEntry edocEntry);

    //修改
    public Integer UpdateEDoc(EdocEntry edocEntry);

    //删除
    public Integer deleteEDoc(@Param("id") Integer id);
    //查询单个值
    public EdocEntry  edocEntry(@Param("id") Integer id);
}
