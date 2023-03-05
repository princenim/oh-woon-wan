package com.javalot.ohwoonwan.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;


@Entity // This tells Hibernate to make a table out of this class
public class User extends TimestampEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(length = 50, nullable = false)
    private  String name;

    @Column(name="`nick_name`", length = 50, unique = true)
    private String nickName;

    @Column(length = 50, nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(nullable = false, columnDefinition = "TINYINT", length = 1)
    private Boolean gender;

    @Column(name="`is_admin`", columnDefinition = "TINYINT", length = 1)
    @ColumnDefault("false")  // ColumnDefault: create 문에서 default 값을 정해줍니다
    private Boolean isAdmin;

    @Column(name="`is_blocked`", columnDefinition = "TINYINT", length = 1)
    @ColumnDefault("false")
    private Boolean isBlocked;


    public enum BlockReason {
        ABUSE,
        ADVERTISING
    }
    @Column(name="`block_reason`", columnDefinition = "ENUM('ABUSE','ADVERTISING')")
    @Enumerated(EnumType.STRING)
    @ColumnDefault("null")
    private BlockReason blockReason;

    @Column(name="`is_deleted`", columnDefinition = "TINYINT", length = 1)
    @ColumnDefault("false")
    private Boolean isDeleted;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getGender() {
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
