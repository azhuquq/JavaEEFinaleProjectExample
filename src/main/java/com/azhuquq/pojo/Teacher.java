package com.azhuquq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    private int tid;
    private String tname;
    private String tpassword;
    private int tright;
    private int tflag;
}
