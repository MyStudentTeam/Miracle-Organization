package cn.edocmanagement.util;

import cn.edocmanagement.mapper.EdocCategoryMapper;
import cn.edocmanagement.pojo.EdocCategory;
import cn.edocmanagement.pojo.EdocEntry;
import cn.edocmanagement.service.CategoryServiceImpl;
import cn.edocmanagement.service.EdocEntryServiceImpl;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

/**
 * 初始加载数据
 */
public class InitDataListener implements InitializingBean, ServletContextAware {
    @Resource
    private EdocEntryServiceImpl edocEntryService;
    @Resource
    private CategoryServiceImpl categoryService;

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    //查询页面
    @Override
    public void setServletContext(ServletContext arg0) {
        List<EdocEntry> entryList = edocEntryService.edoclist(0);
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        arg0.setAttribute("categoryList", categoryList);
        arg0.setAttribute("entryList", entryList);
    }

}