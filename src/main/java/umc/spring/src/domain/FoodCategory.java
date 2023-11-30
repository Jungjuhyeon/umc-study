package umc.spring.src.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umc.spring.src.common.BaseEntity;
import umc.spring.src.domain.mapping.UserFoodCategory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storeIdx")
    private Store store;

    @Column(nullable = false)
    private String food_type;

    @OneToMany(mappedBy = "foodCategory",cascade = CascadeType.ALL)
    private List<UserFoodCategory> userFoodCategoryList = new ArrayList<>();

}
