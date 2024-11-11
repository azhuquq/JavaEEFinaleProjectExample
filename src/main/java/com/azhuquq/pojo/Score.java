package com.azhuquq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Score {
    private String sid;
    private String cid;
    private int score;
    private int flag;
}
