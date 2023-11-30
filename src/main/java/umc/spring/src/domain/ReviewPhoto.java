package umc.spring.src.domain;

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
public class ReviewPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_photoIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewIdx")
    private Review review;

    @Column(nullable = false)
    private String review_photo_url;
}
