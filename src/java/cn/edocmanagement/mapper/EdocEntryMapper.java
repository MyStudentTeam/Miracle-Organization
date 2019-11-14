package cn.edocmanagement.mapper;

import cn.edocmanagement.pojo.EdocEntry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EdocEntryMapper {
    /**
     * 查询所有
     * @param categoryId 分类编号
     * @return 文档列表
     */
    public List<EdocEntry> edoclist(@Param("categoryId") Integer categoryId);

    /**
     * 添加信息
     * @param edocEntry 文档对象
     * @return 影响行数
     */
    public Integer addEdoc(EdocEntry edocEntry);

    /**
     * 修改
     * @param edocEntry 文档对象
     * @return 影响行数
     */
    public Integer UpdateEDoc(EdocEntry edocEntry);

    /**
     * 删除
     * @param id 文档编号
     * @return 影响行数
     */
    public Integer deleteEDoc(@Param("id") Integer id);

    /**
     * 根据id查询文档信息
     * @param id 文档id
     * @return 文档对象
     */
    public EdocEntry  edocEntry(@Param("id") Integer id);
}
