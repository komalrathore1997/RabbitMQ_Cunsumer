package com.demo.SpringBoot_RabbitMQ.config;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage implements Serializable{

    private String messageId;
    private String message;
    private Date messageDate;

}