package honeyBee.buzzyBee.Category;

import honeyBee.buzzyBee.ConsultantCategory.ConsultantCategoryRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {

    @Mock
    CategoryRepository categoryRepository;

    @Mock
    ConsultantCategoryRepository consultantCategoryRepository;

    @InjectMocks
    CategoryService categoryService;

    @Test
    @DisplayName("1-1 카테고리 목록 조회")
    void test1() {

    }

    @Test
    @DisplayName("2-1 카테고리별 상담사 목록 조회")
    void test2() {

    }
}