package cn.edocmanagement.controll;

import cn.edocmanagement.pojo.EdocCategory;
import cn.edocmanagement.pojo.EdocEntry;
import cn.edocmanagement.service.CategoryServiceImpl;
import cn.edocmanagement.service.EdocEntryServiceImpl;
import cn.edocmanagement.util.JsonMsg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/edocEntry")
public class EdocEntryController {

    @Resource
    private EdocEntryServiceImpl edocEntryService;
    @Resource
    private CategoryServiceImpl categoryService;

    //查询所有
    @RequestMapping(value = "/edoclist")
    public String edoclist(@RequestParam(value = "id", required = false) String id, Model model) {
        Integer _id = Integer.parseInt(id);
        List<EdocEntry> entryList = edocEntryService.edoclist(_id);
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("entryList", entryList);
        return "index";
    }

    //打开添加
    @RequestMapping(value = "/openAddList")
    public String openaddList() {
        return "addinfo";
    }

    //执行添加
    @RequestMapping(value = "/addlist")
    public String addList(EdocEntry edocEntry, HttpServletResponse response) {
        if (edocEntryService.addEdoc(edocEntry)) {
            System.out.println("添加成功");
            //重定向 到列表页面
            return "redirect:/edocEntry/edoclist";
        }
        return "addinfo";

    }

    //打开修改
    @RequestMapping(value = "/openupdate")
    public String openupdate(@RequestParam(value = "id", required = false) Integer id, Model model) {
        //查询单个值
        EdocEntry edocEntry = edocEntryService.edocEntry(id);
        model.addAttribute("edocEntry", edocEntry);
        return "update";
    }

    //执行修改页面
    @RequestMapping(value = "/update")
    public String update(EdocEntry edocEntry) {
        if (edocEntryService.UpdateEDoc(edocEntry)) {
            System.out.println("修改成功");
            //重定向 到列表页面
            return "redirect:/edocEntry/edoclist";
        }
        return "update";
    }

    //
    //执行修改删除
    @RequestMapping(value = "/delete")
    public JsonMsg delete(@RequestParam(value = "id", required = false) Integer id) {
        if (edocEntryService.deleteEDoc(id)) {
            System.out.println("执行成功");

            return JsonMsg.success().addInfo("ok", "删除成功");
        } else {

            System.out.println("执行失败");
            return JsonMsg.fail().addInfo("upd_error", "删除失败");
        }
    }
}
