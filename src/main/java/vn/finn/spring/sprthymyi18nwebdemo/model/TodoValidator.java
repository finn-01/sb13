package vn.finn.spring.sprthymyi18nwebdemo.model;

import org.thymeleaf.util.StringUtils;

import java.util.Optional;

/*
Đối tượng này dùng để kiểm tra xem một Object Todo có hợp lệ không
 */
public class TodoValidator {
    /**
     * Kiểm tra một object Todo có hợp lệ không
     * @param todo
     * @return
     */
    public boolean isInvalid(Todo todo){
        return Optional.ofNullable(todo)
                .filter(todo1 -> !StringUtils.isEmpty(todo1.getTitle()))
                .filter(todo1 -> !StringUtils.isEmpty(todo1.getDetail()))
                .isPresent(); // Trả về true nếu hợp lệ, ngược lại false
    }
}
