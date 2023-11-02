package com.bilgeadam.BABaseApiPlaceholder.repository.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data //@Getter @Setter @ToString hepsini kapsıyor.
@SuperBuilder
@MappedSuperclass
public class BaseEntity implements Serializable {

    private Long createDate;
    private Long updateDate;

}
