package com.example.db14.dto;
import com.example.db14.model.Visit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitDto {

    String date;

    public VisitDto(Visit visit) {
        this.date = visit.getDate();
    }
}
