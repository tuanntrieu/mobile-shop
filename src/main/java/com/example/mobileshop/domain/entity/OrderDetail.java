package com.example.mobileshop.domain.entity;

import com.example.mobileshop.domain.entity.common.DateAuditing;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail extends DateAuditing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Double discount;

    private Long price;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "product_detail_id",referencedColumnName = "id")
    private ProductDetail product_detail;

    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "id")
    private Order orders;



}
