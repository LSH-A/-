package honeyBee.buzzyBee.Category;

import honeyBee.buzzyBee.Consultant.domain.Consultant;
import honeyBee.buzzyBee.ConsultantCategory.ConsultantCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    //목록 조회
    @GetMapping("/categories")
    public List<Category> Categories(){
        return categoryService.Categories();
    }

    //상담사 목록 조회
    @GetMapping("/consultants/categories")
    public List<Consultant> ConsultantCategories(Category category){
        return categoryService.ConsultantCategories(category);
    }
}
