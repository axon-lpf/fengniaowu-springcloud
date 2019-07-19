package com.fengniaowu.springcloud.entities;

import java.util.Date;

import lombok.Data;

@Data
public class BaseEntitiy {

    public boolean Enabled;
    
    public Date CreateTime;

    public Date UpdateTime; 
}
