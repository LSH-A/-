package honeyBee.buzzyBee.Category;

import honeyBee.buzzyBee.Consultant.domain.Consultant;
import honeyBee.buzzyBee.ConsultantCategory.ConsultantCategory;
import honeyBee.buzzyBee.ConsultantCategory.ConsultantCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final ConsultantCategoryRepository consultantCategoryRepository;

    public CategoryService(CategoryRepository categoryRepository, ConsultantCategoryRepository consultantCategoryRepository) {
        this.categoryRepository = categoryRepository;
        this.consultantCategoryRepository = consultantCategoryRepository;
    }

    //목록 조회
    public List<Category> Categories() {
        return categoryRepository.findAll();
    }

    //상담사 목록 조회
    public List<Consultant> ConsultantCategories(Category category) {
        return consultantCategoryRepository.findByCategory(category);
    }
}
