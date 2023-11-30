package umc.spring.src.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umc.spring.src.common.BaseEntity;
import umc.spring.src.domain.enums.PointStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Point extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pointIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "missionIdx")
    private Mission mission;

    @Column(nullable = false)
    private Integer transaction_point;
    @Column(nullable = false)
    private LocalDateTime transaction_day;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PointStatus status;



}
