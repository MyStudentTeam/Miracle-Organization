package cn.edocmanagement.pojo;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
@Data
public class EdocEntry {
    private int id;
    private int categoryId;
    private String title;
    private String summary;
    private String uploaduser;
    private Date createDate;
}
