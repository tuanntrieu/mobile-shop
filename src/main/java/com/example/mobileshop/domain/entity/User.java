package com.example.mobileshop.domain.entity;

import com.example.mobileshop.domain.entity.common.DateAuditing;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends DateAuditing {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "username", nullable = false, columnDefinition = "varchar(50)")
    private String username;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(255)")
    private String password;

    @Column(name = "email", nullable = false, columnDefinition = "varchar(80)")
    private String email;

    @Column(name = "name", nullable = true, columnDefinition = "nvarchar(255)")
    private String name;

    @Column(name = "gender", nullable = true, columnDefinition = "bit")
    private Boolean gender;

    @Column(name = "address", nullable = true, columnDefinition = "nvarchar(255)")
    private String address;

    @Column(name = "phone", nullable = true, columnDefinition = "varchar(10)")
    private String phone;

    @Column(name = "login", nullable = false, columnDefinition = "bit")
    private Boolean login;

    @Column(name = "last_login_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;

    @ManyToOne
    @JoinColumn(name = "role_id", foreignKey = @ForeignKey(name = "FK_USER_ROLE"), referencedColumnName = "id")
    private Role role;

    @OneToMany(mappedBy = "createdBy")
    List<FeedBack> feedBacks;

    @OneToMany(mappedBy = "user")
    List<Order> orders;

}
