package umc.spring.src.web.domain;

import lombok.*;
import umc.spring.src.web.common.BaseEntity;
import umc.spring.src.web.domain.enums.Review_InquiryStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storeIdx")
    private Store store;

    @Column(nullable = false)
    private Integer star;
    @Column(nullable = false)
    private String review_comment;
    @Column(nullable = false,columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private Review_InquiryStatus status;

    @OneToMany(mappedBy = "review",cascade = CascadeType.ALL)
    private List<ReviewPhoto> reviewPhotoList = new ArrayList<>();

}
