package com.efforge.studio.rest.user;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    @Column(name = "user_id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    private String username;

    private String password;

    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on")
    @CreatedDate
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "last_login")
    private Date lastLogin;

}
