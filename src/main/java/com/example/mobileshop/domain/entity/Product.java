package com.example.mobileshop.domain.entity;

import com.example.mobileshop.domain.entity.common.DateAuditing;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends DateAuditing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = true, columnDefinition = "nvarchar(255)")
    private String name;

    @Column(name = "discount")
    private float discount;

    @Column(name = "start_day_discount")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date startDayDiscount;

    @Column(name = "end_day_discount")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date endDayDiscount;

    @Lob
    private String description;


    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<ProductImage> productImages = new HashSet<>();

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<ProductDetail> productDetails = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    List<FeedBack> feedBacks;


}
