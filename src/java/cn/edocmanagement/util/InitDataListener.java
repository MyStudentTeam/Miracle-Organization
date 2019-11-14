package cn.edocmanagement.util;

import cn.edocmanagement.pojo.EdocEntry;
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

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    //查询页面
    @Override
    public void setServletContext(ServletContext arg0) {
        List<EdocEntry> entryList = edocEntryService.edoclist(0);
        arg0.setAttribute("entryList", entryList);
    }
    //修改页面
    //添加页面
    //删除页面

}