package umc.spring.src.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umc.spring.src.common.BaseEntity;
import umc.spring.src.domain.enums.MissionStauts;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long missionIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storeIdx")
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @Column(nullable = false)
    private Integer reward_point;
    @Column(nullable = false)
    private String remain_day;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,columnDefinition = "VARCHAR(15) DEFAULT 'CHALLENGE'")
    private MissionStauts stauts;

    @OneToMany(mappedBy = "mission",cascade = CascadeType.ALL)
    private List<Point> pointList = new ArrayList<>();

}
