package umc.spring.src.web.mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umc.spring.src.web.common.BaseEntity;
import umc.spring.src.web.domain.FoodCategory;
import umc.spring.src.web.domain.User;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserFoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_foodIdx;

    @ManyToOne
    @JoinColumn(name = "foodIdx")
    private FoodCategory foodCategory;

    @ManyToOne
    @JoinColumn(name = "userIdx")
    private User user;

}
