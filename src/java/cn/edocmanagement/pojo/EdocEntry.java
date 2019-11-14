package cn.edocmanagement.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;
@Data
public class EdocEntry {
    private Integer id;                     //编号
    private Integer categoryId;             //分类编号
    private String title;                   //标题
    private String summary;                 // 摘要
    private String uploaduser;              //上传人
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;                //创建时间
}
