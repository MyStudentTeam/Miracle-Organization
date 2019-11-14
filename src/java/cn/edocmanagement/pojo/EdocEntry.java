package cn.edocmanagement.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Data
public class EdocEntry {
    private Integer id;
    private Integer categoryId;
    private String title;
    private String summary;
    private String uploaduser;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    private String time;
}
