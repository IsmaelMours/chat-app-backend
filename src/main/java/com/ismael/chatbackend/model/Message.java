package com.ismael.chatbackend.model;

import lombok.*;
import java.util.Date;
import java.io.ObjectInputFilter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String date;

    private Status status;
}
