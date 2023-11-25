package umc.spring.src.web.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InquiryPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inquiry_photoIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inquiryIdx")
    private Inquiry inquiry;

    @Column(nullable = false)
    private String inquiry_photo_url;

}
