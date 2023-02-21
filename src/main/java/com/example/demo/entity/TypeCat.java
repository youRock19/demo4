package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "types")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class TypeCat {
    @Id
    private Integer id;
    @Column(unique = true, nullable = false)
    private String type;
}
