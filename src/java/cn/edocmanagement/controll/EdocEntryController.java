package cn.edocmanagement.controll;

import cn.edocmanagement.pojo.EdocCategory;
import cn.edocmanagement.pojo.EdocEntry;
import cn.edocmanagement.service.CategoryServiceImpl;
import cn.edocmanagement.service.EdocEntryServiceImpl;
import cn.edocmanagement.util.JsonMsg;
import cn.edocmanagement.util.Tool;
import javafx.scene.chart.PieChart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/edocEntry")
public class EdocEntryController {

    @Resource
    private EdocEntryServiceImpl edocEntryService;
    @Resource
    private CategoryServiceImpl categoryService;

    //查询所有
    @RequestMapping(value = "/edoclist", method = RequestMethod.GET)
    public String edoclist(@RequestParam(value = "categoryId", required = false) String id, Model model) {
        Integer _id = 0;
        if (id == "" || id == null) {
            _id = 0;
        } else {
            _id = Integer.parseInt(id);
        }
        List<EdocEntry> entryList = edocEntryService.edoclist(_id);
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("entryList", entryList);
        return "index";
    }

    //打开添加
    @RequestMapping(value = "/openAddList")
    public String openaddList(Model model) {
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        model.addAttribute("categoryList", categoryList);
        return "addinfo";
    }

    //执行添加
    @RequestMapping(value = "/addlist", method = RequestMethod.POST)
    public String addList(EdocEntry edocEntry) {
        System.out.println(edocEntry.toString());
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        edocEntry.setTime(simpleDateFormat.format(edocEntry.getCreateDate()));
        model.addAttribute("edocEntry", edocEntry);
        List<EdocCategory> categoryList = categoryService.edoceCategorylist();
        model.addAttribute("categoryList", categoryList);
        return "update";
    }

    //执行修改页面
    @RequestMapping(value = "/update")
    public String update(EdocEntry edocEntry, HttpServletResponse response) {
        System.out.println(edocEntry);
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
    @ResponseBody
    public JsonMsg delete(@RequestParam(value = "entryid") Integer id) {
        System.out.println(id + "awdawdaw");
        if (edocEntryService.deleteEDoc(id)) {
            System.out.println("执行成功");
            return JsonMsg.success();
        } else {
            System.out.println("执行失败");
            return JsonMsg.fail().addInfo("del_error", "删除失败");
        }
    }
}
