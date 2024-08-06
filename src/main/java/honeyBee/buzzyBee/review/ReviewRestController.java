package honeyBee.buzzyBee.review;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewRestController {

    private final ReviewService reviewService;

    public ReviewRestController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
}
