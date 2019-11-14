package cn.edocmanagement.controll;

import cn.edocmanagement.pojo.EdocEntry;
import cn.edocmanagement.service.EdocEntryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/edocEntry")
public class EdocEntryController {
    @Resource
    private EdocEntryServiceImpl edocEntryService;

    @RequestMapping(value = "/edoclist")
    public String edoclist(@RequestParam(value = "id", required = false) String id, Model model) {
        Integer _id = Integer.parseInt(id);
        List<EdocEntry> entryList = edocEntryService.edoclist(_id);
        model.addAttribute("entryList", entryList);
        return "index";
    }

}
