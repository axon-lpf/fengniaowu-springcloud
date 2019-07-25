package com.fengniaowu.springcloud.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BaseEntitiy {

    public boolean Enabled;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
    public Date CreateTime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
    public Date UpdateTime; 
}
