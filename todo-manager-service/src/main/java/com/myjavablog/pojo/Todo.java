package com.myjavablog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable{

    private int id;
    private String taskName;
    private String taskDesc;
    private String status;


}
