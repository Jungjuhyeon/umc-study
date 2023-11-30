package umc.spring.src.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umc.spring.src.common.BaseEntity;
import umc.spring.src.domain.enums.Review_InquiryStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inquiry extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inquiryIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user;

    @Column(nullable = false)
    private String inquiry_name;
    @Column(nullable = false)
    private String inquiry_detail;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private Review_InquiryStatus status;

    @OneToMany(mappedBy = "inquiry",cascade = CascadeType.ALL)
    private List<InquiryPhoto> inquiryPhotoList = new ArrayList<>();

}
