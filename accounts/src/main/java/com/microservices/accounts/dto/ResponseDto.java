package com.microservices.accounts.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMsg;

//    public ResponseDto(String statusCode, String statusMsg) {
//        this.statusCode = statusCode;
//        this.statusMsg = statusMsg;
//    }
}
