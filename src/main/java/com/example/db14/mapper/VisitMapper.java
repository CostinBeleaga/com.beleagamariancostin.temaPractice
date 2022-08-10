package com.example.db14.mapper;

import com.example.db14.dto.VisitDto;
import com.example.db14.model.Visit;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface VisitMapper {
    VisitDto tovisitDto (Visit visit);
}
