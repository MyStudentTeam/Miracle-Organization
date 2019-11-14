import cn.edocmanagement.pojo.EdocCategory;
import cn.edocmanagement.service.CategoryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:applictionContext-Mybatis.xml")
public class test {
    @Resource
    private CategoryServiceImpl categoryService;

    @Test
    public void test01() {
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        System.out.println(categoryList.toString());
    }
}
