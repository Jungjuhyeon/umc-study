package umc.spring.src.domain;

import lombok.*;
import umc.spring.src.common.BaseEntity;
import umc.spring.src.domain.enums.StoreStatus;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeIdx;
    @Column(nullable = false)
    private String store_name;
    @Column(nullable = false)
    private String store_open;
    @Column(nullable = false)
    private String store_close;
    @Column(nullable = false)
    private String store_phone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,columnDefinition = "VARCHAR(15) DEFAULT 'OPEN'")
    private StoreStatus status;

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private List<Mission> missionList = new ArrayList<>();

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private List<Menu> menuList = new ArrayList<>();

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private List<FoodCategory> foodCategoryList = new ArrayList<>();

}
