package com.azhuquq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Timetable {
    private String tid;
    private String cid;
    private String classroom;
    private String classtime;
    private int flag;
}
