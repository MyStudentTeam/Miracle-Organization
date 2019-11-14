package cn.edocmanagement.pojo;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Data
public class Workorder {
    private int id;
    private int projectId;
    private String executor;
    private String description;
    private int orderLevel;
    private Date createDate;

}
