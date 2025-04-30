package java_09_advanced.ch15.sec02.exam01;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private String subject;
    private String content;
    private String writer;
}