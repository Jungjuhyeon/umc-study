package umc.spring.src.web.domain;

import lombok.AllArgsConstructor;
import lombok.*;
import umc.spring.src.web.common.BaseEntity;
import umc.spring.src.web.domain.enums.Gender;
import umc.spring.src.web.domain.enums.UserStatus;
import umc.spring.src.web.mapping.UserFoodCategory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userIdx;

    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
    @Column(nullable = false)
    private String birthday;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String local;
    @Column(nullable = false)
    private String town;
    @Column(nullable = false,columnDefinition = "INT DEFAULT 0")
    private Integer location_check;
    @Column(nullable = false,columnDefinition = "INT DEFAULT 0")
    private Integer marketing_check;

    @Enumerated(EnumType.STRING)
    private UserStatus state;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<UserFoodCategory> userFoodCategoryList = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Point> pointList  = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Mission> missionList  = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Inquiry> inquiryList = new ArrayList<>();






}
