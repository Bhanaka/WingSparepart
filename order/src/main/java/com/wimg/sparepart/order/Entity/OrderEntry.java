package com.wimg.sparepart.order.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "orderEntry")
public class OrderEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long orderCode ;
    @Column
    private Long productCode ;
    @Column
    private Double price ;
}
